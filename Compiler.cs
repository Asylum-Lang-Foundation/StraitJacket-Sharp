using System;
using System.Collections.Generic;
using System.IO;
using Antlr4.Runtime;
using LLVMSharp.Interop;
using StraitJacket.AST;
using StraitJacket.Builder;
using StraitJacket.Constructs;

/*

    Ok, here's a brief overview on how the compiler works:

    1. Feed List Of Files - Give the compiler a list of files to compile. Each file will get its own bitcode (.bc) file.
    2. Read AST For Types - The compiler will read the AST from ANTLR4 to get a list of all the types and the scopes they are present in.
    3. Read AST For Code - Compiler reads the AST once again in order to look for implementation. It is necessary to scan types first so that way functions can be stored correctly and checked.
    4. Move Variable Declarations - LLVM requires that variables allocated with alloca be at the top of the function.
    5. Resolve Variables - This will get the names into actual references to variables and convert function names into a list of potentially callable functions.
    6. Reolve Types - Evaluate result types of expressions and call the appropriate functions.
    7. Generate Code - Use LLVM to convert the abstract representation into working code modules.
    8. Optimize & Link Code - Convert code to final executable after optimizing and linking. Either native executables or invokers are supported.

*/
namespace StraitJacket {

    // Compilation flags.
    public class CompilationFlags {

        // Use the C standard library.
        public bool UseSTDC;

        // Use the C++ standard library.
        public bool UseSTDCPP;

        // Root directory.
        public string RootDir;

    }

    // A compiler.
    public class Compiler {
        Visitor visitor;
        string rootFolder;
        string compilerRoot = "./"; //AppContext.BaseDirectory;
        List<string> files = new List<string>();

        // Initialize the ANTLR4 visitor.
        public Compiler() {
            visitor = new Visitor();
        }

        // Visit mode for the AST.
        public enum VisitMode {

            // Scan for typedefs and struct definitions.
            GetTypes,

            // Scan for functions, calls, expressions, etc.
            GetCode

        }

        // Visit a file.
        private Constructs.AST VisitFile(Stream s, VisitMode mode) {
            AntlrInputStream input = new AntlrInputStream(s);
            AsylumLexer lexer = new AsylumLexer(input);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            AsylumParser parser = new AsylumParser(commonTokenStream);
            visitor.CTX.VisitMode = mode;
            var initContext = parser.init();
            return visitor.VisitInit(initContext)?.AST;
        }

        // Visit a file to be compiled.
        private Constructs.AST VisitFile(string s, VisitMode mode) {
            Constructs.AST ret;
            using (StreamReader fileStream = new StreamReader(s)) {
                ErrorHandler.CurrentFileName = s;
                ret = VisitFile(fileStream.BaseStream, mode);
                ErrorHandler.CurrentFileName = "NULL FILE";
            }
            return ret;
        }

        // Set root folder.
        public void SetRootFolder(string folderPath) {
            rootFolder = folderPath;
        }

        // Add a file.
        public void AddFile(string filePath) {
            if (files.Contains(filePath)) {
                Console.ForegroundColor = ConsoleColor.Red;
                Console.WriteLine("ERROR: You can't pass the same file to be compiled twice, that's insane!");
                Console.ForegroundColor = ConsoleColor.White;
                Environment.Exit(0);
            }
            files.Add(filePath);
        }

        public Dictionary<string, LLVMModuleRef> BuilderTest(CompilationFlags flags) {

            // For each mode.
            foreach (VisitMode mode in Enum.GetValues(typeof(VisitMode))) {

                // Compile EASL.
                visitor.CTX.UniversalMode = true;
                visitor.CTX.ModuleName = "EASL";
                VisitFile(compilerRoot + "/EASL/Types.asy", mode);
                VisitFile(compilerRoot + "/EASL/Console.asy", mode);
                //VisitFile(compilerRoot + "/EASL/Unsigned.asy", mode);
                if (flags.UseSTDC) {
                    foreach (var f in Directory.EnumerateFiles(compilerRoot + "EASL/STD/C")) {
                        VisitFile(f, mode);
                    }
                } else {
                    foreach (var f in Directory.EnumerateFiles(compilerRoot + "EASL/STD/C-ASYLUM")) {
                        VisitFile(f, mode);
                    }
                }
                if (flags.UseSTDCPP) {
                    foreach (var f in Directory.EnumerateFiles(compilerRoot + "EASL/STD/CPP")) {
                        VisitFile(f, mode);
                    }
                } else {
                    foreach (var f in Directory.EnumerateFiles(compilerRoot + "EASL/STD/CPP-ASYLUM")) {
                        VisitFile(f, mode);
                    }
                }
                if (mode != VisitMode.GetTypes) visitor.CTX.UniversalMode = false;
            }

            Builder.Builder b = new Builder.Builder(visitor.CTX.UniversalAST, visitor.CTX.CurrentScope, visitor.scopeNum);
            b.BeginFile("Dummy.asy");
            b.BeginFunction("main", new VarTypeSimplePrimitive(SimplePrimitives.Void), new List<VarParameter>());
            b.Code(new ExpressionCall(
                new ExpressionVariable(new VariableOrFunction() { Path = "println", Scope = b.Scope() }),
                new ExpressionComma(new List<Expression>() {
                    new ExpressionConstStringPtr("Hello World!")
                })
            ));
            b.EndFunction();
            b.EndFile();
            return b.Compile();

        }

        // Go through the compilation process.
        public void Compile(CompilationFlags flags) {

            // For each mode.
            foreach (VisitMode mode in Enum.GetValues(typeof(VisitMode))) {

                // Compile EASL.
                visitor.CTX.UniversalMode = true;
                visitor.CTX.ModuleName = "EASL";
                VisitFile(compilerRoot + "/EASL/Types.asy", mode);
                VisitFile(compilerRoot + "/EASL/Console.asy", mode);
                //VisitFile(compilerRoot + "/EASL/Unsigned.asy", mode);
                if (flags.UseSTDC) {
                    foreach (var f in Directory.EnumerateFiles(compilerRoot + "EASL/STD/C")) {
                        VisitFile(f, mode);
                    }
                } else {
                    foreach (var f in Directory.EnumerateFiles(compilerRoot + "EASL/STD/C-ASYLUM")) {
                        VisitFile(f, mode);
                    }
                }
                if (flags.UseSTDCPP) {
                    foreach (var f in Directory.EnumerateFiles(compilerRoot + "EASL/STD/CPP")) {
                        VisitFile(f, mode);
                    }
                } else {
                    foreach (var f in Directory.EnumerateFiles(compilerRoot + "EASL/STD/CPP-ASYLUM")) {
                        VisitFile(f, mode);
                    }
                }
                if (mode != VisitMode.GetTypes) visitor.CTX.UniversalMode = false;

                // Compile our modules.
                if (mode != VisitMode.GetCode) {

                    // Just scan for each file.
                    foreach (var s in files) {
                        visitor.CTX.ModuleName = rootFolder + "/" + s;
                        VisitFile(rootFolder + "/" + s, mode);
                    }

                } else {

                    // Do the universal AST for EASL.
                    var univAST = visitor.CTX.UniversalAST;
                    univAST.PrepareForCompilation();
                    LLVMModuleRef univMod = univAST.Compile("EASL", rootFolder);
                    //univMod.Verify(LLVMVerifierFailureAction.LLVMPrintMessageAction);
                    univMod.WriteBitcodeToFile(rootFolder + "/obj/EASL.bc");

                    // Now it's time to do the actual compiling.
                    foreach (var s in files) {

                        // Fetch the AST, then do the necessary resolutions/adjustments.
                        visitor.CTX.ModuleName = rootFolder + "/" + s;
                        var ast = VisitFile(rootFolder + "/" + s, mode);
                        ast.PrepareForCompilation();

                        // Make sure no error was encountered.
                        if (!ErrorHandler.Valid) return;

                        // Compile the file and output to a file.
                        LLVMModuleRef mod = ast.Compile(s, rootFolder);
                        mod.Verify(LLVMVerifierFailureAction.LLVMPrintMessageAction);
                        Directory.CreateDirectory(rootFolder + "/obj/" + Path.GetDirectoryName(s));
                        mod.WriteBitcodeToFile(rootFolder + "/obj/" + Path.GetFileNameWithoutExtension(s) + ".bc");

                    }

                }

            }

            // Optimize and link executable.
            // TODO!!!

        }

    }

}
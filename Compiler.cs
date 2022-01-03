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

        // Visit a file.
        private void VisitFile(Stream s) {
            AntlrInputStream input = new AntlrInputStream(s);
            AsylumLexer lexer = new AsylumLexer(input);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            AsylumParser parser = new AsylumParser(commonTokenStream);
            var initContext = parser.init();
            visitor.VisitInit(initContext);
        }

        // Visit a file to be compiled.
        private void VisitFile(string s) {
            using (StreamReader fileStream = new StreamReader(s)) {
                ErrorHandler.CurrentFileName = s;
                VisitFile(fileStream.BaseStream);
                ErrorHandler.CurrentFileName = "NULL FILE";
            }
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

        // Go through the compilation process.
        public void Compile(CompilationFlags flags) {

            // Compile EASL.
            visitor.Builder.BeginFile("EASL");
            VisitFile(compilerRoot + "/EASL/Types.asy");
            VisitFile(compilerRoot + "/EASL/Console.asy");
            //VisitFile(compilerRoot + "/EASL/Unsigned.asy", mode);
            if (flags.UseSTDC) {
                foreach (var f in Directory.EnumerateFiles(compilerRoot + "EASL/STD/C")) {
                    VisitFile(f);
                }
            } else {
                foreach (var f in Directory.EnumerateFiles(compilerRoot + "EASL/STD/C-ASYLUM")) {
                    VisitFile(f);
                }
            }
            if (flags.UseSTDCPP) {
                foreach (var f in Directory.EnumerateFiles(compilerRoot + "EASL/STD/CPP")) {
                    VisitFile(f);
                }
            } else {
                foreach (var f in Directory.EnumerateFiles(compilerRoot + "EASL/STD/CPP-ASYLUM")) {
                    VisitFile(f);
                }
            }

            // Build each file.
            visitor.Builder.EndFile();
            foreach (var s in files) {

                // Visiting.
                visitor.Builder.BeginFile(rootFolder + "/" + s);
                VisitFile(rootFolder + "/" + s);
                visitor.Builder.EndFile();

            }

            // Make sure no error was encountered.
            if (!ErrorHandler.Valid) return;

            // Time to compile.
            var compiled = visitor.Builder.Compile();
            compiled["EASL"].WriteBitcodeToFile(rootFolder + "/obj/EASL.bc");
            foreach (var s in files) {
                Directory.CreateDirectory(rootFolder + "/obj/" + Path.GetDirectoryName(s));
                LLVMModuleRef mod = compiled[rootFolder + "/" + s];
                mod.WriteBitcodeToFile(rootFolder + "/obj/" + Path.GetFileNameWithoutExtension(s) + ".bc");
            }

            // TODO: OPTIMIZE AND LINK!!!

        }

    }

}
using System;
using System.IO;
using Antlr4.Runtime;
using LLVMSharp.Interop;
using StraitJacket.AST;
using StraitJacket.Constructs;

namespace StraitJacket {

    // A compiler.
    public class Compiler {
        Visitor visitor;

        // Initialize the ANTLR4 visitor.
        public Compiler() {
            visitor = new Visitor();
        }

        // Add a file to be compiled.
        public void AddFile(Stream s) {
            AntlrInputStream input = new AntlrInputStream(s);
            AsylumLexer lexer = new AsylumLexer(input);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            AsylumParser parser = new AsylumParser(commonTokenStream);
            visitor.VisitInit(parser.init());
        }

        // Add a file to be compiled.
        public void AddFile(string s) {
            using (StreamReader fileStream = new StreamReader(s)) {
                ErrorHandler.CurrentFileName = s;
                AddFile(fileStream.BaseStream);
                ErrorHandler.CurrentFileName = "NULL FILE";
            }
        }

        // Go through the compilation process.
        public LLVMModuleRef Compile(string name) {
            Constructs.AST ast = visitor.CTX.AST;
            ast.MoveVariableDefinitions();
            ast.ResolveVariables();
            ast.ResolveCalls();
            ast.ResolveTypes();
            if (!ErrorHandler.Valid) return null;
            return ast.Compile(name);
        }

    }

}
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

        public Compiler() {
            visitor = new Visitor();
        }

        public void AddFile(Stream s) {
            AntlrInputStream input = new AntlrInputStream(s);
            AsylumLexer lexer = new AsylumLexer(input);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            AsylumParser parser = new AsylumParser(commonTokenStream);
            visitor.VisitInit(parser.init());
        }

        public void AddFile(string s) {
            using (StreamReader fileStream = new StreamReader(s)) {
                AddFile(fileStream.BaseStream);
            }
        }

        public LLVMModuleRef Compile(string name) {
            Constructs.AST ast = visitor.CTX.AST;
            ast.MoveVariableDefinitions();
            ast.ResolveVariables();
            ast.ResolveCalls();
            ast.ResolveTypes();
            var h = ast.Universals[1].Item2.Function.ToString();
            return ast.Compile(name);
        }

    }

}
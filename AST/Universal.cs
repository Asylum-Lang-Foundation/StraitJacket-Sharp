using System;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using LLVMSharp;
using StraitJacket.Constructs;

namespace StraitJacket.AST {

    public partial class Visitor : IAsylumVisitor<AsylumVisitResult> {
        public BuildContext CTX = new BuildContext();
        int scopeNum = 0;

        public AsylumVisitResult VisitInit([NotNull] AsylumParser.InitContext context)
        {
            if (CTX.VisitMode == Compiler.VisitMode.GetCode) {
                if (CTX.UniversalMode) {
                    CTX.CurrentAST = CTX.UniversalAST; // This works, as C# is reference based and doesn't copy.
                } else {
                    CTX.CurrentAST = new Constructs.AST();
                }
            }
            for (int i = 0; i < context.universal_statement().Length; i++) {
                context.universal_statement()[i].Accept(this);
            }
            return CTX.VisitMode == Compiler.VisitMode.GetCode ? new AsylumVisitResult() { AST = CTX.CurrentAST } : null;
        }

        public AsylumVisitResult VisitUniversalExternFunction([NotNull] AsylumParser.UniversalExternFunctionContext context)
        {
            if (CTX.VisitMode != Compiler.VisitMode.GetCode) return null;
            var ret = context.extern_function_definition().Accept(this);
            CTX.CurrentAST.Universals.Add(ret.Function);
            return ret;
        }

        public AsylumVisitResult VisitUniversalFunction([NotNull] AsylumParser.UniversalFunctionContext context)
        {
            if (CTX.VisitMode != Compiler.VisitMode.GetCode) return null;
            var ret = context.function_definition().Accept(this);
            CTX.CurrentAST.Universals.Add(ret.Function);
            return ret;
        }

        public AsylumVisitResult VisitUniversalTypedef([NotNull] AsylumParser.UniversalTypedefContext context)
        {
            if (CTX.VisitMode != Compiler.VisitMode.GetTypes) return null;
            return context.typedef_definition().Accept(this);
        }

        public AsylumVisitResult VisitUniversalImplementation([NotNull] AsylumParser.UniversalImplementationContext context)
        {
            if (CTX.VisitMode != Compiler.VisitMode.GetCode) return null;
            var ret = context.implementation_definition().Accept(this);
            CTX.CurrentAST.Universals.Add(ret.Implementation);
            return ret;
        }

        public void EnterScope(string name = "", bool allowConflict = false) {
            var scope = CTX.CurrentScope;
            if (name == "") {
                name = "%?%_" + scopeNum++;
            }
            if (scope.Children.ContainsKey(name)) {
                if (allowConflict) {
                    CTX.CurrentScope = scope.Children[name];
                } else {
                    throw new Exception("INVALID SCOPE!!!");
                }
            } else {
                scope.Children.Add(name, new Scope());
                CTX.CurrentScope = scope.Children[name];
                CTX.CurrentScope.Parent = scope;
            }
        }

        public void ExitScope() {
            CTX.CurrentScope = CTX.CurrentScope.Parent;
        }

    }

}
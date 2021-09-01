using System;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using LLVMSharp;
using StraitJacket.Constructs;

namespace StraitJacket.AST {

    public partial class Visitor : IAsylumVisitor<AsylumVisitResult> {
        int scopeNum = 0;

        public AsylumVisitResult VisitUniversalExternFunction([NotNull] AsylumParser.UniversalExternFunctionContext context)
        {
            var ret = context.extern_function_definition().Accept(this);
            CTX.AST.Universals.Add(new Tuple<UniversalType, AsylumVisitResult>(UniversalType.ExternFunction, ret));
            return ret;
        }

        public AsylumVisitResult VisitUniversalFunction([NotNull] AsylumParser.UniversalFunctionContext context)
        {
            var ret = context.function_definition().Accept(this);
            CTX.AST.Universals.Add(new Tuple<UniversalType, AsylumVisitResult>(UniversalType.Function, ret));
            return ret;
        }

        public AsylumVisitResult VisitUniversalTypedef([NotNull] AsylumParser.UniversalTypedefContext context)
        {
            return context.typedef_definition().Accept(this);
        }

        public AsylumVisitResult VisitUniversalImplementation([NotNull] AsylumParser.UniversalImplementationContext context)
        {
            var ret = context.implementation_definition().Accept(this);
            CTX.AST.Universals.Add(new Tuple<UniversalType, AsylumVisitResult>(UniversalType.Implementation, ret));
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
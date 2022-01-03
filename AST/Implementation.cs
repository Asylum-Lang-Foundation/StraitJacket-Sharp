using System;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using LLVMSharp;
using StraitJacket.Constructs;

namespace StraitJacket.AST {

    public partial class Visitor : IAsylumVisitor<AsylumVisitResult> {

        public AsylumVisitResult VisitImplementation_definition([NotNull] AsylumParser.Implementation_definitionContext context)
        {
            throw new System.NotImplementedException();
            /*var ret = new Implementation();
            ret.Type = CTX.CurrentScope.ResolveType(context.variable_or_function().Accept(this).VariableOrFunction);
            if (context.variable_type() != null) {
                ret.InterfaceToImplement = context.variable_type().Accept(this).VariableType;
            }
            CTX.Implementation = ret;
            EnterScope(Mangler.MangleType(ret.Type));
            foreach (var e in context.implementation_entry()) {
                e.Accept(this);
            }
            ExitScope();
            CTX.Implementation = null;
            return new AsylumVisitResult() { Implementation = ret };*/
        }

        public AsylumVisitResult VisitImplementationEntryCast([NotNull] AsylumParser.ImplementationEntryCastContext context)
        {
            throw new System.NotImplementedException();
            /*var ret = context.cast_definition().Accept(this).Function;
            //CTX.Implementation.cast.Add(ret.Name, ret); // TODO: PROPER NAME MANGLING!!!
            return null;*/
        }

        public AsylumVisitResult VisitImplementationEntryConstructor([NotNull] AsylumParser.ImplementationEntryConstructorContext context)
        {
            throw new System.NotImplementedException();
            /*var ret = context.constructor_definition().Accept(this).Function;
            CTX.Implementation.Functions.Add(ret.ToString(), ret);
            return null;*/
        }

        public AsylumVisitResult VisitImplementationEntryFunction([NotNull] AsylumParser.ImplementationEntryFunctionContext context)
        {
            throw new System.NotImplementedException();
            /*var ret = context.function_definition().Accept(this).Function;
            CTX.Implementation.Functions.Add(ret.ToString(), ret);
            return null;*/
        }

        public AsylumVisitResult VisitImplementationEntryOperator([NotNull] AsylumParser.ImplementationEntryOperatorContext context)
        {
            throw new System.NotImplementedException();
            /*var ret = context.operator_definition().Accept(this).Function;
            CTX.Implementation.Operators.Add(ret.Operator, ret);
            return null;*/
        }

    }

}
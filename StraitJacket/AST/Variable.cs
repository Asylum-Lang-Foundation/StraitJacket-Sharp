using System.Collections.Generic;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using LLVMSharp;
using StraitJacketLib.Constructs;

namespace StraitJacket.AST {

    public partial class Visitor : IAsylumVisitor<AsylumVisitResult> {

        // TODO: LABELS!!!
        public AsylumVisitResult VisitVariableArgsNoneOrSome([NotNull] AsylumParser.VariableArgsNoneOrSomeContext context)
        {

            // Setup.
            List<VarParameter> ret = new List<VarParameter>();

            // Get parameters.
            foreach (var p in context.variable_parameter()) {
                var res = p.Accept(this).Parameter;
                ret.Add(res);
            }

            // Variadic.
            if (context.IDENTIFIER() != null) {
                VarType variadic = context.variable_type() != null ? context.variable_type().Accept(this).VariableType : new VarTypeSimplePrimitive(SimplePrimitives.Object);
                variadic.Variadic = true;
                ret.Add(new VarParameter() { Value = new Variable() {  Name = context.IDENTIFIER().GetText(), Type = variadic } });
            }

            // Finish.
            return new AsylumVisitResult() { Parameters = ret };

        }

        // TODO: LABELS!!!
        public AsylumVisitResult VisitVariableArgsVariadicOnly([NotNull] AsylumParser.VariableArgsVariadicOnlyContext context)
        {
            VarType ret = context.variable_type() != null ? context.variable_type().Accept(this).VariableType : new VarTypeSimplePrimitive(SimplePrimitives.Object);
            ret.Variadic = true;
            return new AsylumVisitResult() {
                Parameters = new List<VarParameter>() {
                    new VarParameter() { Value = new Variable() { Name = context.IDENTIFIER().GetText(), Type = ret } }
                }
            };
        }

        public AsylumVisitResult VisitVariable_parameter([NotNull] AsylumParser.Variable_parameterContext context)
        {
            return new AsylumVisitResult() { Parameter = new VarParameter() {
                Value = Builder.Variable(context.variable_type().Accept(this).VariableType, context.IDENTIFIER().GetText())
            }};
        }

    }

}
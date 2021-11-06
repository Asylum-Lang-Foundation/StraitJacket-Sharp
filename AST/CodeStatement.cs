using System.Collections.Generic;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using LLVMSharp;
using StraitJacket.Constructs;

namespace StraitJacket.AST {

    public partial class Visitor : IAsylumVisitor<AsylumVisitResult> {

        public AsylumVisitResult VisitVariableDeclarationStatement([NotNull] AsylumParser.VariableDeclarationStatementContext context)
        {
            return context.variable_declaration().Accept(this);
        }

        public AsylumVisitResult VisitVariableDeclareWithInitializer([NotNull] AsylumParser.VariableDeclareWithInitializerContext context)
        {
            /*VariableDefinition ret = new VariableDefinition();
            Expression expr = context.expression().Accept(this).Expression;
            ret.Definition = expr;
            ret.Variables = new List<Variable>();
            foreach (var p in context.variable_parameter()) {
                Variable v = new Variable();
                v.Type = p.variable_type().Accept(this).VariableType;
                v.Scope = CTX.CurrentScope;
                v.Name = p.IDENTIFIER().GetText();
                ret.Variables.Add(v);
                CTX.CurrentScope.AddVar(v.Name, v);
            }
            return new AsylumVisitResult() { CodeStatement = ret };*/
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitVariableAssignmentNormal([NotNull] AsylumParser.VariableAssignmentNormalContext context)
        {
            /*VariableAssignment ret = new VariableAssignment();
            Expression expr = context.expression().Accept(this).Expression;
            ret.Definition = expr;
            ret.Variables = new List<VariableOrFunction>();
            foreach (var p in context.variable_or_function()) {
                ret.Variables.Add(p.Accept(this).VariableOrFunction);
            }
            return new AsylumVisitResult() { CodeStatement = new CodeStatement() { Type = CodeStatementType.VariableAssignment, VariableAssignment = ret } }; */
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitVariableDeclareWithInitializerExpr([NotNull] AsylumParser.VariableDeclareWithInitializerExprContext context)
        {
            throw new System.NotImplementedException();
            /*VariableDefinition ret = new VariableDefinition();
            ret.Variables = new List<Variable>();
            foreach (var p in context.variable_parameter()) {
                var parameter = p.Accept(this).Parameter;
                ret.Variables.Add(parameter.Value);
                CTX.CurrentScope.AddVar(parameter.Value.Name, parameter.Value);
            }
            ret.Definition = context.expression().Accept(this).Expression;
            return new AsylumVisitResult() { CodeStatement = ret };*/
        }

        public AsylumVisitResult VisitVariableDeclareWithTupleInitializerExpr([NotNull] AsylumParser.VariableDeclareWithTupleInitializerExprContext context)
        {
            throw new System.NotImplementedException();
        }

    }

}
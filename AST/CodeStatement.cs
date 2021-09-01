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
            VariableDefinition ret = new VariableDefinition();
            Expression expr = context.expression().Accept(this).Expression;
            ret.Definition = expr;
            ret.Variables = new List<Variable>();
            foreach (var p in context.variable_parameter()) {
                Variable v = new Variable();
                v.Type = p.variable_type().Accept(this).VariableType;
                v.Scope = CTX.CurrentScope;
                v.Name = p.IDENTIFIER().GetText();
                ret.Variables.Add(v);
                CTX.CurrentScope.Variables.Add(v.Name, v);
            }
            return new AsylumVisitResult() { CodeStatement = new CodeStatement() { Type = CodeStatementType.VariableDeclaration, VariableDefinition = ret } };
        }

        public AsylumVisitResult VisitVariableAssignmentStatement([NotNull] AsylumParser.VariableAssignmentStatementContext context)
        {
            return context.variable_assignment().Accept(this);
        }

        public AsylumVisitResult VisitVariableAssignmentNormal([NotNull] AsylumParser.VariableAssignmentNormalContext context)
        {
            VariableAssignment ret = new VariableAssignment();
            Expression expr = context.expression().Accept(this).Expression;
            ret.Definition = expr;
            ret.Variables = new List<VariableOrFunction>();
            foreach (var p in context.variable_or_function()) {
                ret.Variables.Add(p.Accept(this).VariableOrFunction);
            }
            return new AsylumVisitResult() { CodeStatement = new CodeStatement() { Type = CodeStatementType.VariableAssignment, VariableAssignment = ret } };
        }

    }

}
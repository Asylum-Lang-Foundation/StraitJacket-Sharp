using System.Collections.Generic;
using System.Linq;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using LLVMSharp;
using StraitJacket.Constructs;

namespace StraitJacket.AST {

    public partial class Visitor : IAsylumVisitor<AsylumVisitResult> {

        public AsylumVisitResult VisitCode_body([NotNull] AsylumParser.Code_bodyContext context)
        {
            CodeStatements ret = new CodeStatements();
            ret.Statements = new List<ICompileable>();
            foreach (var c in context.code_statement()) {
                ret.Statements.Add(c.Accept(this).CodeStatement);
            }
            return new AsylumVisitResult() { CodeStatements = ret };
        }

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
            List<Variable> variables = new List<Variable>();
            foreach (var p in context.variable_parameter()) {
                var parameter = p.Accept(this).Parameter;
                variables.Add(parameter.Value);
                parameter.Value.Scope.AddVar(parameter.Value.Name, parameter.Value);
            }
            VariableDefinition ret = new VariableDefinition(variables, context.expression().Accept(this).Expression);
            return new AsylumVisitResult() { CodeStatement = ret };
        }

        public AsylumVisitResult VisitVariableDeclareWithTupleInitializerExpr([NotNull] AsylumParser.VariableDeclareWithTupleInitializerExprContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitIfStatement([NotNull] AsylumParser.IfStatementContext context)
        {
            return context.if_statement().Accept(this);
        }

        public AsylumVisitResult VisitIf_statement([NotNull] AsylumParser.If_statementContext context)
        {
            Expression ifCond = context.expression()[0].Accept(this).Expression;
            CodeStatements thenBlock = context.code_body()[0].Accept(this).CodeStatements;
            CodeStatements elseBlock = null;
            int numStats = context.code_body().Length;
            if (context.ELSE() != null) {
                elseBlock = context.code_body().Last().Accept(this).CodeStatements;
            }
            if (context.ELIF() != null) {
                for (int i = context.code_body().Length - 2; i >= 1; i--) {
                    var bakElse = elseBlock;
                    elseBlock = new CodeStatements();
                    elseBlock.Statements.Add(new Condition(
                        context.expression()[i].Accept(this).Expression,
                        context.code_body()[i].Accept(this).CodeStatements,
                        bakElse
                    ));
                }
            }
            return new AsylumVisitResult() {
                CodeStatement = new Condition(ifCond, thenBlock, elseBlock)
            };
        }

        public AsylumVisitResult VisitLoopStatement([NotNull] AsylumParser.LoopStatementContext context)
        {
            return context.loop().Accept(this);
        }

        public AsylumVisitResult VisitLoop([NotNull] AsylumParser.LoopContext context)
        {
            return new AsylumVisitResult() {
                CodeStatement = new Loop(context.code_body().Accept(this).CodeStatements)
            };
        }

        public AsylumVisitResult VisitWhileLoopStatement([NotNull] AsylumParser.WhileLoopStatementContext context)
        {
            return context.while_loop().Accept(this);
        }

        public AsylumVisitResult VisitWhile_loop([NotNull] AsylumParser.While_loopContext context)
        {
            var body = context.code_body().Accept(this).CodeStatements;
            var expr = context.expression().Accept(this).Expression;
            body.Statements.Insert(0, new Condition(
                expr,
                new CodeStatements(),
                new CodeStatements() { Statements = new List<ICompileable>() { new Break(1) } }
            ) { OverrideElseReturn = true });
            return new AsylumVisitResult() {
                CodeStatement = new Loop(body)
            };
        }

    }

}
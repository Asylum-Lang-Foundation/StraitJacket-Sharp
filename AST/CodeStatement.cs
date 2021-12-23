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
            ));
            return new AsylumVisitResult() {
                CodeStatement = new Loop(body)
            };
        }

        public AsylumVisitResult VisitDoWhileLoopStatement([NotNull] AsylumParser.DoWhileLoopStatementContext context)
        {
            return context.do_while_loop().Accept(this);
        }

        public AsylumVisitResult VisitDo_while_loop([NotNull] AsylumParser.Do_while_loopContext context)
        {
            var body = context.code_body().Accept(this).CodeStatements;
            var expr = context.expression().Accept(this).Expression;
            body.Statements.Add(new Condition(
                expr,
                new CodeStatements(),
                new CodeStatements() { Statements = new List<ICompileable>() { new Break(1) } }
            ));
            return new AsylumVisitResult() {
                CodeStatement = new Loop(body)
            };
        }

        public AsylumVisitResult VisitForLoopStatement([NotNull] AsylumParser.ForLoopStatementContext context)
        {
            return context.for_loop().Accept(this);
        }

        public AsylumVisitResult VisitTraditionalForLoop([NotNull] AsylumParser.TraditionalForLoopContext context)
        {
            CodeStatements beforeLoop = null;
            if (context.variable_assignment() != null) {
                beforeLoop = new CodeStatements() { Statements = new List<ICompileable>() { context.variable_assignment().Accept(this).CodeStatement } };
            } else if (context.variable_declaration() != null) {
                beforeLoop = new CodeStatements() { Statements = new List<ICompileable>() { context.variable_declaration().Accept(this).CodeStatement } };
            }
            var cond = context.expression()[0].Accept(this).Expression;
            var after = context.expression()[1].Accept(this).Expression;
            var body = context.code_body().Accept(this).CodeStatements;
            body.Statements.Insert(0, new Condition(
                cond,
                new CodeStatements(),
                new CodeStatements() { Statements = new List<ICompileable>() { new Break(1) } }
            ));
            return new AsylumVisitResult() {
                CodeStatement = new Loop(body, beforeLoop, new CodeStatements() { Statements = new List<ICompileable>() { after } })
            };
        }

        public AsylumVisitResult VisitTraditionalForLoopNoParens([NotNull] AsylumParser.TraditionalForLoopNoParensContext context)
        {
            CodeStatements beforeLoop = null;
            if (context.variable_assignment() != null) {
                beforeLoop = new CodeStatements() { Statements = new List<ICompileable>() { context.variable_assignment().Accept(this).CodeStatement } };
            } else if (context.variable_declaration() != null) {
                beforeLoop = new CodeStatements() { Statements = new List<ICompileable>() { context.variable_declaration().Accept(this).CodeStatement } };
            }
            var cond = context.expression()[0].Accept(this).Expression;
            var after = context.expression()[1].Accept(this).Expression;
            var body = context.code_body().Accept(this).CodeStatements;
            body.Statements.Insert(0, new Condition(
                cond,
                new CodeStatements(),
                new CodeStatements() { Statements = new List<ICompileable>() { new Break(1) } }
            ));
            return new AsylumVisitResult() {
                CodeStatement = new Loop(body, beforeLoop, new CodeStatements() { Statements = new List<ICompileable>() { after } })
            };
        }

        public AsylumVisitResult VisitBreakStatement([NotNull] AsylumParser.BreakStatementContext context)
        {
            return context.break_statement().Accept(this);
        }

        public AsylumVisitResult VisitBreak_statement([NotNull] AsylumParser.Break_statementContext context)
        {
            int breakNum = 1;
            if (context.INTEGER() != null) {
                breakNum = (int)GetInteger(context.INTEGER()).ValueWhole;
            }
            return new AsylumVisitResult() {
                CodeStatement = new Break(breakNum)
            };
        }

        public AsylumVisitResult VisitContinueStatement([NotNull] AsylumParser.ContinueStatementContext context)
        {
            return context.continue_statement().Accept(this);
        }

        public AsylumVisitResult VisitReturnStatement([NotNull] AsylumParser.ReturnStatementContext context)
        {
            return context.return_value().Accept(this);
        }

        public AsylumVisitResult VisitReturn_value([NotNull] AsylumParser.Return_valueContext context)
        {
            return new AsylumVisitResult() {
                CodeStatement = new ReturnStatement(context.expression().Accept(this).Expression)
            };
        }

        public AsylumVisitResult VisitContinue_statement([NotNull] AsylumParser.Continue_statementContext context)
        {
            return new AsylumVisitResult() {
                CodeStatement = new Continue(1)
            };
        }

    }

}
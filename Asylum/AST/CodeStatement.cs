using System.Collections.Generic;
using System.Linq;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using LLVMSharp;
using StraitJacketLib.Constructs;

namespace Asylum.AST {

    public partial class Visitor : IAsylumVisitor<AsylumVisitResult> {

        public AsylumVisitResult VisitCode_body([NotNull] AsylumParser.Code_bodyContext context)
        {
            foreach (var c in context.code_statement()) {
                c.Accept(this);
            }
            return null;
        }

        public AsylumVisitResult VisitVariableDeclarationStatement([NotNull] AsylumParser.VariableDeclarationStatementContext context)
        {
            return context.variable_declaration().Accept(this);
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

        public AsylumVisitResult VisitVariableDeclareWithoutInitializer([NotNull] AsylumParser.VariableDeclareWithoutInitializerContext context)
        {
            List<Variable> variables = new List<Variable>();
            var parameter = context.variable_parameter().Accept(this).Parameter;
            variables.Add(parameter.Value);
            Builder.Code(Builder.VariableDefinition(null, variables.ToArray()));
            return null;
        }

        public AsylumVisitResult VisitVariableDeclareWithInitializerExpr([NotNull] AsylumParser.VariableDeclareWithInitializerExprContext context)
        {
            List<Variable> variables = new List<Variable>();
            foreach (var p in context.variable_parameter()) {
                var parameter = p.Accept(this).Parameter;
                variables.Add(parameter.Value);
            }
            Builder.Code(Builder.VariableDefinition(context.expression().Accept(this).Expression, variables.ToArray()));
            return null;
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
            Builder.BeginIf(context.expression()[0].Accept(this).Expression);
            context.code_body()[0].Accept(this);
            if (context.ELIF() != null) {
                for (int i = 1; i < context.code_body().Length - (context.ELSE() != null ? 1 : 0); i++) {
                    Builder.ElseIf(context.expression()[i].Accept(this).Expression);
                    context.code_body()[i].Accept(this);
                }
            }
            if (context.ELSE() != null) {
                Builder.Else();
                context.code_body().Last().Accept(this);
            }
            Builder.EndIf();
            return null;
        }

        public AsylumVisitResult VisitLoopStatement([NotNull] AsylumParser.LoopStatementContext context)
        {
            return context.loop().Accept(this);
        }

        public AsylumVisitResult VisitLoop([NotNull] AsylumParser.LoopContext context)
        {
            Builder.BeginLoop();
            context.code_body().Accept(this);
            Builder.EndLoop();
            return null;
        }

        public AsylumVisitResult VisitWhileLoopStatement([NotNull] AsylumParser.WhileLoopStatementContext context)
        {
            return context.while_loop().Accept(this);
        }

        public AsylumVisitResult VisitWhile_loop([NotNull] AsylumParser.While_loopContext context)
        {
            Builder.BeginWhileLoop(context.expression().Accept(this).Expression);
            context.code_body().Accept(this);
            Builder.EndWhileLoop();
            return null;
        }

        public AsylumVisitResult VisitDoWhileLoopStatement([NotNull] AsylumParser.DoWhileLoopStatementContext context)
        {
            return context.do_while_loop().Accept(this);
        }

        public AsylumVisitResult VisitDo_while_loop([NotNull] AsylumParser.Do_while_loopContext context)
        {
            Builder.BeginDoWhileLoop();
            context.code_body().Accept(this);
            Builder.EndDoWhileLoop(context.expression().Accept(this).Expression);
            return null;
        }

        public AsylumVisitResult VisitForLoopStatement([NotNull] AsylumParser.ForLoopStatementContext context)
        {
            return context.for_loop().Accept(this);
        }

        public AsylumVisitResult VisitTraditionalForLoop([NotNull] AsylumParser.TraditionalForLoopContext context)
        {
            if (context.variable_assignment() != null) {
                context.variable_assignment().Accept(this);
            } else if (context.variable_declaration() != null) {
                context.variable_declaration().Accept(this);
            }
            var cond = context.expression()[0].Accept(this).Expression;
            var after = context.expression()[1].Accept(this).Expression;
            Builder.BeginForLoop(null, cond);
            context.code_body().Accept(this);
            Builder.EndForLoop(after);
            return null;
        }

        public AsylumVisitResult VisitTraditionalForLoopNoParens([NotNull] AsylumParser.TraditionalForLoopNoParensContext context)
        {
            ICompileable beforeLoop = null;
            if (context.variable_assignment() != null) {
                beforeLoop = context.variable_assignment().Accept(this).CodeStatement;
            } else if (context.variable_declaration() != null) {
                beforeLoop = context.variable_declaration().Accept(this).CodeStatement;
            }
            var cond = context.expression()[0].Accept(this).Expression;
            var after = context.expression()[1].Accept(this).Expression;
            Builder.BeginForLoop(beforeLoop, cond);
            context.code_body().Accept(this);
            Builder.EndForLoop(after);
            return null;
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
            Builder.Code(new Break(breakNum));
            return null;
        }

        public AsylumVisitResult VisitContinueStatement([NotNull] AsylumParser.ContinueStatementContext context)
        {
            return context.continue_statement().Accept(this);
        }

        public AsylumVisitResult VisitContinue_statement([NotNull] AsylumParser.Continue_statementContext context)
        {
            Builder.Code(new Continue(1));
            return null;
        }

        public AsylumVisitResult VisitReturnStatement([NotNull] AsylumParser.ReturnStatementContext context)
        {
            return context.return_value().Accept(this);
        }

        public AsylumVisitResult VisitReturn_value([NotNull] AsylumParser.Return_valueContext context)
        {
            Builder.Code(new ReturnStatement(context.expression().Accept(this).Expression));
            return null;
        }

    }

}
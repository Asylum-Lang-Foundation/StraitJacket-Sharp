using System;
using System.Collections.Generic;
using System.Linq;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using LLVMSharp;
using StraitJacketLib.Constructs;

namespace Asylum.AST {

    public partial class Visitor : IAsylumVisitor<AsylumVisitResult> {

        public AsylumVisitResult VisitOperator([NotNull] AsylumParser.OperatorContext context)
        {
            if (context.assignment_operator() != null) return context.assignment_operator().Accept(this);
            if (context.OP_ADD() != null) return new AsylumVisitResult() { Operator = Operator.Add };
            if (context.OP_ADDRESS_OF() != null) return new AsylumVisitResult() { Operator = Operator.BitAnd };
            if (context.OP_AND() != null) return new AsylumVisitResult() { Operator = Operator.And };
            if (context.OP_BITWISE_OR() != null) return new AsylumVisitResult() { Operator = Operator.BitOr };
            if (context.OP_CMP() != null) return new AsylumVisitResult() { Operator = Operator.Cmp };
            if (context.OP_DIV() != null) return new AsylumVisitResult() { Operator = Operator.Div };
            if (context.OP_EQ() != null) return new AsylumVisitResult() { Operator = Operator.Eq };
            if (context.OP_EXP() != null) return new AsylumVisitResult() { Operator = Operator.Exp };
            if (context.OP_GE() != null) return new AsylumVisitResult() { Operator = Operator.Ge };
            if (context.OP_GT() != null) return new AsylumVisitResult() { Operator = Operator.Gt };
            if (context.OP_LE() != null) return new AsylumVisitResult() { Operator = Operator.Le };
            if (context.OP_LSHIFT() != null) return new AsylumVisitResult() { Operator = Operator.LShift };
            if (context.OP_LT() != null) return new AsylumVisitResult() { Operator = Operator.Lt };
            if (context.OP_MEMBER_ACCESS() != null) return new AsylumVisitResult() { Operator = Operator.Member };
            if (context.OP_MINUS_MINUS() != null) return new AsylumVisitResult() { Operator = Operator.Dec };
            if (context.OP_MOD() != null) return new AsylumVisitResult() { Operator = Operator.Mod };
            if (context.OP_MUL() != null) return new AsylumVisitResult() { Operator = Operator.Mul };
            if (context.OP_NE() != null) return new AsylumVisitResult() { Operator = Operator.Neq };
            if (context.OP_NOT() != null) return new AsylumVisitResult() { Operator = Operator.Not };
            if (context.OP_OR() != null) return new AsylumVisitResult() { Operator = Operator.Or };
            if (context.OP_PLUS_PLUS() != null) return new AsylumVisitResult() { Operator = Operator.Inc };
            if (context.OP_RANGE() != null) return new AsylumVisitResult() { Operator = Operator.Range };
            if (context.OP_RSHIFT() != null) return new AsylumVisitResult() { Operator = Operator.RShift };
            if (context.OP_SUB() != null) return new AsylumVisitResult() { Operator = Operator.Sub };
            if (context.OP_TILDE() != null) return new AsylumVisitResult() { Operator = Operator.BitNot };
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitAssignment_operator([NotNull] AsylumParser.Assignment_operatorContext context)
        {
            if (context.ASSIGN_OP_ADD_EQ() != null) return new AsylumVisitResult() { Operator = Operator.Add };
            if (context.ASSIGN_OP_AND_EQ() != null) return new AsylumVisitResult() { Operator = Operator.BitAnd };
            if (context.ASSIGN_OP_CHECK_NULL() != null) return new AsylumVisitResult() { Operator = Operator.Null };
            if (context.ASSIGN_OP_DIV_EQ() != null) return new AsylumVisitResult() { Operator = Operator.Div };
            if (context.ASSIGN_OP_EQ() != null) return new AsylumVisitResult() { Operator = Operator.AssignEq };
            if (context.ASSIGN_OP_EXP_EQ() != null) return new AsylumVisitResult() { Operator = Operator.Exp };
            if (context.ASSIGN_OP_LSHIFT_EQ() != null) return new AsylumVisitResult() { Operator = Operator.LShift };
            if (context.ASSIGN_OP_MOD_EQ() != null) return new AsylumVisitResult() { Operator = Operator.Mod };
            if (context.ASSIGN_OP_MUL_EQ() != null) return new AsylumVisitResult() { Operator = Operator.Mul };
            if (context.ASSIGN_OP_OR_EQ() != null) return new AsylumVisitResult() { Operator = Operator.BitOr };
            if (context.ASSIGN_OP_RSHIFT_EQ() != null) return new AsylumVisitResult() { Operator = Operator.RShift };
            if (context.ASSIGN_OP_SUB_EQ() != null) return new AsylumVisitResult() { Operator = Operator.Sub };
            if (context.ASSIGN_OP_XOR_EQ() != null) return new AsylumVisitResult() { Operator = Operator.BitXor };
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExpressionStatement([NotNull] AsylumParser.ExpressionStatementContext context)
        {
            Builder.Code(context.expression().Accept(this).Expression);
            return null;
        }

        public AsylumVisitResult VisitExprVisitComma([NotNull] AsylumParser.ExprVisitCommaContext context)
        {
            return context.expr_comma().Accept(this);
        }

        public AsylumVisitResult VisitExprComma([NotNull] AsylumParser.ExprCommaContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionComma(new List<Expression>() {
                context.expr_comma().Accept(this).Expression,
                context.expr_assignment().Accept(this).Expression
            })};
        }

        public AsylumVisitResult VisitExprVisitAssignment([NotNull] AsylumParser.ExprVisitAssignmentContext context)
        {
            return context.expr_assignment().Accept(this);
        }

        public AsylumVisitResult VisitExprAssignment([NotNull] AsylumParser.ExprAssignmentContext context)
        {
            // a += b can be re-written as a = a + b.
            Expression dest = context.expr_lambda().Accept(this).Expression;
            Expression src = context.expr_assignment().Accept(this).Expression;
            ExpressionOperator op = new ExpressionOperator(new List<Expression>() { dest, src }, context.assignment_operator().Accept(this).Operator);
            Expression ret = op.Operator == Operator.AssignEq ? new ExpressionStore(src, dest) : new ExpressionStore(op, dest);
            return new AsylumVisitResult() { Expression = ret };
        }

        public AsylumVisitResult VisitExprVisitLambda([NotNull] AsylumParser.ExprVisitLambdaContext context)
        {
            return context.expr_lambda().Accept(this);
        }

        public AsylumVisitResult VisitExprLambda([NotNull] AsylumParser.ExprLambdaContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_lambda().Accept(this).Expression,
                context.expr_ternary().Accept(this).Expression
            }, Operator.Lambda)};
        }

        public AsylumVisitResult VisitExprVisitTernary([NotNull] AsylumParser.ExprVisitTernaryContext context)
        {
            return context.expr_ternary().Accept(this);
        }

        public AsylumVisitResult VisitExprTernary([NotNull] AsylumParser.ExprTernaryContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_nullcheck().Accept(this).Expression,
                context.expr_ternary()[0].Accept(this).Expression,
                context.expr_ternary()[1].Accept(this).Expression
            }, Operator.Ternary)};
        }

        public AsylumVisitResult VisitExprVisitNullCheck([NotNull] AsylumParser.ExprVisitNullCheckContext context)
        {
            return context.expr_nullcheck().Accept(this);
        }

        public AsylumVisitResult VisitExprNullCheck([NotNull] AsylumParser.ExprNullCheckContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_nullcheck().Accept(this).Expression,
                context.expr_or().Accept(this).Expression
            }, Operator.Null)};
        }

        public AsylumVisitResult VisitExprVisitOr([NotNull] AsylumParser.ExprVisitOrContext context)
        {
            return context.expr_or().Accept(this);
        }

        public AsylumVisitResult VisitExprOr([NotNull] AsylumParser.ExprOrContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_or().Accept(this).Expression,
                context.expr_and().Accept(this).Expression
            }, Operator.Or)};
        }

        public AsylumVisitResult VisitExprVisitAnd([NotNull] AsylumParser.ExprVisitAndContext context)
        {
            return context.expr_and().Accept(this);
        }

        public AsylumVisitResult VisitExprAnd([NotNull] AsylumParser.ExprAndContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_and().Accept(this).Expression,
                context.expr_bit_or().Accept(this).Expression
            }, Operator.And)};
        }

        public AsylumVisitResult VisitExprVisitBitOr([NotNull] AsylumParser.ExprVisitBitOrContext context)
        {
            return context.expr_bit_or().Accept(this);
        }

        public AsylumVisitResult VisitExprBitOr([NotNull] AsylumParser.ExprBitOrContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_bit_or().Accept(this).Expression,
                context.expr_bit_xor().Accept(this).Expression
            }, Operator.BitOr)};
        }

        public AsylumVisitResult VisitExprVisitBitXor([NotNull] AsylumParser.ExprVisitBitXorContext context)
        {
            return context.expr_bit_xor().Accept(this);
        }

        public AsylumVisitResult VisitExprBitXor([NotNull] AsylumParser.ExprBitXorContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_bit_xor().Accept(this).Expression,
                context.expr_bit_and().Accept(this).Expression
            }, Operator.BitXor)};
        }

        public AsylumVisitResult VisitExprVisitBitAnd([NotNull] AsylumParser.ExprVisitBitAndContext context)
        {
            return context.expr_bit_and().Accept(this);
        }

        public AsylumVisitResult VisitExprBitAnd([NotNull] AsylumParser.ExprBitAndContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_bit_and().Accept(this).Expression,
                context.expr_equality_comparison().Accept(this).Expression
            }, Operator.BitAnd)};
        }

        public AsylumVisitResult VisitExprVisitEqualityComparison([NotNull] AsylumParser.ExprVisitEqualityComparisonContext context)
        {
            return context.expr_equality_comparison().Accept(this);
        }

        public AsylumVisitResult VisitExprEqualityComparison([NotNull] AsylumParser.ExprEqualityComparisonContext context)
        {
            Operator op = Operator.Eq;
            if (context.OP_NE() != null) op = Operator.Neq;
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_equality_comparison().Accept(this).Expression,
                context.expr_comparison().Accept(this).Expression
            }, op)};
        }

        public AsylumVisitResult VisitExprVisitComparison([NotNull] AsylumParser.ExprVisitComparisonContext context)
        {
            return context.expr_comparison().Accept(this);
        }

        public AsylumVisitResult VisitExprComparison([NotNull] AsylumParser.ExprComparisonContext context)
        {
            Operator op = Operator.Lt;
            if (context.OP_LT() != null) op = Operator.Lt;
            else if (context.OP_GT() != null) op = Operator.Gt;
            else if (context.OP_LE() != null) op = Operator.Le;
            else if (context.OP_GE() != null) op = Operator.Ge;
            else if (context.IS() != null) op = Operator.Is;
            else if (context.AS() != null) op = Operator.As; // This usage of as is clearly incorrect... What was I thinking?
            else throw new Exception("Comparison operator not found!!!");
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_comparison().Accept(this).Expression,
                context.expr_three_way_comparison().Accept(this).Expression
            }, op)};
        }

        public AsylumVisitResult VisitExprVisitThreeWayComparison([NotNull] AsylumParser.ExprVisitThreeWayComparisonContext context)
        {
            return context.expr_three_way_comparison().Accept(this);
        }

        public AsylumVisitResult VisitExprThreeWayComparison([NotNull] AsylumParser.ExprThreeWayComparisonContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_three_way_comparison().Accept(this).Expression,
                context.expr_shift().Accept(this).Expression
            }, Operator.Cmp)};
        }

        public AsylumVisitResult VisitExprVisitShift([NotNull] AsylumParser.ExprVisitShiftContext context)
        {
            return context.expr_shift().Accept(this);
        }

        public AsylumVisitResult VisitExprShift([NotNull] AsylumParser.ExprShiftContext context)
        {
            Operator op = Operator.LShift;
            if (context.OP_RSHIFT() != null) op = Operator.RShift;
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_shift().Accept(this).Expression,
                context.expr_additive().Accept(this).Expression
            }, op)};
        }

        public AsylumVisitResult VisitExprVisitAdditive([NotNull] AsylumParser.ExprVisitAdditiveContext context)
        {
            return context.expr_additive().Accept(this);
        }

        public AsylumVisitResult VisitExprAdditive([NotNull] AsylumParser.ExprAdditiveContext context)
        {
            Operator op = Operator.Add;
            if (context.OP_SUB() != null) op = Operator.Sub;
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_additive().Accept(this).Expression,
                context.expr_multiplicative().Accept(this).Expression
            }, op)};
        }

        public AsylumVisitResult VisitExprVisitMultiplicative([NotNull] AsylumParser.ExprVisitMultiplicativeContext context)
        {
            return context.expr_multiplicative().Accept(this);
        }

        public AsylumVisitResult VisitExprMultiplicative([NotNull] AsylumParser.ExprMultiplicativeContext context)
        {
            Operator op = Operator.Mul;
            if (context.OP_DIV() != null) op = Operator.Div;
            else if (context.OP_MOD() != null) op = Operator.Mod;
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_multiplicative().Accept(this).Expression,
                context.expr_exponential().Accept(this).Expression
            }, op)};
        }

        public AsylumVisitResult VisitExprVisitExponential([NotNull] AsylumParser.ExprVisitExponentialContext context)
        {
            return context.expr_exponential().Accept(this);
        }

        public AsylumVisitResult VisitExprExponential([NotNull] AsylumParser.ExprExponentialContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_exponential().Accept(this).Expression,
                context.expr_range().Accept(this).Expression
            }, Operator.Exp)};
        }

        public AsylumVisitResult VisitExprVisitRange([NotNull] AsylumParser.ExprVisitRangeContext context)
        {
            return context.expr_range().Accept(this);
        }

        public AsylumVisitResult VisitExprRange([NotNull] AsylumParser.ExprRangeContext context)
        {
            Operator op = Operator.Range;
            if (context.OP_RANGE_EQ() != null) op = Operator.RangeEq;
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_range().Accept(this).Expression,
                context.expr_unary().Accept(this).Expression
            }, op)};
        }

        public AsylumVisitResult VisitExprVisitUnary([NotNull] AsylumParser.ExprVisitUnaryContext context)
        {
            return context.expr_unary().Accept(this);
        }

        public AsylumVisitResult VisitExprPos([NotNull] AsylumParser.ExprPosContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_unary().Accept(this).Expression
            }, Operator.Pos)};
        }

        public AsylumVisitResult VisitExprNeg([NotNull] AsylumParser.ExprNegContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_unary().Accept(this).Expression
            }, Operator.Neg)};
        }

        public AsylumVisitResult VisitExprNot([NotNull] AsylumParser.ExprNotContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_unary().Accept(this).Expression
            }, Operator.Not)};
        }

        public AsylumVisitResult VisitExprBitNot([NotNull] AsylumParser.ExprBitNotContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_unary().Accept(this).Expression
            }, Operator.BitNot)};
        }

        public AsylumVisitResult VisitExprPreIncrement([NotNull] AsylumParser.ExprPreIncrementContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_unary().Accept(this).Expression
            }, Operator.PreInc)};
        }

        public AsylumVisitResult VisitExprPreDecrement([NotNull] AsylumParser.ExprPreDecrementContext context)
        {
           return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_unary().Accept(this).Expression
            }, Operator.PreDec)};
        }

        public AsylumVisitResult VisitExprMemberAccessUnary([NotNull] AsylumParser.ExprMemberAccessUnaryContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_unary().Accept(this).Expression
            }, Operator.FromLast)};
        }

        // TODO: CAST DEST AS EXPRESSION!!!
        public AsylumVisitResult VisitExprCast([NotNull] AsylumParser.ExprCastContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionCast(
                context.expression()[0].Accept(this).Expression,
                context.variable_type().Accept(this).VariableType
            )};
        }

        public AsylumVisitResult VisitExprAwait([NotNull] AsylumParser.ExprAwaitContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprAddressOf([NotNull] AsylumParser.ExprAddressOfContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_unary().Accept(this).Expression
            }, Operator.AddressOf)};
        }

        public AsylumVisitResult VisitExprAsReference([NotNull] AsylumParser.ExprAsReferenceContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_unary().Accept(this).Expression
            }, Operator.AsAddress)};
        }

        public AsylumVisitResult VisitExprDereference([NotNull] AsylumParser.ExprDereferenceContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_unary().Accept(this).Expression
            }, Operator.Dereference)};
        }

        public AsylumVisitResult VisitExprDefinedConstant([NotNull] AsylumParser.ExprDefinedConstantContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprVisitPrimary([NotNull] AsylumParser.ExprVisitPrimaryContext context)
        {
            return context.expr_primary().Accept(this);
        }

        public AsylumVisitResult VisitExprMemberAccess([NotNull] AsylumParser.ExprMemberAccessContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_primary().Accept(this).Expression,
                context.expr_parenthesis().Accept(this).Expression
            }, Operator.Member)};
        }

        public AsylumVisitResult VisitExprFunctionCall([NotNull] AsylumParser.ExprFunctionCallContext context)
        {
            List<Expression> parameters = new List<Expression>();
            if (context.expression() != null) {
                parameters.Add(context.expression().Accept(this).Expression);
            }
            return new AsylumVisitResult() { Expression = new ExpressionCall(
                context.expr_primary().Accept(this).Expression,
                new ExpressionComma(parameters)
            )};
        }

        public AsylumVisitResult VisitExprArrayAccess([NotNull] AsylumParser.ExprArrayAccessContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_primary().Accept(this).Expression,
                context.expression().Accept(this).Expression
            }, Operator.ArrayAccess)};
        }

        public AsylumVisitResult VisitExprIncrement([NotNull] AsylumParser.ExprIncrementContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_primary().Accept(this).Expression
            }, Operator.Inc)};
        }

        public AsylumVisitResult VisitExprDecrement([NotNull] AsylumParser.ExprDecrementContext context)
        {
            return new AsylumVisitResult() { Expression = new ExpressionOperator(new List<Expression>() {
                context.expr_primary().Accept(this).Expression
            }, Operator.Dec)};
        }

        public AsylumVisitResult VisitExprNew([NotNull] AsylumParser.ExprNewContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprTypeof([NotNull] AsylumParser.ExprTypeofContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprDefaultOf([NotNull] AsylumParser.ExprDefaultOfContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprDefault([NotNull] AsylumParser.ExprDefaultContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprNameof([NotNull] AsylumParser.ExprNameofContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprSizeof([NotNull] AsylumParser.ExprSizeofContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprStackAlloc([NotNull] AsylumParser.ExprStackAllocContext context)
        {
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprVisitParenthesis([NotNull] AsylumParser.ExprVisitParenthesisContext context)
        {
            return context.expr_parenthesis().Accept(this);
        }

        public AsylumVisitResult VisitExprParenthesis([NotNull] AsylumParser.ExprParenthesisContext context)
        {
            return context.expression().Accept(this); // This is just a container for the inside expression.
        }

        public AsylumVisitResult VisitExprVisitEnd([NotNull] AsylumParser.ExprVisitEndContext context)
        {
            return context.expr_end().Accept(this);
        }

        public AsylumVisitResult VisitExprVariable([NotNull] AsylumParser.ExprVariableContext context)
        {
            return new AsylumVisitResult() {
                Expression = new ExpressionVariable(Builder.VariableOrFunction(context.IDENTIFIER().GetText()))
            };
        }

        public AsylumVisitResult VisitExprInteger([NotNull] AsylumParser.ExprIntegerContext context)
        {
            Number n = GetInteger(context.INTEGER());
            Expression ret = new ExpressionConstInt(n.ForceSigned, n.ValueWhole);
            return new AsylumVisitResult() { Expression = ret };
        }

        public AsylumVisitResult VisitExprString([NotNull] AsylumParser.ExprStringContext context)
        {
            Expression ret = new ExpressionConstStringPtr(GetString(context.STRING()));
            return new AsylumVisitResult() { Expression = ret };
        }

        // TODO: GENERICS!!!
        public AsylumVisitResult VisitFunction_call([NotNull] AsylumParser.Function_callContext context)
        {
            List<Expression> parameters = new List<Expression>();
            foreach (var e in context.expression()) {
                parameters.Add(e.Accept(this).Expression);
            }
            bool doAwait = context.AWAIT() != null;
            Expression ret = new ExpressionCall(new ExpressionVariable(context.variable_or_function().Accept(this).VariableOrFunction), new ExpressionComma(parameters), doAwait);   
            return new AsylumVisitResult() { Expression = ret };
        }

        public AsylumVisitResult VisitVariable_or_function([NotNull] AsylumParser.Variable_or_functionContext context)
        {
            VariableOrFunction ret = new VariableOrFunction();
            ret.Path = "";
            for (int i = 0; i < context.IDENTIFIER().Length; i++) {
                ret.Path += context.IDENTIFIER()[i].GetText() + ".";
            }
            if (context.primitives() != null) {
                ret.Path = context.primitives().GetText();
            }
            if (context.primitives() == null) ret.Path = ret.Path.Substring(0, ret.Path.Length - 1);
            return new AsylumVisitResult() { VariableOrFunction = Builder.VariableOrFunction(ret.Path) };
        }

        // Convert a variable or function expression into using an operator.
        public Expression VariableOrFuncToExpression(VariableOrFunction v) {
            Expression ret;
            string[] subs = v.Path.Split('.');
            v.Path = subs[0];
            ret = new ExpressionVariable(v);
            for (int i = 1; i < subs.Length; i++) {
                ret = new ExpressionOperator(new List<Expression>() {
                    ret,
                    new ExpressionConstStringPtr(subs[i])
                }, Operator.Member);
            }
            return ret;
        }

        // TODO: NEGATIVE UNSIGNED!
        public Number GetInteger(ITerminalNode num) {
            ulong valU = 0;
            long valS = 0;
            string str = num.GetText();
            bool neg = str.Contains("-");
            bool unsigned = str.Contains("u") || str.Contains("U");
            bool signed = str.Contains("s") || str.Contains("S");
            if (unsigned || signed) str = str.Substring(0, str.Length - 1);
            if (neg && !unsigned) {
                signed = true;
            } else if (!signed) {
                unsigned = true;
            }
            if (neg) str = str.Substring(1);
            if (str.Contains("0x")) {
                if (signed) {
                    valS = Convert.ToInt64(str.Substring(2), 16);
                } else if (unsigned) {
                    valU = Convert.ToUInt64(str.Substring(2), 16);
                }
            } else if (str.Contains("0b")) {
                if (signed) {
                    valS = Convert.ToInt64(str.Substring(2), 2);
                } else if (unsigned) {
                    valU = Convert.ToUInt64(str.Substring(2), 2);
                }
            } else {
                if (signed) {
                    valS = Convert.ToInt64(str, 10);
                } else if (unsigned) {
                    valU = Convert.ToUInt64(str, 10);
                }
            }
            if (neg) {
                valS = -valS;
            }
            Number ret = new Number();
            ret.Type = NumberType.Whole;
            if (signed) {
                ret.ForceSigned = true;
            } else {
                ret.ForceSigned = false;
            }
            ret.ValueWhole = (long)valU;
            return ret;
        }

        // Converted a STRING terminal into an actual string.
        public string GetString(ITerminalNode str) {
            string s = str.GetText();
            s = s.Substring(1, s.Length - 2);
            s = s.Replace("\\n", "\n");
            s = s.Replace("\\0", "\0");
            s = s.Replace("\\a", "\a");
            s = s.Replace("\\b", "\b");
            s = s.Replace("\\f", "\f");
            s = s.Replace("\\r", "\r");
            s = s.Replace("\\t", "\t");
            s = s.Replace("\\v", "\v");
            s = s.Replace("\\\\", "\\");
            // TODO: HEX STRINGS!!!
            return s;
        }

    }

}
using System;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using LLVMSharp;
using StraitJacket.Constructs;

namespace StraitJacket.AST {

    public partial class Visitor : IAsylumVisitor<AsylumVisitResult> {

        public AsylumVisitResult VisitOperator([NotNull] AsylumParser.OperatorContext context)
        {
            if (context.assignment_operator() != null) return context.assignment_operator().Accept(this);
            if (context.OP_ADD() != null) return new AsylumVisitResult() { Operator = Operator.Add };
            if (context.OP_ADDRESS_OF() != null) return new AsylumVisitResult() { Operator = Operator.BitAnd };
            if (context.OP_AND() != null) return new AsylumVisitResult() { Operator = Operator.And };
            if (context.OP_BITWISE_OR() != null) return new AsylumVisitResult() { Operator = Operator.BitOr };
            if (context.OP_DIV() != null) return new AsylumVisitResult() { Operator = Operator.Div };
            if (context.OP_EQ() != null) return new AsylumVisitResult() { Operator = Operator.Eq };
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
            if (context.ASSIGN_OP_ADD_EQ() != null) return new AsylumVisitResult() { Operator = Operator.AssignAdd };
            if (context.ASSIGN_OP_AND_EQ() != null) return new AsylumVisitResult() { Operator = Operator.AssignBitAnd };
            if (context.ASSIGN_OP_CHECK_NULL() != null) return new AsylumVisitResult() { Operator = Operator.AssignNull };
            if (context.ASSIGN_OP_DIV_EQ() != null) return new AsylumVisitResult() { Operator = Operator.AssignDiv };
            if (context.ASSIGN_OP_EQ() != null) return new AsylumVisitResult() { Operator = Operator.AssignEq };
            if (context.ASSIGN_OP_EXP_EQ() != null) return new AsylumVisitResult() { Operator = Operator.AssignExp };
            if (context.ASSIGN_OP_LSHIFT_EQ() != null) return new AsylumVisitResult() { Operator = Operator.AssignLShift };
            if (context.ASSIGN_OP_MOD_EQ() != null) return new AsylumVisitResult() { Operator = Operator.AssignMod };
            if (context.ASSIGN_OP_MUL_EQ() != null) return new AsylumVisitResult() { Operator = Operator.AssignMul };
            if (context.ASSIGN_OP_OR_EQ() != null) return new AsylumVisitResult() { Operator = Operator.AssignBitOr };
            if (context.ASSIGN_OP_RSHIFT_EQ() != null) return new AsylumVisitResult() { Operator = Operator.AssignRShift };
            if (context.ASSIGN_OP_SUB_EQ() != null) return new AsylumVisitResult() { Operator = Operator.AssignSub };
            if (context.ASSIGN_OP_XOR_EQ() != null) return new AsylumVisitResult() { Operator = Operator.AssignBitXor };
            throw new System.NotImplementedException();
        }

        public AsylumVisitResult VisitExprAssignment([NotNull] AsylumParser.ExprAssignmentContext context)
        {
            Expression ret = new Expression();
            ret.Type = ExpressionType.Assignment;
            ret.Left = context.expression()[0].Accept(this).Expression;
            ret.Right = context.expression()[1].Accept(this).Expression;
            ret.Val = context.assignment_operator().Accept(this).Operator;
            return new AsylumVisitResult() { Expression = ret };
        }

        public AsylumVisitResult VisitExpressionStatement([NotNull] AsylumParser.ExpressionStatementContext context)
        {
            return new AsylumVisitResult() { CodeStatement = context.expression().Accept(this).Expression };
        }

        // TODO: GENERICS!!!
        public AsylumVisitResult VisitFunction_call([NotNull] AsylumParser.Function_callContext context)
        {
            FunctionCall ret = new FunctionCall();
            ret.Await = context.AWAIT() != null;
            ret.Scope = CTX.CurrentScope;
            ret.Function = context.variable_or_function().Accept(this).VariableOrFunction;
            foreach (var e in context.expression()) {
                ret.Parameters.Add(e.Accept(this).Expression);
            }
            return new AsylumVisitResult() { FunctionCall = ret };
        }

        public AsylumVisitResult VisitExprCallReturnedFunction([NotNull] AsylumParser.ExprCallReturnedFunctionContext context)
        {
            Expression ret = new Expression();
            ret.Type = ExpressionType.EvaluatedFunctionCall;
            ret.Left = context.expression()[0].Accept(this).Expression;
            ret.Right = context.expression()[1].Accept(this).Expression;
            return new AsylumVisitResult() { Expression = ret };
        }

        public AsylumVisitResult VisitVariable_or_function([NotNull] AsylumParser.Variable_or_functionContext context)
        {
            VariableOrFunction ret = new VariableOrFunction();
            ret.Scope = CTX.CurrentScope;
            for (int i = 0; i < context.IDENTIFIER().Length; i++) {
                ret.Path = context.IDENTIFIER()[i].GetText() + ".";
            }
            if (context.primitives() != null) {
                ret.Path = context.primitives().GetText();
            }
            if (context.primitives() == null) ret.Path = ret.Path.Substring(0, ret.Path.Length - 1);
            return new AsylumVisitResult() { VariableOrFunction = ret };
        }

        public AsylumVisitResult VisitExprPrimary([NotNull] AsylumParser.ExprPrimaryContext context)
        {
            return context.primary_expression().Accept(this);
        }

        public AsylumVisitResult VisitExprUnary([NotNull] AsylumParser.ExprUnaryContext context)
        {
            return context.unary_expression().Accept(this);
        }

        // TODO:
        public AsylumVisitResult VisitPrimary_expression([NotNull] AsylumParser.Primary_expressionContext context)
        {
            Expression expr = new Expression();
            expr.Scope = CTX.CurrentScope;
            if (context.variable_or_function() != null) {
                expr.Type = ExpressionType.Variable;
                expr.Val = context.variable_or_function().Accept(this).VariableOrFunction;
                return new AsylumVisitResult() { Expression = expr };
            } else if (context.function_call() != null) {
                var func = context.function_call().Accept(this).FunctionCall;
                expr.Type = ExpressionType.UnknownFunctionCall;
                expr.Val = func;
                return new AsylumVisitResult() { Expression = expr };
            }
            // TODO: OTHERS!!!
            var err = context.GetText();
            throw new System.Exception(err + " IS INVALID!");
        }

        public AsylumVisitResult VisitUnary_expression([NotNull] AsylumParser.Unary_expressionContext context)
        {
            Expression expr = new Expression();
            expr.Scope = CTX.CurrentScope;
            if (context.variable_type() != null) {
                expr.Type = ExpressionType.Cast;
                expr.Val = new Cast() { Implicit = false, DestType = context.variable_type().Accept(this).VariableType, ToCast = context.expression().Accept(this).Expression };
                return new AsylumVisitResult() { Expression = expr };
            }
            // TODO: OTHERS!!!
            var err = context.GetText();
            throw new System.Exception(err + " IS INVALID!");
        }

        public AsylumVisitResult VisitExprString([NotNull] AsylumParser.ExprStringContext context)
        {
            Expression ret = new Expression();
            ret.Scope = CTX.CurrentScope;
            ret.EvaluatesTo = new VarType() { Type = VarTypeEnum.Primitive, Primitive = Primitives.String, Constant = true };
            ret.Type = ExpressionType.String;
            ret.Val = GetString(context.STRING());
            return new AsylumVisitResult() { Expression = ret };
        }

        public AsylumVisitResult VisitExprInteger([NotNull] AsylumParser.ExprIntegerContext context)
        {
            Expression ret = new Expression();
            ret.Scope = CTX.CurrentScope;
            ret.Type = ExpressionType.Integer;
            ret.Val = GetInteger(context.INTEGER());
            bool signed = ((Number)ret.Val).ValueWhole < 0;
            ret.EvaluatesTo = new VarType() { Type = VarTypeEnum.Primitive, Primitive = signed ? Primitives.Signed : Primitives.Unsigned, BitWidth = ((Number)ret.Val).MinBits, Constant = true };
            return new AsylumVisitResult() { Expression = ret };
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
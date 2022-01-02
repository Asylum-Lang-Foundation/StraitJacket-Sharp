using System;
using System.Collections.Generic;
using System.Linq;
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

        public AsylumVisitResult VisitExprAssignment([NotNull] AsylumParser.ExprAssignmentContext context)
        {
            // a += b can be re-written as a = a + b.
            Expression dest = context.expression()[0].Accept(this).Expression;
            Expression src = context.expression()[1].Accept(this).Expression;
            ExpressionOperator op = new ExpressionOperator(new List<Expression>() { dest, src }, context.assignment_operator().Accept(this).Operator);
            Expression ret = op.Operator == Operator.AssignEq ? new ExpressionStore(src, dest) : new ExpressionStore(op, dest);
            return new AsylumVisitResult() { Expression = ret };
        }

        public AsylumVisitResult VisitExpressionStatement([NotNull] AsylumParser.ExpressionStatementContext context)
        {
            return new AsylumVisitResult() { CodeStatement = context.expression().Accept(this).Expression };
        }

        public AsylumVisitResult VisitExprComma([NotNull] AsylumParser.ExprCommaContext context)
        {
            Expression ret = new ExpressionComma(new List<Expression>() { context.expression()[0].Accept(this).Expression, context.expression()[1].Accept(this).Expression });
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

        public AsylumVisitResult VisitExprCallReturnedFunction([NotNull] AsylumParser.ExprCallReturnedFunctionContext context)
        {
            // Fix weird thing where we either get an expression or an expression comma to always be expression comma.
            List<Expression> parameters = new List<Expression>();
            parameters.Add(context.expression()[1].Accept(this).Expression);
            if (parameters[0] as ExpressionComma != null) {
                parameters = (parameters[0] as ExpressionComma).Expressions;
            }
            Expression ret = new ExpressionCall(context.expression()[0].Accept(this).Expression, new ExpressionComma(parameters));
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

        public AsylumVisitResult VisitExprParenthesis([NotNull] AsylumParser.ExprParenthesisContext context)
        {
            return context.expression().Accept(this); // This is just a container for the inside expression.
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
            return new AsylumVisitResult() {
                Expression = new ExpressionOperator(context.expression().Select(x => x.Accept(this).Expression).ToList(), op)
            };
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
            if (context.variable_or_function() != null) {
                Expression ret = new ExpressionVariable(context.variable_or_function().Accept(this).VariableOrFunction);
                return new AsylumVisitResult() { Expression = ret };
            } else if (context.function_call() != null) {
                return new AsylumVisitResult() { Expression = context.function_call().Accept(this).Expression };
            }
            // TODO: OTHERS!!!
            var err = context.GetText();
            throw new System.Exception(err + " IS INVALID!");
        }

        public AsylumVisitResult VisitUnary_expression([NotNull] AsylumParser.Unary_expressionContext context)
        {
            if (context.variable_type() != null) {
                Expression ret = new ExpressionCast(context.expression().Accept(this).Expression, context.variable_type().Accept(this).VariableType);
                return new AsylumVisitResult() { Expression = ret };
            } else if (context.OP_ADDRESS_OF() != null) {
                return new AsylumVisitResult() {
                    Expression = new ExpressionOperator(
                        new List<Expression>() { context.expression().Accept(this).Expression },
                        Operator.AddressOf
                    )
                };
            } else if (context.OP_MUL() != null) {
                return new AsylumVisitResult() {
                    Expression = new ExpressionOperator(
                        new List<Expression>() { context.expression().Accept(this).Expression },
                        Operator.Dereference
                    )
                };
            }
            // TODO: OTHERS!!!
            var err = context.GetText();
            throw new System.Exception(err + " IS INVALID!");
        }

        public AsylumVisitResult VisitExprString([NotNull] AsylumParser.ExprStringContext context)
        {
            Expression ret = new ExpressionConstStringPtr(GetString(context.STRING()));
            return new AsylumVisitResult() { Expression = ret };
        }

        public AsylumVisitResult VisitExprInteger([NotNull] AsylumParser.ExprIntegerContext context)
        {
            Number n = GetInteger(context.INTEGER());
            Expression ret = new ExpressionConstInt(n.ForceSigned, n.ValueWhole);
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
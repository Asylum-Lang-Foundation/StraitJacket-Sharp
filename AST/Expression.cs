using System;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using LLVMSharp;
using StraitJacket.Constructs;

namespace StraitJacket.AST {

    public partial class Visitor : IAsylumVisitor<AsylumVisitResult> {

        public AsylumVisitResult VisitFunctionCallStatement([NotNull] AsylumParser.FunctionCallStatementContext context)
        {
            FunctionCall ret = context.function_call().Accept(this).FunctionCall;
            return new AsylumVisitResult() { CodeStatement = new CodeStatement() { Type = CodeStatementType.FunctionCall, FunctionCall = ret } };
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
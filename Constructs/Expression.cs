using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

// TODO: TREAT FUNCTIONS LIKE GLOBAL VARIABLES!!! So close, but you forgot to take into account mangling...
namespace StraitJacket.Constructs {

    // Variable or function.
    public class VariableOrFunction {
        public string Path;
        public Scope Scope;

        public Function ResolveFunction() {
            return Scope.ResolveFunction(this);
        }

        public Variable ResolveVariable() {
            return Scope.ResolveVariable(this);
        }
        
    }

    public class Cast : ICompileable {
        public bool Implicit;
        public VarType DestType;
        public Expression ToCast;
        public FileContext FileContext;

        public FileContext GetFileContext() => FileContext;

        public void ResolveCalls() {
            ToCast.ResolveCalls();
        }

        public void ResolveVariables() {
            ToCast.ResolveVariables();
        }

        public void ResolveTypes() {
            ToCast.ResolveTypes();
        }

        public LLVMValueRef Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            LLVMValueRef expr = ToCast.Compile(mod, builder, param);
            if (ToCast.EvaluatesTo.Type == VarTypeEnum.Primitive && ToCast.EvaluatesTo.Primitive == Primitives.Object) {
                return expr; // Do nothing and hope it works.
            } else if (ToCast.EvaluatesTo.Type == VarTypeEnum.Primitive && (ToCast.EvaluatesTo.Primitive == Primitives.Unsigned || ToCast.EvaluatesTo.Primitive == Primitives.Signed)) {
                if (DestType.Type == VarTypeEnum.Primitive && (DestType.Primitive == Primitives.Unsigned || DestType.Primitive == Primitives.Signed)) {
                    if (DestType.BitWidth < ToCast.EvaluatesTo.BitWidth) {

                    } else if (DestType.BitWidth > ToCast.EvaluatesTo.BitWidth && ToCast.EvaluatesTo.Primitive == Primitives.Unsigned) {
                        return builder.BuildZExt(expr, DestType.GetLLVMType());
                    }
                }
            }
            throw new System.Exception("AHHHHHHH");
        }

    }

    // Value types.
    public enum ExpressionType {
        String,
        Integer,
        Variable,
        UnknownFunctionCall,
        Cast,
        EvaluatedFunctionCall,
        Assignment
    }

    // Operator.
    public enum Operator {
        Add,
        Sub,
        Mul,
        Div,
        Mod,
        Exp,
        Range,
        BitAnd,
        BitOr,
        BitXor,
        BitNot,
        LShift,
        RShift,
        Pos,
        Neg,
        Inc,
        Dec,
        Member,
        Dereference,
        AddressOf,
        AsAddress,
        And,
        Or,
        Nand,
        Nor,
        Not,
        Eq,
        Neq,
        Gt,
        Lt,
        Ge,
        Le,
        Cond,
        Null,
        Comma,
        AssignAdd,
        AssignSub,
        AssignMul,
        AssignDiv,
        AssignMod,
        AssignExp,
        AssignBitAnd,
        AssignBitOr,
        AssignBitXor,
        AssignBitNot,
        AssignLShift,
        AssignRShift,
        AssignCond,
        AssignNull,
        AssignEq
    }

    // Expression.
    public class Expression : ICompileable {
        public ExpressionType Type;
        public VarType EvaluatesTo;
        public object Val;
        public Variable EvaluatedVariable;
        public Expression Left;
        public Expression Right;
        public Scope Scope;
        public FileContext FileContext;

        public FileContext GetFileContext() => FileContext;

        public void ResolveCalls() {
            switch (Type) {
                case ExpressionType.UnknownFunctionCall:
                    ((FunctionCall)Val).ResolveCalls();
                    break;
                case ExpressionType.Cast:
                    ((Cast)Val).ResolveCalls();
                    break;
                case ExpressionType.EvaluatedFunctionCall:
                    Left.ResolveCalls();
                    Right.ResolveCalls();
                    break;
                case ExpressionType.Variable:
                case ExpressionType.String:
                    break;
                default:
                    throw new System.NotImplementedException();
            }
        }

        public void ResolveVariables() {
            switch (Type) {
                case ExpressionType.UnknownFunctionCall:
                    ((FunctionCall)Val).ResolveVariables();
                    break;
                case ExpressionType.Variable:
                    EvaluatedVariable = ((VariableOrFunction)Val).ResolveVariable();
                    break;
                case ExpressionType.Cast:
                    ((Cast)Val).ResolveVariables();
                    break;
                case ExpressionType.EvaluatedFunctionCall:
                    Left.ResolveVariables();
                    Right.ResolveVariables(); // After resolving variables, this can finally be made into a function call.
                    Val = new FunctionCall() {
                        Scope = Scope,
                        ResolvedFunction = (Function)Left.EvaluatedVariable,
                        Parameters = new List<Expression>() { Right }
                    };
                    break;
                case ExpressionType.String:
                    break;
                default:
                    throw new System.NotImplementedException();
            }
        }

        public void ResolveTypes() {
            switch (Type) {
                case ExpressionType.Cast:
                    ((Cast)Val).ResolveTypes();
                    EvaluatesTo = ((Cast)Val).DestType;
                    break;
                case ExpressionType.Variable:
                    EvaluatesTo = EvaluatedVariable.Type;
                    break;
                case ExpressionType.UnknownFunctionCall:
                    EvaluatesTo = ((FunctionCall)Val).ResolvedFunction.ReturnType;
                    break;
                case ExpressionType.EvaluatedFunctionCall:
                    ((FunctionCall)Val).ResolveTypes();
                    EvaluatesTo = ((FunctionCall)Val).ResolvedFunction.ReturnType;
                    break;
                case ExpressionType.String:
                    EvaluatesTo = new VarType() { Type = VarTypeEnum.Primitive, Primitive = Primitives.String };
                    break;
                default:
                    throw new System.NotImplementedException();
            }
        }

        public LLVMValueRef Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            switch (Type) {
                case ExpressionType.String:
                    return builder.BuildGlobalStringPtr((string)Val, "");
                case ExpressionType.Integer:
                    Number number = (Number)Val;
                    return LLVMValueRef.CreateConstInt(LLVMTypeRef.CreateInt(number.MinBits), (ulong)number.ValueWhole, number.ForceSigned);
                case ExpressionType.Variable:
                    return builder.BuildLoad(EvaluatedVariable.LLVMValue);
                case ExpressionType.Cast:
                    return ((Cast)Val).Compile(mod, builder, param);
                case ExpressionType.UnknownFunctionCall:
                    return ((FunctionCall)Val).Compile(mod, builder, param);
                case ExpressionType.EvaluatedFunctionCall:
                    return ((FunctionCall)Val).Compile(mod, builder, param);
            }
            var err = Type;
            throw new System.Exception("Expression type " + err + " not implemented!");
        }
    }

}
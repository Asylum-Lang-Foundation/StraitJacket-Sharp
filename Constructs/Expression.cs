using LLVMSharp;
using LLVMSharp.Interop;

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

    public class Cast {
        public bool Implicit;
        public VarType DestType;
        public Expression ToCast;

        public void ResolveCalls() {
            ToCast.ResolveCalls();
        }

        public void ResolveVariables() {
            ToCast.ResolveVariables();
        }

        public void ResolveTypes() {
            ToCast.ResolveTypes();
        }

        public LLVMValueRef Compile(LLVMModuleRef mod, LLVMBuilderRef builder) {
            LLVMValueRef expr = ToCast.Compile(mod, builder);
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
        Cast
    }

    // Expression.
    public class Expression {
        public ExpressionType Type;
        public VarType EvaluatesTo;
        public object Val;
        public Variable EvaluatedVariable;
        public Expression Left;
        public Expression Right;
        public Scope Scope;

        public void ResolveCalls() {
            switch (Type) {
                case ExpressionType.UnknownFunctionCall:
                    ((FunctionCall)Val).ResolveCalls();
                    break;
                case ExpressionType.Cast:
                    ((Cast)Val).ResolveCalls();
                    break;
            }
        }

        public void ResolveVariables() {
            switch (Type) {
                case ExpressionType.UnknownFunctionCall:
                    ((FunctionCall)Val).ResolveVariables();
                    break;
                case ExpressionType.Variable:
                    EvaluatedVariable = Scope.ResolveVariable((VariableOrFunction)Val);
                    break;
                case ExpressionType.Cast:
                    ((Cast)Val).ResolveVariables();
                    break;
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
            }
        }

        public LLVMValueRef Compile(LLVMModuleRef mod, LLVMBuilderRef builder) {
            switch (Type) {
                case ExpressionType.String:
                    return builder.BuildGlobalStringPtr((string)Val, "");
                case ExpressionType.Integer:
                    Number number = (Number)Val;
                    return LLVMValueRef.CreateConstInt(LLVMTypeRef.CreateInt(number.MinBits), (ulong)number.ValueWhole, number.ForceSigned);
                case ExpressionType.Variable:
                    return builder.BuildLoad(EvaluatedVariable.LLVMValue);
                case ExpressionType.Cast:
                    return ((Cast)Val).Compile(mod, builder);
                case ExpressionType.UnknownFunctionCall:
                    return ((FunctionCall)Val).Compile(mod, builder);
            }
            var err = Type;
            throw new System.Exception("Expression type " + err + " not implemented!");
        }
    }

}
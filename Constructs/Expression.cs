using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

/*

    Expressions:
        So there are many different types of expressions that can be created.
        The purpose of this file is to control the contruction, evaluation, and compilation of these.
    
    Expression Types:

        String:
            Purpose: Global string data value to convert into a global string pointer.
            Val: Compiler "string" type.

*/

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
        Assignment,
        Comma
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
    public abstract class Expression : ICompileable {
        public ExpressionType Type;
        public VarType EvaluatesTo;
        public object Val;
        public Variable EvaluatedVariable;
        public Expression Left;
        public Expression Right;
        public Scope Scope;
        public FileContext FileContext;

        public FileContext GetFileContext() => FileContext;

        // Vfunctions.
        public virtual void ResolveCalls() {}
        public virtual void ResolveVariables() {}
        public virtual void ResolveTypes() {}
        public abstract VarType ReturnType();
        public abstract LLVMValueRef Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param);


        /*

        // Split expressions separated by the comma operator into a list.
        public List<Expression> SplitComma() {
            if (Type != ExpressionType.Comma) {
                return new List<Expression>() { this };
            }
            List<Expression> ret = new List<Expression>();
            ret.AddRange(Left.SplitComma());
            ret.AddRange(Right.SplitComma());
            return ret;
        }

        public void ResolveCalls() {
            throw new System.Exception("OBSOLETE!");
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
                    var currFunc = Scope.PeekCurrentFunction;
                    if (currFunc != null) {
                        if (!currFunc.CalledFunctions.Contains(((FunctionCall)Val).ResolvedFunction)) {
                            currFunc.CalledFunctions.Add(((FunctionCall)Val).ResolvedFunction);
                        }
                    }
                    break;
                case ExpressionType.Variable:
                    EvaluatedVariable = ((VariableOrFunction)Val).ResolveVariable();
                    break;
                case ExpressionType.Cast:
                    ((Cast)Val).ResolveVariables();
                    break;
                case ExpressionType.Assignment:
                    Left.ResolveVariables();
                    Right.ResolveVariables();
                    break;
                case ExpressionType.EvaluatedFunctionCall:
                    Left.ResolveVariables();
                    Right.ResolveVariables(); // After resolving variables, this can finally be made into a function call.
                    Val = new FunctionCall() {
                        Scope = Scope,
                        ResolvedFunction = (Function)Left.EvaluatedVariable,
                        Parameters = Right.SplitComma()
                    };
                    var currFunc2 = Scope.PeekCurrentFunction;
                    if (currFunc2 != null) {
                        if (!currFunc2.CalledFunctions.Contains(((FunctionCall)Val).ResolvedFunction)) {
                            currFunc2.CalledFunctions.Add(((FunctionCall)Val).ResolvedFunction);
                        }
                    }
                    break;
                case ExpressionType.Comma:
                    Left.ResolveVariables();
                    Right.ResolveVariables();
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
                case ExpressionType.Assignment:
                    EvaluatesTo = VarType.CreatePrimitiveSimple(Primitives.Void);
                    // TODO: ASSIGN PROPER "FUNCTION"!!!
                    break;
                case ExpressionType.UnknownFunctionCall:
                    EvaluatesTo = ((FunctionCall)Val).ResolvedFunction.ReturnType;
                    break;
                case ExpressionType.EvaluatedFunctionCall:
                    ((FunctionCall)Val).ResolveTypes();
                    EvaluatesTo = ((FunctionCall)Val).ResolvedFunction.ReturnType;
                    break;
                case ExpressionType.String:
                    EvaluatesTo = VarType.CreatePrimitiveSimple(Primitives.String);
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
                    return EvaluatedVariable.NoLoad ? EvaluatedVariable.LLVMValue : builder.BuildLoad(EvaluatedVariable.LLVMValue, "load_" + EvaluatedVariable.Name);
                case ExpressionType.Cast:
                    return ((Cast)Val).Compile(mod, builder, param);
                case ExpressionType.UnknownFunctionCall:
                    return ((FunctionCall)Val).Compile(mod, builder, param);
                case ExpressionType.EvaluatedFunctionCall:
                    return ((FunctionCall)Val).Compile(mod, builder, param);
            }
            var err = Type;
            throw new System.Exception("Expression type " + err + " not implemented!");
        }*/
        
    }

}
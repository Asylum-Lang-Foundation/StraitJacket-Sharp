using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacketLib.Constructs {

    // Operator that returns a value from two expressions.
    public class ExpressionOperator : Expression {
        public List<Expression> Inputs = new List<Expression>();
        public Operator Operator;
        VarType InputTypes = null;
        VarType RetType = null;

        public ExpressionOperator(List<Expression> inputs, Operator op) {
            Inputs = inputs;
            Operator = op;

            // Compiler hack, convert variable expression to constant string if needed.
            if (op == Operator.Member && Inputs[1] as ExpressionVariable != null) { 
                Inputs[1] = new ExpressionConstStringPtr((Inputs[1] as ExpressionVariable).ToResolve.Path);
            }
            
        }

        public override void ResolveVariables() {
            foreach (var e in Inputs) {
                e.ResolveVariables();
            }
        }

        public override void ResolveTypes() {
            foreach (var e in Inputs) {
                e.ResolveTypes();
            }
            switch (Operator) {
                case Operator.Eq:
                case Operator.Neq:
                case Operator.Lt:
                case Operator.Gt:
                case Operator.Le:
                case Operator.Ge:
                    LValue = false;
                    GenerateCastsIfNeeded2();
                    RetType = new VarTypeSimplePrimitive(SimplePrimitives.Bool);
                    break;
                case Operator.AddressOf:
                    if (!Inputs[0].LValue) throw new System.Exception("Can't take the address of a non-lvalue!");
                    LValue = false;
                    RetType = new VarTypePointer(Inputs[0].ReturnType());
                    break;
                case Operator.Dereference:
                    if (Inputs[0].ReturnType().Type != VarTypeEnum.Pointer) {
                        throw new System.Exception("Can't take the de-reference of a non-pointer!");
                    } else {
                        RetType = (Inputs[0].ReturnType() as VarTypePointer).PointedTo;
                    }
                    break;
                case Operator.Member:
                    var eee = Inputs[0].ReturnType();
                    if (Inputs[0].ReturnType().Type != VarTypeEnum.Tuple) {
                        throw new System.Exception("Can't take the member of an expression that doesn't result in a tuple or struct!");
                    }
                    if (Inputs[1] as ExpressionConstStringPtr == null) throw new System.Exception("Can only take the member of using a constant string pointer!");
                    RetType = (Inputs[0].ReturnType() as VarTypeStruct).GetMemberType((Inputs[1] as ExpressionConstStringPtr).Str);
                    break;
                default:
                    throw new System.NotImplementedException("Operator return type not implemented!");
            }
        }

        // Generate casts when needed for two inputs.
        private void GenerateCastsIfNeeded2() {
            if (Inputs[0].ReturnType().Equals(Inputs[1].ReturnType())) { // Matching type.
                InputTypes = Inputs[0].ReturnType();
            } else if (Inputs[0].ReturnType().CanImplicitlyCastTo(Inputs[1].ReturnType())) { // Left can cast to right.
                ExpressionCast cast = new ExpressionCast(Inputs[0], Inputs[1].ReturnType());
                cast.ResolveTypes();
                Inputs[0] = cast;
                InputTypes = Inputs[1].ReturnType();
            } else if (Inputs[1].ReturnType().CanImplicitlyCastTo(Inputs[0].ReturnType())) { // Right can cast to left.
                ExpressionCast cast = new ExpressionCast(Inputs[1], Inputs[0].ReturnType());
                cast.ResolveTypes();
                Inputs[1] = cast;
                InputTypes = Inputs[0].ReturnType();
            } else if (false) { // Custom operator defined. TODO!!!

            } else { // Can't cast!
                throw new System.Exception("No valid casting conversion!");
            }
        }

        public override bool IsPlural() {
            return false;
        }

        public override VarType GetReturnType() {
            return RetType;
        }

        public override void StoreSingle(ReturnValue src, ReturnValue dest, VarType srcType, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            Inputs[0].StoreSingle(src, dest, srcType, destType, mod, builder, param);
        }

        public override void StorePlural(ReturnValue src, ReturnValue dest, VarType srcType, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            Inputs[0].StorePlural(src, dest, srcType, destType, mod, builder, param);
        }

        public override ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            LLVMValueRef v1, v2;
            switch (Operator) {
                case Operator.Lt:
                    v1 = Inputs[0].Compile(mod, builder, param).Val;
                    if (Inputs[0].LValue) v1 = builder.BuildLoad(v1, "SJ_Load");
                    v2 = Inputs[1].Compile(mod, builder, param).Val;
                    if (Inputs[1].LValue) v2 = builder.BuildLoad(v1, "SJ_Load");
                    if (InputTypes.IsFloatingPoint()) {
                        return new ReturnValue(
                            builder.BuildFCmp(LLVMRealPredicate.LLVMRealOLT,
                            v1,
                            v2,
                            "SJ_FCompare_LT")
                        );
                    } else {
                        return new ReturnValue(
                            builder.BuildICmp(InputTypes.IsUnsigned() ? LLVMIntPredicate.LLVMIntULT : LLVMIntPredicate.LLVMIntSLT,
                            v1,
                            v2,
                            "SJ_ICompare_LT")
                        );
                    }
                case Operator.AddressOf:
                    return Inputs[0].Compile(mod, builder, param);
                case Operator.Dereference:
                    return new ReturnValue(builder.BuildLoad(
                        Inputs[0].Compile(mod, builder, param).Val,
                        "SJ_Dereference"
                    ));
                case Operator.Member:
                    v1 = Inputs[0].Compile(mod, builder, param).Val;
                    string member = (Inputs[1] as ExpressionConstStringPtr).Str;
                    return new ReturnValue(builder.BuildStructGEP(
                        v1,
                        (Inputs[0].ReturnType() as VarTypeStruct).CalcIdx(member),
                        "SJ_Member_" + member
                    ));
            }
            throw new System.NotImplementedException("Operator has not been implemented yet!");
        }

        public override string ToString() {
            switch (Operator) {
                case Operator.Add:
                    return "(" + Inputs[0].ToString() + " + " + Inputs[1].ToString() + ")";
                case Operator.Lt:
                    return "(" + Inputs[0].ToString() + " < " + Inputs[1].ToString() + ")";
                case Operator.AddressOf:
                    return "(&" + Inputs[0].ToString() + ")";
                case Operator.Dereference:
                    return "(*" + Inputs[0].ToString() + ")";
                case Operator.Member:
                    return Inputs[0].ToString() + "." + (Inputs[1] as ExpressionConstStringPtr).Str;
            }
            return "???";
        }

    }

}
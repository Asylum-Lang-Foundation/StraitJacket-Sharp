using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Operator that returns a value from two expressions.
    public class ExpressionOperator : Expression {
        public List<Expression> Inputs = new List<Expression>();
        public Operator Operator;
        VarType InputTypes = null;
        VarType RetType = null;

        public ExpressionOperator(List<Expression> inputs, Operator op) {
            Inputs = inputs;
            Operator = op;
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
                    GenerateCastsIfNeeded2();
                    RetType = new VarTypeSimplePrimitive(SimplePrimitives.Bool);
                    break;
                case Operator.AddressOf:
                    RetType = new VarTypePointer(Inputs[0].ReturnType());
                    break;
                case Operator.Dereference:
                    if (Inputs[0].ReturnType().Type != VarTypeEnum.Pointer) {
                        throw new System.Exception("Can't take the de-reference of a non-pointer!");
                    } else {
                        RetType = (Inputs[0].ReturnType() as VarTypePointer).PointedTo;
                    }
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

        public override VarType ReturnType() {
            return RetType;
        }

        public override void StorePlural(ReturnValue src, ReturnValue dest, VarType srcType, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            // This doesn't make sense.
        }

        public override void StoreSingle(ReturnValue src, ReturnValue dest, VarType srcType, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            // This doesn't make sense.
        }

        public override ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            switch (Operator) {
                case Operator.Lt:
                    if (InputTypes.IsFloatingPoint()) {
                        return new ReturnValue(
                            builder.BuildFCmp(LLVMRealPredicate.LLVMRealOLT,
                            Inputs[0].Compile(mod, builder, param).Val,
                            Inputs[1].Compile(mod, builder, param).Val,
                            "SJ_FCompare_LT")
                        );
                    } else {
                        return new ReturnValue(
                            builder.BuildICmp(InputTypes.IsUnsigned() ? LLVMIntPredicate.LLVMIntULT : LLVMIntPredicate.LLVMIntSLT,
                            Inputs[0].Compile(mod, builder, param).Val,
                            Inputs[1].Compile(mod, builder, param).Val,
                            "SJ_ICompare_LT")
                        );
                    }
                case Operator.AddressOf:
                    return new ReturnValue(builder.BuildGEP(
                        (Inputs[0] as ExpressionVariable).CompileToStoreTo(mod, builder, param).Val,
                        new LLVMValueRef[] { LLVMValueRef.CreateConstInt(LLVMTypeRef.Int1, 0) },
                        "SJ_AddrOf"
                    ));
            }
            throw new System.NotImplementedException("Operator has not been implemented yet!");
        }

    }

}
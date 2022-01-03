using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Constant integer.
    public class ExpressionConstSimple : Expression {
        public SimplePrimitives Primitive;
        public object Val;

        public ExpressionConstSimple(SimplePrimitives primitive, object val) {
            Primitive = primitive;
            Val = val;
        }

        public override void ResolveTypes() {
            LValue = false;
        }

        public override VarType GetReturnType() {
            return new VarTypeSimplePrimitive(Primitive);
        }

        public override bool IsPlural() {
            return false;
        }

        public override void StoreSingle(ReturnValue src, ReturnValue dest, VarType srcType, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            throw new System.Exception("??????");
        }

        public override void StorePlural(ReturnValue src, ReturnValue dest, VarType srcType, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            throw new System.Exception("??????");
        }

        public override ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            switch (Primitive) {
                case SimplePrimitives.Bool:
                    return new ReturnValue(LLVMValueRef.CreateConstInt(LLVMTypeRef.Int1, (ulong)(((bool)Val) ? 1 : 0), false));
            }
            throw new System.NotImplementedException("No defined constant value for simple primitive type: " + Primitive + "!");
        }

    }

}
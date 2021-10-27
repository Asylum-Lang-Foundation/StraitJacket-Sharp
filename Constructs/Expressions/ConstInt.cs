using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Constant integer.
    public class ExpressionConstInt : Expression {
        public Number Val;

        public ExpressionConstInt(bool forceSigned, long val) {
            Val = new Number() {
                Type = NumberType.Whole,
                ForceSigned = forceSigned,
                ValueWhole = val
            };
        }

        public override VarType ReturnType() {
            return new VarTypeInteger(Val.ForceSigned, Val.MinBits);
        }

        public override ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            return new ReturnValue(LLVMValueRef.CreateConstInt(ReturnType().GetLLVMType(), (ulong)Val.ValueWhole, Val.ForceSigned));
        }

    }

}
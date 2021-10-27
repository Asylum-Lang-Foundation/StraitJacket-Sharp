using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Constant floating point. TODO - ALLOW FOR OTHER THAN DOUBLE!
    public class ExpressionConstFloat : Expression {
        public Number Val;

        public ExpressionConstFloat(double val) {
            Val = new Number() {
                Type = NumberType.Decimal,
                ValueDecimal = val
            };
        }

        public override VarType ReturnType() {
            return new VarTypeSimplePrimitive(SimplePrimitives.Double);
        }

        public override ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            return new ReturnValue(LLVMValueRef.CreateConstReal(LLVMTypeRef.Double, Val.ValueDecimal));
        }

    }

}
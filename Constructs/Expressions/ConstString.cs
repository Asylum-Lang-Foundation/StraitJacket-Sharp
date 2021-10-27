using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Constant string pointer.
    public class ExpressionConstStringPtr : Expression {
        public string Str;

        public ExpressionConstStringPtr(string str) {
            Str = str;
        }

        public override VarType ReturnType() {
            return new VarTypeSimplePrimitive(SimplePrimitives.ConstString);
        }

        public override ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            return new ReturnValue(builder.BuildGlobalStringPtr(Str, "SJ_ConstStr_" + Str));
        }

    }

}
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

        public override void ResolveTypes() {
            LValue = false;
        }

        public override VarType GetReturnType() {
            return new VarTypeSimplePrimitive(SimplePrimitives.ConstString);
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
            return new ReturnValue(builder.BuildGlobalStringPtr(Str, "SJ_ConstStr_" + Str));
        }

    }

}
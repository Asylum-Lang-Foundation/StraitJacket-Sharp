using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // A variable to resolve.
    public class ExpressionVariable : Expression {
        public VariableOrFunction ToResolve;
        Variable Resolved;

        public ExpressionVariable(VariableOrFunction toResolve) {
            ToResolve = toResolve;
        }

        public override VarType ReturnType() {
            throw new System.NotImplementedException();
        }

        public override bool IsPlural() {
            return false;
        }

        public override void StoreSingle(ReturnValue src, ReturnValue dest, VarType srcType, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            
            // Ex: u32 a = 7;
            // Ex: (u8, (u32, f32)) b = (3, (5, 7));

            // Case 1: Raw value.
            if (src.ReturnType == ReturnValueType.Value) {
                builder.BuildStore(src.Val, dest.Val);
            }

            // Case 2: Recursive multiple values (tuple).
            else if (src.ReturnType == ReturnValueType.NestedValues) {
                // TODO!!!
                throw new System.NotImplementedException();
            }

            // How did we get here?
            else {
                throw new System.Exception("??????");
            }

        }

        public override void StorePlural(ReturnValue src, ReturnValue dest, VarType srcType, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            throw new System.NotImplementedException();
        }

        public override ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            throw new System.NotImplementedException();
        }

    }

}
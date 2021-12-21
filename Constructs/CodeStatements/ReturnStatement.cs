using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Return statement.
    public class ReturnStatement : ICompileable {
        public Expression ReturnValue;
        public FileContext FileContext;

        public FileContext GetFileContext() => FileContext;

        public ReturnStatement(Expression expr) {
            ReturnValue = expr;
        }

        public void ResolveVariables() {
            ReturnValue.ResolveVariables();
        }

        public void ResolveTypes() {
            ReturnValue.ResolveTypes();
        }

        public ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            ReturnValue comp = ReturnValue.Compile(mod, builder, param);
            if (comp.ReturnType == ReturnValueType.Void) {
                builder.BuildRetVoid();
            } else if (comp.ReturnType == ReturnValueType.Value) {
                builder.BuildRet(comp.Val);
            } else if (comp.ReturnType == ReturnValueType.NestedValues) {
                throw new System.NotImplementedException();
            }
            return comp;
        }

    }

}
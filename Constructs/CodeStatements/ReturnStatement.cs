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

        public void CompileDeclarations(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {}

        public ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {

            // Only compile if not dead.
            if (CodeStatements.BlockTerminated) return null;

            // Return a value.
            ReturnValue comp = ReturnValue.Compile(mod, builder, param);
            if (comp.ReturnType == ReturnValueType.Void) {
                builder.BuildRetVoid();
            } else if (comp.ReturnType == ReturnValueType.Value) {
                builder.BuildRet(comp.Val);
            } else if (comp.ReturnType == ReturnValueType.NestedValues) {
                throw new System.NotImplementedException();
            }
            CodeStatements.BlockTerminated = true;
            return comp;

        }

    }

}
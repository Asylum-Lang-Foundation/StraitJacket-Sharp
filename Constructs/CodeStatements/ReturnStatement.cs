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
            ReturnValue comp =  ReturnValue.Compile(mod, builder, param);
            // TODO: BUILD RETURN INSTRUCTION!!!
            throw new System.NotImplementedException();
            //return new ReturnValue();
        }

    }

}
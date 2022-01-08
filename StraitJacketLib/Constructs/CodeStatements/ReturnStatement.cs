using LLVMSharp.Interop;

namespace StraitJacketLib.Constructs {

    // Return statement.
    public class ReturnStatement : ICompileable {
        public Expression ReturnValue;
        public FileContext FileContext;

        public FileContext GetFileContext() => FileContext;

        public ReturnStatement(Expression expr) {
            ReturnValue = expr;
        }

        public void ResolveVariables() {
            if (ReturnValue != null) ReturnValue.ResolveVariables();
        }

        public void ResolveTypes() {
            if (ReturnValue != null) ReturnValue.ResolveTypes();
        }

        public void CompileDeclarations(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {}

        public ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {

            // Only compile if not dead.
            if (CodeStatements.BlockTerminated) return null;

            // Return a value.
            if (ReturnValue == null) {
                builder.BuildRetVoid();
                CodeStatements.BlockTerminated = true;
                CodeStatements.ReturnedValue = new ReturnValue();
                return CodeStatements.ReturnedValue;
            }
            ReturnValue comp = ReturnValue.Compile(mod, builder, param);
            if (comp.ReturnType == ReturnValueType.Void) {
                builder.BuildRetVoid();
                CodeStatements.BlockTerminated = true;
                CodeStatements.ReturnedValue = new ReturnValue();
                return CodeStatements.ReturnedValue;
            } else if (comp.ReturnType == ReturnValueType.Value) {
                LLVMValueRef ret = comp.Val;
                if (ReturnValue.LValue) ret = builder.BuildLoad(ret, "SJ_LoadRet");
                builder.BuildRet(ret);
            } else if (comp.ReturnType == ReturnValueType.NestedValues) {
                throw new System.NotImplementedException();
            }
            CodeStatements.BlockTerminated = true;
            CodeStatements.ReturnedValue = comp;
            return comp;

        }

        public override string ToString() {
            string ret = "return";
            if (ReturnValue != null) ret += " " + ReturnValue.ToString();
            return ret;
        }

    }

}
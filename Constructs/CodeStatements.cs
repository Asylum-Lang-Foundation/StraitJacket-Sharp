using System.Collections.Generic;
using System.Linq;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Code statements.
    public class CodeStatements : ICompileable {
        public List<ICompileable> Statements = new List<ICompileable>();
        public FileContext FileContext;

        public FileContext GetFileContext() => FileContext;

        public void ResolveVariables() {
            foreach (var c in Statements) {
                c.ResolveVariables();
            }
        }

        public void ResolveTypes() {
            foreach (var c in Statements) {
                c.ResolveTypes();
            }
        }

        // TODO: RETURN TYPE MECHANISM!!! Param is expect return.
        public ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            if (param == null) param = false;
            foreach (var s in Statements) {
                s.Compile(mod, builder, param);
            }
            return (bool)param ? new ReturnValue(builder.BuildRetVoid()) : null;
        }

    }

}
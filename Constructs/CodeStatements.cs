using System.Collections.Generic;
using System.Linq;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Code statements.
    public class CodeStatements : ICompileable {
        public static bool BlockTerminated = false;
        public static ReturnValue ReturnedValue = null;
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

        // Compile declarations.
        public void CompileDeclarations(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            foreach (var s in Statements) {
                s.CompileDeclarations(mod, builder, param);
            }
        }

        public ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            foreach (var s in Statements) {
                if (!BlockTerminated) s.Compile(mod, builder, param);
            }
            return CodeStatements.ReturnedValue;
        }

    }

}
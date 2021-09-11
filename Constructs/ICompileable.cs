using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Any construct that can be compiled.
    public interface ICompileable {

        // Get file context.
        FileContext GetFileContext();

        // Resolve calls and make sure the functions exist.
        void ResolveCalls();

        // Convert variable names into references.
        void ResolveVariables();

        // Resolve type names into references.
        void ResolveTypes();

        // Compile the item.
        LLVMValueRef Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param);

    }

    // I compileable, but for universal statements.
    public interface ICompileableUniversal : ICompileable {}

}
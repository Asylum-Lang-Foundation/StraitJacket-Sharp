using System;
using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Return value type.
    public enum ReturnValueType {
        Value,
        NestedValues,
        Void
    }

    // Return value.
    public class ReturnValue {
        public static bool DEBUG_OUT = false;
        public ReturnValueType ReturnType { get; private set; }
        public bool IsSingular { get; private set; }
        public LLVMValueRef Val { get; private set; }
        public List<ReturnValue> Rets { get; private set; } = new List<ReturnValue>();

        public ReturnValue() {
            ReturnType = ReturnValueType.Void;
        }

        public ReturnValue(LLVMValueRef val) {
            if (DEBUG_OUT) Console.WriteLine(val);
            ReturnType = ReturnValueType.Value;
            IsSingular = true;
            Val = val;
        }

        public ReturnValue(ReturnValue ret) {
            ReturnType = ReturnValueType.NestedValues;
            IsSingular = true;
            Rets.Add(ret);
        }

        public ReturnValue(List<ReturnValue> rets) {
            ReturnType = ReturnValueType.NestedValues;
            Rets = rets;
        }

    }

    // Any construct that can be compiled.
    public interface ICompileable {

        // Get file context.
        FileContext GetFileContext();

        // Convert variable names into references, which include function names.
        void ResolveVariables();

        // Resolve type names into references, also evaluate function overloads.
        void ResolveTypes();

        // Compile the item.
        ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param);

    }

    // ICompileable, but for universal statements.
    public interface ICompileableUniversal : ICompileable {}

}
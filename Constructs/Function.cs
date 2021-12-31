using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Linq;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // A modifier.
    [Flags]
    public enum Modifier {
        Public = 0b1,
        ProtectedInternal = 0b110,
        PrivateProtected = 0b1010,
        Private = 0b1000,
        Protected = 0b10,
        Internal = 0b100,
        Static = 0b10000,
        Inline = 0b100000,
        Async = 0b1000000,
        Unsafe = 0b10000000
    }

    // Function definition.
    public class Function : Variable, ICompileableUniversal {
        public bool Static;
        public bool Inline;
        public bool Async;
        public bool Unsafe;
        public bool Extern;
        public bool Variadic;
        public Operator Operator;
        public List<Attribute> Attributes = new List<Attribute>();
        public List<VarParameter> Parameters;
        public VarType ReturnType;
        public CodeStatements Definition;
        public List<Function> CalledFunctions = new List<Function>();
        public string ModulePath;
        
        public bool Compiled;
        public LLVMValueRef LLVMVal;
        public Dictionary<string, LLVMValueRef> ExternedLLVMVals = new Dictionary<string, LLVMValueRef>();
        public override string ToString() => (Extern || Name.Equals("main") || Attributes.Where(x => x.Name.Equals("NoMangle")).Count() > 0) ? Name : Mangler.MangleFunction(this);

        public FileContext FileContext;
        public FileContext GetFileContext() => FileContext;

        public void ResolveVariables() {
            if (Extern) return;
            Scope.PushFunction(this);
            Definition.ResolveVariables();
            Scope.PopFunction();
        }

        public void ResolveTypes() {
            if (Extern) return;
            Scope.PushFunction(this);
            Definition.ResolveTypes();
            Scope.PopFunction();
        }

        // Get the LLVM type of the function.
        public LLVMTypeRef GetFuncTypeLLVM() {
            return new VarTypeFunction(ReturnType, Parameters.Select(x => x.Value.Type).ToList()).GetLLVMType();
        }

        public void CompileDeclarations(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {}

        // TODO: NAME MANGLING AND MORE!!! Ok, so the problem is you need to extern any functions that are not in this module...
        public ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {

            // Don't do work that doesn't need to be done.
            if (Inline) Compiled = true;
            if (Compiled || Inline) return null;

            // Extern any called functions that are not in this module.
            foreach (var f in CalledFunctions) {
                if (!f.ModulePath.Equals(ModulePath) && !f.Inline) {
                    if (!f.ExternedLLVMVals.ContainsKey(ModulePath)) {
                        var externFunc = mod.AddFunction(f.ToString(), f.GetFuncTypeLLVM());
                        f.ExternedLLVMVals.Add(ModulePath, externFunc);
                    }
                }
            }

            // Add the function definition. This is all that's needed for extern.
            LLVMVal = mod.AddFunction(ToString(), GetFuncTypeLLVM());

            // We must compile the function if it actually has a body of course.
            if (!Extern) {

                // Add the entry point of the function.
                var block = LLVMBasicBlockRef.AppendInContext(mod.Context, LLVMVal, "entry");
                builder.PositionAtEnd(block);

                // Convert the parameters to LLVM values.
                Scope.PushFunction(this);
                for (int i = 0; i < Parameters.Count; i++) {
                    if (Parameters[i].Value.Type.Variadic) break;
                    var val = builder.BuildAlloca(LLVMVal.Params[i].TypeOf, "SJ_Param_" + Parameters[i].Value.Name);
                    builder.BuildStore(LLVMVal.Params[i], val);
                    Parameters[i].Value.LLVMValue = val;
                }

                // Compile the function, and add a return statement if necessary.
                Definition.CompileDeclarations(mod, builder, param);
                Definition.Compile(mod, builder, param);
                if (!CodeStatements.BlockTerminated && ReturnType.Equals(new VarTypeSimplePrimitive(SimplePrimitives.Void))) {
                    builder.BuildRetVoid();
                }
                LLVMVal.VerifyFunction(LLVMVerifierFailureAction.LLVMPrintMessageAction);
                Scope.PopFunction();

            }

            // Finished.
            CodeStatements.BlockTerminated = false;
            CodeStatements.ReturnedValue = null;
            Compiled = true;
            return null;

        }

        /*
        // If signatures are equal.
        public bool Equals(Function x, Function y)
        {
            if (x.ReturnType != y.ReturnType) return false;
            if (x.Parameters.Count == y.Parameters.Count) {
                for (int i = 0; i < x.Parameters.Count; i++) {
                    if (x.Parameters[i] != y.Parameters[i]) return false;
                }
            }
            return false;
        }

        // For signature checking.
        public int GetHashCode([DisallowNull] Function obj)
        {
            int ret = obj.ReturnType.GetHashCode();
            foreach (var p in obj.Parameters) {
                ret *= p.GetHashCode();
            }
            return ret;
        }
        */

    }

}
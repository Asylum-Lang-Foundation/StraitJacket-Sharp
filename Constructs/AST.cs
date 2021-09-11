using System;
using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;
using StraitJacket.AST;

namespace StraitJacket.Constructs {

    // Abstract syntax tree.
    public class AST {
        public List<ICompileableUniversal> Universals = new List<ICompileableUniversal>();

        // Make it so the definition of a variable and its assignment are separate. Definitions must be in the entry block for alloca to be optimized.
        public void MoveVariableDefinitions() {

        }

        // Converts variable names to actual variable values.
        public void ResolveVariables() {
            foreach (var u in Universals) {
                u.ResolveVariables();
            }
        }

        // Converts function call names to the actual functions.
        public void ResolveCalls() {
            foreach (var u in Universals) {
                u.ResolveCalls();
            }
        }

        // Resolve all the types used.
        public void ResolveTypes() {
            foreach (var u in Universals) {
                u.ResolveTypes();
            }
        }

        // Compile the entire thing.
        public LLVMModuleRef Compile(string modName) {
            var mod = LLVMModuleRef.CreateWithName(modName);
            var builder = LLVMBuilderRef.Create(mod.Context);
            foreach (var u in Universals) {
                u.Compile(mod, builder, null);
            }
            return mod;
        }

    }

}
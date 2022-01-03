using System;
using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacketLib.Constructs {

    // Abstract syntax tree.
    public class AST {
        public List<ICompileableUniversal> Universals = new List<ICompileableUniversal>();
        public CodeStatements TopLevel = new CodeStatements();
        private bool CompilationReady;

        // Make sure we are ready to compile.
        public void PrepareForCompilation() {

            // Turn variable and function call names into actual function calls.
            ResolveVariables();

            // Resolve the result types of expressions and finalize what function is called.
            ResolveTypes();

            // Ready!
            CompilationReady = true;

        }

        // Converts variable names to actual variable values.
        private void ResolveVariables() {
            foreach (var u in Universals) {
                u.ResolveVariables();
            }
            TopLevel.ResolveVariables();
        }

        // Resolve all the types used.
        private void ResolveTypes() {
            foreach (var u in Universals) {
                u.ResolveTypes();
            }
            TopLevel.ResolveTypes();
        }

        // Compile the entire thing.
        public LLVMModuleRef Compile(string modName, string rootFolder) {
            if (!CompilationReady) {
                throw new Exception("COMPILER API ERROR: Preparation for compilation was never called!");
            }
            var mod = LLVMModuleRef.CreateWithName(modName);
            var builder = LLVMBuilderRef.Create(mod.Context);
            if (TopLevel.Statements.Count > 0) {
                Function main = new Function();
                main.Name = "main";
                main.ReturnType = new VarTypeSimplePrimitive(SimplePrimitives.Void);
                main.Parameters = new List<VarParameter>();
                main.Definition = TopLevel;
                main.ModulePath = modName;
                Universals.Add(main);
            }
            foreach (var u in Universals) {
                u.Compile(mod, builder, null);
            }
            return mod;
        }

    }

}
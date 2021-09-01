using System;
using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;
using StraitJacket.AST;

namespace StraitJacket.Constructs {

    // Universal function.
    public enum UniversalType {
        ExternFunction,
        Function,
        Implementation
    }

    // Abstract syntax tree.
    public class AST {
        public List<Tuple<UniversalType, AsylumVisitResult>> Universals = new List<Tuple<UniversalType, AsylumVisitResult>>();

        // Make it so the definition of a variable and its assignment are separate. Defintions must be in the entry block for alloca.
        public void MoveVariableDefinitions() {

        }

        // Converts variable names to actual variable values.
        public void ResolveVariables() {
            foreach (var u in Universals) {
                switch (u.Item1) {
                    case UniversalType.Function:
                        u.Item2.Function.ResolveVariables();
                        break;
                }
            }
        }

        // Converts function call names to the actual functions.
        public void ResolveCalls() {
            foreach (var u in Universals) {
                switch (u.Item1)
                {
                    case UniversalType.Function:
                        u.Item2.Function.ResolveCalls();
                        break;
                }
            }
        }

        public void ResolveTypes() {
            foreach (var u in Universals) {
                switch (u.Item1)
                {
                    case UniversalType.Function:
                        u.Item2.Function.ResolveTypes();
                        break;
                }
            }
        }

        public LLVMModuleRef Compile(string modName) {
            var mod = LLVMModuleRef.CreateWithName(modName);
            var builder = LLVMBuilderRef.Create(mod.Context);
            foreach (var u in Universals) {
                switch (u.Item1)
                {
                    case UniversalType.ExternFunction:
                        u.Item2.Function.Compile(mod, builder);
                        break;
                    case UniversalType.Function:
                        u.Item2.Function.Compile(mod, builder);
                        break;
                }
            }
            return mod;
        }
    }

}
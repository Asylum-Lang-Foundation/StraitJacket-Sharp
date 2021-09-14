using System;
using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;
using StraitJacket.AST;

namespace StraitJacket.Constructs {

    // Abstract syntax tree.
    public class AST {
        public List<ICompileableUniversal> Universals = new List<ICompileableUniversal>();
        public CodeStatements TopLevel = new CodeStatements();

        // Make it so the definition of a variable and its assignment are separate. Definitions must be in the entry block for alloca to be optimized.
        public void MoveVariableDefinitions() {

        }

        // Converts variable names to actual variable values.
        public void ResolveVariables() {
            foreach (var u in Universals) {
                u.ResolveVariables();
            }
            TopLevel.ResolveVariables();
        }

        // Resolve all the types used.
        public void ResolveTypes() {
            foreach (var u in Universals) {
                u.ResolveTypes();
            }
            TopLevel.ResolveTypes();
        }

        // Compile the entire thing.
        public LLVMModuleRef Compile(string modName, string rootFolder) {
            var mod = LLVMModuleRef.CreateWithName(modName);
            var builder = LLVMBuilderRef.Create(mod.Context);
            if (TopLevel.Statements.Count > 0) {
                Function main = new Function();
                main.Name = "main";
                main.ReturnType = new VarType() { Type = VarTypeEnum.Primitive, Primitive = Primitives.Void };
                main.Parameters = new List<VarParameter>();
                main.Definition = TopLevel;
                main.ModulePath = rootFolder + "/" + modName;
                Universals.Add(main);
            }
            foreach (var u in Universals) {
                u.Compile(mod, builder, null);
            }
            return mod;
        }

    }

}
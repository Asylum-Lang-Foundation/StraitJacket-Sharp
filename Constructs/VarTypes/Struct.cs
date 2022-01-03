using System;
using System.Collections.Generic;
using System.Linq;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // An entry of a structure.
    public class StructEntry {
        public Modifier Modifier;
        public Variable Var;
    }

    // A custom structure.
    public class VarTypeStruct : VarType {
        public Scope Scope;
        public Modifier Modifier;
        public string Name;
        public List<VarTypeStruct> TypeImplements = new List<VarTypeStruct>();
        public List<StructEntry> Entries = new List<StructEntry>();

        public VarTypeStruct(Scope scope, Modifier modifier, string name, List<StructEntry> entries, List<VarTypeStruct> implements) {
            Scope = scope;
            Modifier = modifier;
            Name = name;
            Entries = entries;
            TypeImplements = implements;
        }

        protected override LLVMTypeRef LLVMType() {
            List<LLVMTypeRef> members = new List<LLVMTypeRef>();
            foreach (var i in TypeImplements) {
                foreach (var e in i.Entries) {
                    members.Add(e.Var.Type.GetLLVMType());
                }
            }
            foreach (var m in Entries) {
                members.Add(m.Var.Type.GetLLVMType());
            }
            return LLVMTypeRef.CreateStruct(members.ToArray(), false);
        }

        public override bool Equals(object obj) {
            // TODO!!!
            throw new System.NotImplementedException();
        }

        public override int GetHashCode() {
            // TODO!!!
            throw new System.NotImplementedException();
        }

    }

}
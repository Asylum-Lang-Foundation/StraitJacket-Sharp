using System;
using System.Collections.Generic;
using System.Linq;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // A custom structure.
    public class VarTypeStruct : VarType {
        public Scope Scope;
        public string Name;
        public List<VarType> Members;

        public VarTypeStruct(Scope scope, string name, List<VarType> members) {
            Scope = scope;
            Name = name;
            Members = members;
        }

        protected override LLVMTypeRef LLVMType() {
            List<LLVMTypeRef> members = new List<LLVMTypeRef>();
            foreach (var m in Members) {
                members.Add(m.GetLLVMType());
            }
            return LLVMTypeRef.CreateStruct(members.ToArray(), false);
        }

        public override bool Equals(object obj) {
            // TODO!!!
        }

        public override int GetHashCode() {
            // TODO!!!
        }

    }

}
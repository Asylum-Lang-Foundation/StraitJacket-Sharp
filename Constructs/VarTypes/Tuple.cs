using System;
using System.Collections.Generic;
using System.Linq;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Tuple/struct. A tuple is packed, where as a struct is not?
    public class VarTypeTuple : VarType {
        public List<VarType> Members;
        bool Packed;

        public VarTypeTuple(List<VarType> members, bool packed = false) {
            Type = VarTypeEnum.Tuple;
            Members = members;
            Packed = packed;
        }

        protected override LLVMTypeRef LLVMType() {
            List<LLVMTypeRef> members = new List<LLVMTypeRef>();
            foreach (var m in Members) {
                members.Add(m.GetLLVMType());
            }
            return LLVMTypeRef.CreateStruct(members.ToArray(), Packed);
        }

        public override bool Equals(object obj) {
            if (obj is VarTypeTuple) {
                var i = obj as VarTypeTuple;
                if (i.Constant != Constant) return false;
                if (i.Atomic != Atomic) return false;
                if (i.Volatile != Volatile) return false;
                if (i.Variadic != Variadic) return false;
                if (i.Members.Count != Members.Count) return false;
                for (int j = 0; j < i.Members.Count; j++) {
                    if (!i.Members[j].Equals(Members[j])) return false;
                }
                return i.Packed == Packed;
            }
            return false;
        }
        
        public override int GetHashCode() {
            HashCode hash = new HashCode();
            hash.Add(Type);
            hash.Add(Constant);
            hash.Add(Volatile);
            hash.Add(Atomic);
            hash.Add(Variadic);
            hash.Add(Members.GetHashCode());
            hash.Add(Packed.GetHashCode());
            return hash.ToHashCode();
        }

    }

}
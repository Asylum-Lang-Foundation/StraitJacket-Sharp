using System;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Points to more data.
    public class VarTypePointer : VarType {
        public VarType PointedTo;
        
        public VarTypePointer(VarType pointedTo) {
            Type = VarTypeEnum.Pointer;
            PointedTo = pointedTo;
        }

        public override bool RequiresLoad() => true;

        protected override LLVMTypeRef LLVMType() {
            return LLVMTypeRef.CreatePointer(PointedTo.GetLLVMType(), 0);
        }

        public override bool Equals(object obj) {
            if (obj is VarTypePointer) {
                var i = obj as VarTypePointer;
                if (i.Constant != Constant) return false;
                if (i.Atomic != Atomic) return false;
                if (i.Volatile != Volatile) return false;
                if (i.Variadic != Variadic) return false;
                return i.PointedTo.Equals(PointedTo);
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
            hash.Add(PointedTo.GetHashCode());
            return hash.ToHashCode();
        }

    }

}
using System;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // A signed or unsigned integer.
    public class VarTypeInteger : VarType {
        public bool Signed;
        public uint BitWidth;
        
        public VarTypeInteger(bool signed, uint bitWidth) {
            Type = VarTypeEnum.PrimitiveInteger;
            Signed = signed;
            BitWidth = bitWidth;
        }

        public override bool RequiresLoad() => true;

        protected override LLVMTypeRef LLVMType() {
            return LLVMTypeRef.CreateInt(BitWidth);
        }

        public override bool Equals(object obj) {
            if (obj is VarTypeInteger) {
                var i = obj as VarTypeInteger;
                if (i.Constant != Constant) return false;
                if (i.Atomic != Atomic) return false;
                if (i.Volatile != Volatile) return false;
                if (i.Variadic != Variadic) return false;
                return i.BitWidth == BitWidth && i.Signed == Signed;
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
            hash.Add(BitWidth);
            hash.Add(Signed);
            return hash.ToHashCode();
        }

    }

}
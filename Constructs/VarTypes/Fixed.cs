using System;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Fixed type integer.
    public class VarTypeFixed : VarType {
        public uint WholeWidth;
        public uint FractionWidth;

        public VarTypeFixed(uint wholeWidth, uint fractionWidth) {
            Type = VarTypeEnum.PrimitiveFixed;
            WholeWidth = wholeWidth;
            FractionWidth = fractionWidth;
        }

        protected override LLVMTypeRef LLVMType() {
            return LLVMTypeRef.CreateInt(WholeWidth + FractionWidth);
        }

        public override bool Equals(object obj) {
            if (obj is VarTypeFixed) {
                var i = obj as VarTypeFixed;
                if (i.Constant != Constant) return false;
                if (i.Atomic != Atomic) return false;
                if (i.Volatile != Volatile) return false;
                if (i.Variadic != Variadic) return false;
                return i.WholeWidth == WholeWidth && i.FractionWidth == FractionWidth;
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
            hash.Add(FractionWidth);
            return hash.ToHashCode();
        }

    }

}
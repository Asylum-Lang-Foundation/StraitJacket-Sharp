using System;
using LLVMSharp.Interop;

namespace StraitJacketLib.Constructs {

    // A signed or unsigned integer.
    public class VarTypeInteger : VarType {
        public bool Signed;
        public uint BitWidth;
        
        public VarTypeInteger(bool signed, uint bitWidth) {
            Type = VarTypeEnum.PrimitiveInteger;
            Signed = signed;
            BitWidth = bitWidth;
        }

        protected override LLVMTypeRef LLVMType() {
            return LLVMTypeRef.CreateInt(BitWidth);
        }

        public override bool CanImplicitlyCastTo(VarType other) {
            var otherInt = other as VarTypeInteger;
            if (otherInt != null) {
                return otherInt.BitWidth > BitWidth;
            } else {
                return base.CanImplicitlyCastTo(other);
            }
        }

        public override bool CanCastTo(VarType other) {
            if (other.IsFixed() || other.IsFloatingPoint() || other.IsUnsigned() || other.IsSigned()) {
                return true;
            } else {
                return base.CanImplicitlyCastTo(other);
            }
        }

        public override ReturnValue CastTo(ReturnValue srcVal, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder) {
            if (destType.Type == VarTypeEnum.PrimitiveInteger) {
                var src = this;
                var dest = destType as VarTypeInteger;
                if (src.BitWidth < dest.BitWidth) {
                    if (src.Signed) {
                        return new ReturnValue(builder.BuildSExt(srcVal.Val, destType.GetLLVMType(), "SJ_CastInt_SExt"));
                    } else {
                        return new ReturnValue(builder.BuildZExt(srcVal.Val, destType.GetLLVMType(), "SJ_CastInt_ZExt"));
                    }
                } else if (src.BitWidth > dest.BitWidth) {
                    return new ReturnValue(builder.BuildTrunc(srcVal.Val, dest.GetLLVMType(), "SJ_CastInt_Trunc"));
                } else {
                    return srcVal;
                }
            }
            return base.CastTo(srcVal, destType, mod, builder);
        }

        public override bool Equals(object obj) {
            if (obj is VarTypeCustom) return Equals((obj as VarTypeCustom).Resolved);
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

        public override string ToString() {
            return base.ToString() + (Signed ? "s" : "u") + BitWidth;
        }

    }

}
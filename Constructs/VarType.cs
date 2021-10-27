using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Linq;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Number type.
    public enum NumberType {
        Whole,
        Decimal
    }

    // A number.
    public class Number {
        public bool ForceSigned;
        public NumberType Type;
        public long ValueWhole;
        public double ValueDecimal;
        public uint MinBits => ForceSigned ? ((uint)Math.Log2(Math.Abs(ValueWhole)) + 2) : ((uint)Math.Log2((ulong)ValueWhole) + 1);
    }

    // Primitives.
    public enum Primitives {
        String,
        Bool,
        Unsigned,
        Signed,
        Half,
        Float,
        Double,
        Extended,
        Decimal,
        Fixed,
        VariableLength,
        Object,
        Void,
        Function,
        Event,
        Char,
        WideChar,
        UnsignedAny,
        SignedAny,
        FloatingAny,
        FixedAny
    }

    // Variable type enum
    public enum VarTypeEnum {
        PrimitiveSimple,
        PrimitiveInteger,
        PrimitiveFixed,
        PrimitiveFunction,
        Tuple,
        Pointer,
        Reference,
        Array,
        Custom,
        Generics
    }

    // Variable type.
    public abstract class VarType : IEqualityComparer<VarType> {
        public VarTypeEnum Type;
        public bool Constant;
        public bool Static;
        public bool Volatile;
        public bool Atomic;
        public bool Variadic;
        private bool TypeNotGotten = true;
        private LLVMTypeRef GottenType = null;
        public override string ToString() => Mangler.MangleType(this);

        // Disallow external creation.
        protected VarType() {}

        // For each member to get the LLVM type.
        protected abstract LLVMTypeRef LLVMType();

        // Get the LLVM type.
        public LLVMTypeRef GetLLVMType() {
            if (TypeNotGotten) {
                GottenType = LLVMType();
            }
            if (GottenType == null) throw new Exception("BAD TYPE!!!");
            return GottenType;
        }

        // If the type is floating point.
        public bool IsFloatingPoint() {
            var val = this as VarTypeSimplePrimitive;
            if (val != null) {
                SimplePrimitives prim = val.Primitive;
                return prim == SimplePrimitives.Half || prim == SimplePrimitives.Float || prim == SimplePrimitives.Double || prim == SimplePrimitives.Extended || prim == SimplePrimitives.Decimal;
            }
            return false;
        }

        // If type can be implicitly casted to another.
        public bool CanImplicitlyCastTo(VarType other) {
            return false;
        }

        // If type can be casted to another.
        public bool CanCastTo(VarType other) {
            return false;
        }

        // Cast to another type.
        public LLVMValueRef CastTo(LLVMValueRef srcVal, VarType destType, LLVMModuleRef mod LLVMBuilderRef builder) {

            // Check if castable.
            if (!CanCastTo(destType)) {
                return null;
            }

            // Generic object conversion, nothing is necessary just "hope it works".
            if (Type == VarTypeEnum.PrimitiveSimple && (this as VarTypeSimplePrimitive).Primitive == SimplePrimitives.Object) {
                return srcVal;
            }

            // Check for compiler-given conversions (extensions/truncations). Check integers here.
            if (Type == VarTypeEnum.PrimitiveInteger && destType.Type == VarTypeEnum.PrimitiveInteger) {
                var src = this as VarTypeInteger;
                var dest = destType as VarTypeInteger;
                if (src.BitWidth < dest.BitWidth) {
                    if (dest.Signed) {
                        return builder.BuildSExt(srcVal, destType.GetLLVMType(), "SJ_CastInt_SExt");
                    } else {
                        return builder.BuildZExt(srcVal, destType.GetLLVMType(), "SJ_CastInt_ZExt");
                    }
                } else if (src.BitWidth > dest.BitWidth) {
                    return builder.BuildTrunc(srcVal, dest.GetLLVMType(), "SJ_CastInt_Trunc");
                } else {
                    return srcVal;
                }
            }

            // TODO: FIXED POINT STUFF!!!
            if (Type == VarTypeEnum.PrimitiveFixed && destType.Type == VarTypeEnum.PrimitiveFixed) {

            }

            // Floating-point conversions.
            if (IsFloatingPoint() && destType.IsFloatingPoint()) {
                var src = this as VarTypeSimplePrimitive;
                var dest = destType as VarTypeSimplePrimitive;
                if (src.Primitive < dest.Primitive) {
                    return builder.BuildFPExt(srcVal, dest.GetLLVMType(), "SJ_CastFP_Ext");
                } else if (src.Primitive > dest.Primitive) {
                    return builder.BuildFPTrunc(srcVal, dest.GetLLVMType(), "SJ_CastFP_Trunc");
                } else {
                    return srcVal;
                }
            }

            // Use user-implemented method (has to exist to get this far).
            // TODO: Implement some kind of "implementation definition" that has a list of all the functions of a type.

        }

        public bool Equals(VarType x, VarType y) {
            if (x.Type != y.Type) return false;
            if (x.Type == VarTypeEnum.PrimitiveSimple) return ((VarTypeSimplePrimitive)x).Equals(y);
            else if (x.Type == VarTypeEnum.PrimitiveInteger) return ((VarTypeInteger)x).Equals(y);
            else if (x.Type == VarTypeEnum.PrimitiveFixed) return ((VarTypeFixed)x).Equals(y);
            else if (x.Type == VarTypeEnum.PrimitiveFunction) return ((VarTypeFunction)x).Equals(y);
            else if (x.Type == VarTypeEnum.Tuple) return ((VarTypeTuple)x).Equals(y);
            return false;
        }

        public int GetHashCode([DisallowNull] VarType x) {
            if (x.Type == VarTypeEnum.PrimitiveSimple) return ((VarTypeSimplePrimitive)x).GetHashCode();
            else if (x.Type == VarTypeEnum.PrimitiveInteger) return ((VarTypeInteger)x).GetHashCode();
            else if (x.Type == VarTypeEnum.PrimitiveFixed) return ((VarTypeFixed)x).GetHashCode();
            else if (x.Type == VarTypeEnum.PrimitiveFunction) return ((VarTypeFunction)x).GetHashCode();
            else if (x.Type == VarTypeEnum.Tuple) return ((VarTypeTuple)x).GetHashCode();
            return 0;
        }

    }

    // Variable parameter.
    public class VarParameter {
        public string Label;
        public Variable Value = new Variable();
        public List<LLVMValueRef> VariadicArgs;
    }

}
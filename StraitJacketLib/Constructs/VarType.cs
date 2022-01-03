using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Linq;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacketLib.Constructs {

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

        // If the type is fixed.
        public bool IsFixed() {
            return this as VarTypeFixed != null;
        }

        // If the type is unsigned.
        public bool IsUnsigned() {
            var val = this as VarTypeInteger;
            if (val != null) {
                return !val.Signed;
            }
            return false;
        }

        // If the type is signed.
        public bool IsSigned() {
            var val = this as VarTypeInteger;
            if (val != null) {
                return val.Signed;
            }
            return false;
        }

        // If type can be implicitly casted to another. TODO: CUSTOM CONVERSIONS!!!
        public virtual bool CanImplicitlyCastTo(VarType other) {
            if (other.Equals(this)) return true;
            if (other.Type == VarTypeEnum.Custom) return CanImplicitlyCastTo((other as VarTypeCustom).Resolved);
            return other.Equals(new VarTypeSimplePrimitive(SimplePrimitives.Object)) || Equals(new VarTypeSimplePrimitive(SimplePrimitives.Object));
        }

        // If type can be casted to another.
        public virtual bool CanCastTo(VarType other) {
            if (other.Equals(this)) return true;
            if (other.Type == VarTypeEnum.Custom) return CanCastTo((other as VarTypeCustom).Resolved);
            return other.Equals(new VarTypeSimplePrimitive(SimplePrimitives.Object)) || Equals(new VarTypeSimplePrimitive(SimplePrimitives.Object));
        }

        // Cast to another type. TODO!!!
        public virtual ReturnValue CastTo(ReturnValue srcVal, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder) {
            if (destType.Equals(this)) return srcVal;
            if (destType.Type == VarTypeEnum.Custom) return CastTo(srcVal, (destType as VarTypeCustom).Resolved, mod, builder);
            if (destType.Equals(new VarTypeSimplePrimitive(SimplePrimitives.Object)) || Equals(new VarTypeSimplePrimitive(SimplePrimitives.Object))) {
                return srcVal;
            } else {
                return null;
            }
        }

        /*

        // If type can be implicitly casted to another.
        public bool CanImplicitlyCastTo(VarType other) {
            return CanCastTo(other); // TODO!!!
        }

        // If type can be casted to another. TODO!!!
        public bool CanCastTo(VarType other) {

            // Handle custom types.
            if (Type == VarTypeEnum.Custom) {
                return (this as VarTypeCustom).Resolved.CanCastTo(other);
            } else if (other.Type == VarTypeEnum.Custom) {
                return CanCastTo((other as VarTypeCustom).Resolved);
            }

            // Object can always do so.
            if (Type == VarTypeEnum.PrimitiveSimple && (this as VarTypeSimplePrimitive).Primitive == SimplePrimitives.Object) return true;

            // Simple primitive.
            if (other.Type == VarTypeEnum.PrimitiveSimple) {

                // Get primitive type, can always convert to an object.
                var otherPrim = (other as VarTypeSimplePrimitive).Primitive;
                if (otherPrim == SimplePrimitives.Object) return true;

                // Simple primitive.
                if (Type == VarTypeEnum.PrimitiveSimple) {

                    // Get primitive, can always convert from object.
                    var prim = (this as VarTypeSimplePrimitive).Primitive;

                }
                
                // Not simple primitive.
                else {

                }

            }

            // Integer primitive.
            if (other.Type == VarTypeEnum.PrimitiveInteger) {
                if (Type == VarTypeEnum.PrimitiveInteger || Type == VarTypeEnum.PrimitiveFixed) {
                    return true;
                }
            }

            // Can't convert.
            return false;
            
        }

        // Cast to another type. TODO!!!
        public ReturnValue CastTo(ReturnValue srcVal, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder) {

            // Check if castable.
            if (!CanCastTo(destType)) {
                return null;
            }

            // Handle custom types.
            if (Type == VarTypeEnum.Custom) {
                return (this as VarTypeCustom).Resolved.CastTo(srcVal, destType, mod, builder);
            } else if (destType.Type == VarTypeEnum.Custom) {
                return CastTo(srcVal, (destType as VarTypeCustom).Resolved, mod, builder);
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

            // TODO: FIXED POINT STUFF!!!
            if (Type == VarTypeEnum.PrimitiveFixed && destType.Type == VarTypeEnum.PrimitiveFixed) {

            }

            // Floating-point conversions.
            if (IsFloatingPoint() && destType.IsFloatingPoint()) {
                var src = this as VarTypeSimplePrimitive;
                var dest = destType as VarTypeSimplePrimitive;
                if (src.Primitive < dest.Primitive) {
                    return new ReturnValue(builder.BuildFPExt(srcVal.Val, dest.GetLLVMType(), "SJ_CastFP_Ext"));
                } else if (src.Primitive > dest.Primitive) {
                    return new ReturnValue(builder.BuildFPTrunc(srcVal.Val, dest.GetLLVMType(), "SJ_CastFP_Trunc"));
                } else {
                    return srcVal;
                }
            }

            // Use user-implemented method (has to exist to get this far).
            // TODO: Implement some kind of "implementation definition" that has a list of all the functions of a type.
            return null;

        } */

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
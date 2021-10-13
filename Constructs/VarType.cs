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
        public uint MinBits => ForceSigned ? ((uint)Math.Log2(Math.Abs(ValueWhole)) + 2) : ((uint)Math.Log2(ValueWhole) + 1);
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

        public bool Equals(VarType x, VarType y)
        {
            if (x.Type != y.Type) return false;
            if (x.Type == VarTypeEnum.PrimitiveSimple) return ((VarTypeSimplePrimitive)x).Equals(y);
            else if (x.Type == VarTypeEnum.PrimitiveInteger) return ((VarTypeInteger)x).Equals(y);
            else if (x.Type == VarTypeEnum.PrimitiveFixed) return ((VarTypeFixed)x).Equals(y);
            else if (x.Type == VarTypeEnum.PrimitiveFunction) return ((VarTypeFunction)x).Equals(y);
            else if (x.Type == VarTypeEnum.Tuple) return ((VarTypeTuple)x).Equals(y);
            return false;
        }

        public int GetHashCode([DisallowNull] VarType x)
        {
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
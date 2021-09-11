using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
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
        ToBeDetermined,
        UnsignedAny,
        SignedAny,
        FloatingAny,
        FixedAny
    }

    // Variable type enum
    public enum VarTypeEnum {
        Primitive,
        Tuple,
        Custom,
        RawPointer,
        DietPointer,
        Array,
        Generics
    }

    // Variable type.
    public class VarType : IEqualityComparer<VarType> {
        public string Name;
        public VariableOrFunction ToResolve;
        public VarTypeEnum Type;
        public Primitives Primitive;
        public uint BitWidth;
        public uint FractionWidth;
        public VarType EmbeddedType;
        public VarType[] Members;
        public long ArrayLen;
        public bool Constant;
        public bool Static;
        public bool Volatile;
        public bool Atomic;
        public bool Variadic;
        public bool ContainsStruct;
        public Scope Scope;
        private bool TypeNotGotten = true;
        private LLVMTypeRef GottenType = null;
        public override string ToString() => Mangler.MangleType(this);

        // TODO!!!
        public LLVMTypeRef GetLLVMType() {
            if (TypeNotGotten) {
                switch (Type)
                {
                    case VarTypeEnum.Primitive:
                        switch (Primitive) {
                            case Primitives.String:
                                GottenType = LLVMTypeRef.CreatePointer(LLVMTypeRef.Int8, 0);
                                break;
                            case Primitives.Bool:
                                GottenType = LLVMTypeRef.Int1;
                                break;
                            case Primitives.Unsigned:
                                GottenType = LLVMTypeRef.CreateInt(BitWidth);
                                break;
                            case Primitives.Signed:
                                GottenType = LLVMTypeRef.CreateInt(BitWidth);
                                break;
                            case Primitives.Half:
                                GottenType = LLVMTypeRef.Half;
                                break;
                            case Primitives.Float:
                                GottenType = LLVMTypeRef.Float;
                                break;
                            case Primitives.Double:
                                GottenType = LLVMTypeRef.Double;
                                break;
                            case Primitives.Extended:
                                GottenType = LLVMTypeRef.X86FP80;
                                break;
                            case Primitives.Decimal:
                                GottenType = LLVMTypeRef.FP128;
                                break;
                            case Primitives.Fixed:
                                break;
                            case Primitives.VariableLength:
                                break;
                            case Primitives.Object:
                                break;
                            case Primitives.Void:
                                GottenType = LLVMTypeRef.Void;
                                break;
                            case Primitives.Function:
                                break;
                            case Primitives.Event:
                                break;
                            case Primitives.Char:
                                break;
                            case Primitives.WideChar:
                                break;
                            case Primitives.ToBeDetermined:
                                break;
                            case Primitives.UnsignedAny:
                                break;
                            case Primitives.SignedAny:
                                break;
                            case Primitives.FloatingAny:
                                break;
                            case Primitives.FixedAny:
                                break;
                        }
                        break;
                    case VarTypeEnum.Tuple:
                        break;
                    case VarTypeEnum.Custom:
                        GottenType = Scope.ResolveType(ToResolve).GetLLVMType();
                        break;
                    case VarTypeEnum.RawPointer:
                        break;
                    case VarTypeEnum.DietPointer:
                        break;
                    case VarTypeEnum.Array:
                        break;
                    case VarTypeEnum.Generics:
                        break;
                }
                TypeNotGotten = false;
            }
            if (GottenType == null) throw new Exception("BAD TYPE!!!");
            return GottenType;
        }

        // If two types are equal.
        public bool Equals(VarType x, VarType y)
        {

            // Matching type.
            if (x.Type == y.Type) {

                // Primitives. TODO (type isn't enough)!!!
                if (x.Type == VarTypeEnum.Primitive) {
                    return x.Primitive == y.Primitive;
                }

                // Tuple.
                if (x.Type == VarTypeEnum.Tuple) {
                    if (x.Members.Length == y.Members.Length) {
                        for (int i = 0; i < x.Members.Length; i++) {
                            if (x.Members[i] != y.Members[i]) return false;
                        }
                    }
                }

                // Custom.
                if (x.Type == VarTypeEnum.Custom) {
                    // TODO!!!
                    return true;
                }

                // Raw pointer.
                if (x.Type == VarTypeEnum.RawPointer) {
                    return x.EmbeddedType == y.EmbeddedType;
                }

                // Diet pointer.
                if (x.Type == VarTypeEnum.DietPointer) {
                    return x.EmbeddedType == y.EmbeddedType;
                }

                // Array.
                if (x.Type == VarTypeEnum.Array) {
                    return x.ArrayLen == y.ArrayLen && x.EmbeddedType == y.EmbeddedType;
                }

                // Generics.
                if (x.Type == VarTypeEnum.Generics) {
                    // TODO!!!
                    return true;
                }

            }

            // Type with a different reference.
            if (x.Type == VarTypeEnum.Custom || y.Type == VarTypeEnum.Custom) {
                // TODO!!!
                return true;
            }

            // Can't be the same type.
            return false;

        }

        // Hash code for types.
        public int GetHashCode([DisallowNull] VarType obj)
        {

            // Primitive.
            if (obj.Type == VarTypeEnum.Primitive) {
                // TODO!!!
            }
            
            // Unknown.
            return 0;

        }

    }

    // Variable parameter.
    public class VarParameter {
        public string Name;
        public VarType Type;
        public string Label;
    }

}
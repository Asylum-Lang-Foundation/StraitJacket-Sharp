
using System;
using System.Collections.Generic;
using LLVMSharp.Interop;

namespace StraitJacketLib.Constructs {

    // Simple primitives.
    public enum SimplePrimitives {
        ConstString,
        Bool,
        Half,
        Float,
        Double,
        Extended,
        Decimal,
        VariableLength,
        Object,
        Void,
        Char,
        WideChar,
        UnsignedAny,
        SignedAny,
        FloatingAny,
        FixedAny
    }

    // A simple primitive.
    public class VarTypeSimplePrimitive : VarType {
        public SimplePrimitives Primitive;

        public VarTypeSimplePrimitive(SimplePrimitives type) {
            Type = VarTypeEnum.PrimitiveSimple;
            Primitive = type;
        }

        protected override LLVMTypeRef LLVMType() {
            switch (Primitive) {
                case SimplePrimitives.ConstString:
                    return LLVMTypeRef.CreatePointer(LLVMTypeRef.Int8, 0);
                case SimplePrimitives.Bool:
                    return LLVMTypeRef.Int1;
                case SimplePrimitives.Half:
                    return LLVMTypeRef.Half;
                case SimplePrimitives.Float:
                    return LLVMTypeRef.Float;
                case SimplePrimitives.Double:
                    return LLVMTypeRef.Double;
                case SimplePrimitives.Extended:
                    return LLVMTypeRef.X86FP80;
                case SimplePrimitives.Decimal:
                    return LLVMTypeRef.FP128;
                case SimplePrimitives.VariableLength:
                    throw new Exception("TODO!!!");
                case SimplePrimitives.Object:
                    return LLVMTypeRef.CreatePointer(LLVMTypeRef.Int8, 0);
                case SimplePrimitives.Void:
                    return LLVMTypeRef.Void;
                case SimplePrimitives.Char:
                    return LLVMTypeRef.Int8;
                case SimplePrimitives.WideChar:
                    return LLVMTypeRef.Int16;
                case SimplePrimitives.UnsignedAny:
                case SimplePrimitives.SignedAny:
                case SimplePrimitives.FloatingAny:
                case SimplePrimitives.FixedAny:
                    throw new Exception("Can't make instance of abstract type!");
                default:
                    throw new Exception("?????????");
            }
        }

        public override bool Equals(object obj) {
            if (obj is VarTypeCustom) return Equals((obj as VarTypeCustom).Resolved);
            if (obj is VarTypeSimplePrimitive) {
                var i = obj as VarTypeSimplePrimitive;
                if (i.Constant != Constant) return false;
                if (i.Atomic != Atomic) return false;
                if (i.Volatile != Volatile) return false;
                if (i.Variadic != Variadic) return false;
                return i.Primitive == Primitive;
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
            hash.Add(Primitive);
            return hash.ToHashCode();
        }

        public override string ToString() {
            string ret = base.ToString();
            switch (Primitive) {
                case SimplePrimitives.ConstString:
                    ret += "string";
                    break;
                case SimplePrimitives.Bool:
                    ret += "bool";
                    break;
                case SimplePrimitives.Half:
                    ret += "f16";
                    break;
                case SimplePrimitives.Float:
                    ret += "f32";
                    break;
                case SimplePrimitives.Double:
                    ret += "f64";
                    break;
                case SimplePrimitives.Extended:
                    ret += "f80";
                    break;
                case SimplePrimitives.Decimal:
                    ret += "f128";
                    break;
                case SimplePrimitives.VariableLength:
                    ret += "varlen";
                    break;
                case SimplePrimitives.Object:
                    ret += "object";
                    break;
                case SimplePrimitives.Void:
                    ret += "void";
                    break;
                case SimplePrimitives.Char:
                    ret += "char";
                    break;
                case SimplePrimitives.WideChar:
                    ret += "wchar";
                    break;
                case SimplePrimitives.UnsignedAny:
                    ret += "unsigned";
                    break;
                case SimplePrimitives.SignedAny:
                    ret += "signed";
                    break;
                case SimplePrimitives.FloatingAny:
                    ret += "floating";
                    break;
                case SimplePrimitives.FixedAny:
                    ret += "fixed";
                    break;
                default:
                    throw new Exception("Can't get string for primitive type: " + Primitive.ToString());
            }
            return ret;
        }

    }

}
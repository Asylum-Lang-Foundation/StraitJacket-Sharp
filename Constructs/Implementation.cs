using System;
using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;
using StraitJacket.AST;

namespace StraitJacket.Constructs {

    // For operators.
    public enum Operators {
        Add,
        Sub,
        Mul,
        Div,
        Mod,
        BitwiseAnd,
        BitwiseOr,
        BitwiseXor,
        BitwiseNot,
        ValSetAdd,
        ValSetSub,
        ValSetMul,
        ValSetDiv,
        ValSetMod,
        ValSetExp,
        ValSetBitwiseAnd,
        ValSetBitwiseOr,
        ValSetBitwiseXor,
        ValSetBitwiseNot,
        Equals,
        NotEquals,
        GreaterThan,
        LessThan,
        GreaterThanEquals,
        LessThanEquals,
        Increment,
        Decrement
    }

    // Type implementation definition.
    public class Implementation {
        public VariableOrFunction Type;
        public VarType ResolvedType;
        public VarType InterfaceToImplement;
        public Dictionary<string, Function> Functions = new Dictionary<string, Function>();
        public Dictionary<Operators, Function> Operators = new Dictionary<Operators, Function>();
        public Dictionary<VarType, Function> ExplictCasts = new Dictionary<VarType, Function>();
        public Dictionary<VarType, Function> ImplicitCasts = new Dictionary<VarType, Function>();
    }

}
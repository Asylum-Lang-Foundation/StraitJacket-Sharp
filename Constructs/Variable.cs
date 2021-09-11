using System;
using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;
using StraitJacket.AST;

namespace StraitJacket.Constructs {

    public class Variable {
        public string Name;
        public Scope Scope;
        public VarType Type;
        public LLVMValueRef LLVMValue;
    }

}
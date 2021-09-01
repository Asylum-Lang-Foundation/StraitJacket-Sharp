using System.Collections.Generic;

namespace StraitJacket.Constructs {

    // For what is included.
    public class Scope {
        public string Name;
        public Scope Parent;
        public Dictionary<string, Scope> Children = new Dictionary<string, Scope>();
        public Dictionary<string, Function> Functions = new Dictionary<string, Function>();
        public Dictionary<string, Variable> Variables = new Dictionary<string, Variable>();
        public Dictionary<string, VarType> Types = new Dictionary<string, VarType>();

        public Function ResolveFunction(VariableOrFunction func) {
            if (func.Path.Equals("llvm")) {
                return AsyLLVM.Function;
            }
            if (Functions.ContainsKey(func.Path)) {
                return Functions[func.Path];
            } else if (Parent != null) {
                return Parent.ResolveFunction(func);
            } else {
                throw new System.Exception("Function not resolved!");
            }
        }

        public Variable ResolveVariable(VariableOrFunction func) {
            if (Variables.ContainsKey(func.Path)) {
                return Variables[func.Path];
            } else if (Parent != null) {
                return Parent.ResolveVariable(func);
            } else {
                throw new System.Exception("Variable not resolved!");
            }
        }

        public VarType ResolveType(VariableOrFunction type) {
            if (Types.ContainsKey(type.Path)) {
                return Types[type.Path];
            } else if (Parent != null) {
                return Parent.ResolveType(type);
            } else {
                if (type.Path.Equals("unsigned")) return new VarType() { Type = VarTypeEnum.Primitive, Primitive = Primitives.UnsignedAny };
                throw new System.Exception("Type not resolved!");
            }
        }

    }

}
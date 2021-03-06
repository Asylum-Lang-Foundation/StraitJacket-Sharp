using System.Collections.Generic;
using System.Linq;

namespace StraitJacketLib.Constructs {

    // Scope of variables, types, and functions. TODO: ALLOW SPLITTING NAMES BY PERIOD!!!
    public class Scope {
        public string Name;
        public Scope Parent;
        public Dictionary<string, Scope> Children = new Dictionary<string, Scope>();
        public static Dictionary<VarType, List<Implementation>> Implementations = new Dictionary<VarType, List<Implementation>>();
        private Dictionary<string, Dictionary<string, Function>> Functions = new Dictionary<string, Dictionary<string, Function>>();
        private Dictionary<string, Variable> Variables = new Dictionary<string, Variable>();
        private Dictionary<string, VarType> Types = new Dictionary<string, VarType>();
        private static Stack<Function> CurrentFunction = new Stack<Function>();
        public static Function PeekCurrentFunction => CurrentFunction.Count == 0 ? null : CurrentFunction.Peek();

        public void AddFunction(string name, string mangled, Function v) {
            if (Functions.ContainsKey(name)) {
                if (Functions[name].ContainsKey(mangled)) {
                    throw new System.Exception("DUPLICATE FUNCTION!!!");
                } else {
                    Functions[name].Add(mangled, v);
                }
            } else {
                Functions.Add(name, new Dictionary<string, Function>());
                Functions[name].Add(mangled, v);
            }
        }

        public void AddVar(string name, Variable v) {
            if (Variables.ContainsKey(name)) {
                throw new System.Exception("DUPLICATE VARIABLE!!!");
            } else {
                Variables.Add(name, v);
            }
        }

        public void AddType(string name, VarType v) {
            if (Types.ContainsKey(name)) {
                throw new System.Exception("DUPLICATE TYPE!!!");
            } else {
                Types.Add(name, v);
            }
        }

        public Function ResolveFunction(VariableOrFunction func) {
            if (func.Path.Equals("llvm")) {
                return AsyLLVM.Function;
            }
            if (Functions.ContainsKey(func.Path)) {
                return Functions[func.Path].Values.ElementAt(0);
            } else if (Parent != null) {
                return Parent.ResolveFunction(func);
            } else {
                throw new System.Exception("Function not resolved!");
            }
        }

        public List<Variable> ResolveVariable(VariableOrFunction v) {

            // Check if it is a parameter.
            List<Variable> ret = new List<Variable>();
            if (CurrentFunction.Count > 0) {
                var fn = CurrentFunction.Peek();
                 for (int i = 0; i < fn.Parameters.Count; i++) {
                    if (fn.Parameters[i].Value.Name.Equals(v.Path)) {
                        ret.Add(fn.Parameters[i].Value);
                    }
                }
            }

            // Then see if it is within this scope.
            if (Variables.ContainsKey(v.Path)) {
                ret.Add(Variables[v.Path]);
            }
            if (Functions.ContainsKey(v.Path)) {
                ret.AddRange(Functions[v.Path].Values);
            }
            if (ret.Count > 0) return ret;

            // Child scopes.
            if (Parent != null) {
                ret = Parent.ResolveVariable(v);
                if (ret.Count > 0) return ret;
            }

            // Hardcoded LLVM.
            if (v.Path.Equals("llvm")) {
                ret.Add(AsyLLVM.Function);
                return ret;
            }

            // Nothing found.
            throw new System.Exception("Variable not resolved!");

            /*if (CurrentFunction.Count > 0) {
                var fn = CurrentFunction.Peek();
                for (int i = 0; i < fn.Parameters.Count; i++) {
                    if (fn.Parameters[i].Value.Name.Equals(func.Path)) {
                        return fn.Parameters[i].Value;
                    }
                }
            }
            if (Variables.ContainsKey(func.Path)) {
                return Variables[func.Path];
            } else if (Functions.ContainsKey(func.Path)) {
                return Functions[func.Path].Values.ElementAt(0);
            } else if (Parent != null) {
                return Parent.ResolveVariable(func);
            }*/
            
        }

        public VarType ResolveType(VariableOrFunction type) {
            if (Types.ContainsKey(type.Path)) {
                return Types[type.Path];
            } else if (Parent != null) {
                return Parent.ResolveType(type);
            } else {
                if (type.Path.Equals("unsigned")) return new VarTypeSimplePrimitive(SimplePrimitives.UnsignedAny);
                throw new System.Exception("Type not resolved!");
            }
        }

        // Push function so its parameters can be resolved.
        public static void PushFunction(Function f) {
            CurrentFunction.Push(f);
        }

        // Pop a function.
        public static void PopFunction() {
            CurrentFunction.Pop();
        }

        // String path.
        public override string ToString() {
            string ret = "";
            if (Parent != null && Parent.Name != "") ret = Parent.ToString() + ".";
            if (Name != "") ret += Name + ".";
            return ret;
        }

    }

}
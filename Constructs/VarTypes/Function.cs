using System;
using System.Collections.Generic;
using System.Linq;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Function type.
    public class VarTypeFunction : VarType {
        public VarType ReturnType;
        public List<VarType> Parameters;

        public VarTypeFunction(VarType retType, List<VarType> parameters) {
            Type = VarTypeEnum.PrimitiveFunction;
            ReturnType = retType;
            Parameters = parameters;
        }

        public override bool RequiresLoad() => false;

        protected override LLVMTypeRef LLVMType() {
            List<LLVMTypeRef> parameters = new List<LLVMTypeRef>();
            bool variadic = false;
            foreach (var m in Parameters) {
                parameters.Add(m.GetLLVMType());
            }
            if (parameters.Count > 0) {
                var last = Parameters.Last();
                if (last.Variadic) {
                    variadic = true;
                    parameters.Remove(parameters.Last());
                }
            }
            return LLVMTypeRef.CreateFunction(ReturnType.GetLLVMType(), parameters.ToArray(), variadic);
        }

        public override bool Equals(object obj) {
            if (obj is VarTypeFunction) {
                var i = obj as VarTypeFunction;
                if (i.Constant != Constant) return false;
                if (i.Atomic != Atomic) return false;
                if (i.Volatile != Volatile) return false;
                if (i.Variadic != Variadic) return false;
                if (i.Parameters.Count != Parameters.Count) return false;
                for (int j = 0; j < i.Parameters.Count; j++) {
                    if (!i.Parameters[j].Equals(Parameters[j])) return false;
                }
                return i.ReturnType.Equals(ReturnType);
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
            hash.Add(ReturnType.GetHashCode());
            hash.Add(Parameters.GetHashCode());
            return hash.ToHashCode();
        }

    }

}
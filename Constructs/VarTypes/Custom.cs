using System;
using System.Collections.Generic;
using System.Linq;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Actually resolves to a typedef, struct, union, or function.
    public class VarTypeCustom : VarType {
        public VariableOrFunction ToResolve;
        public VarType Resolved {
            get {
                if (m_Resolved == null) {
                    m_Resolved = ToResolve.Scope.ResolveType(ToResolve);
                }
                return m_Resolved;
            }
        }
        VarType m_Resolved;

        public VarTypeCustom(VariableOrFunction toResolve) {
            Type = VarTypeEnum.Custom;
            ToResolve = toResolve;
        }

        public override bool RequiresLoad() => Resolved.RequiresLoad();

        protected override LLVMTypeRef LLVMType() {
            return Resolved.GetLLVMType();
        }

        public override bool Equals(object obj) {
            return Resolved.Equals(obj);
        }

        public override int GetHashCode() {
            return Resolved.GetHashCode();
        }
        
    }

}
using System;
using System.Collections.Generic;
using System.Linq;
using LLVMSharp.Interop;

namespace StraitJacketLib.Constructs {

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

        protected override LLVMTypeRef LLVMType() {
            return Resolved.GetLLVMType();
        }

        public override bool CanImplicitlyCastTo(VarType other) {
            return Resolved.CanImplicitlyCastTo(other);
        }

        public override bool CanCastTo(VarType other) {
            return Resolved.CanCastTo(other);
        }

        public override ReturnValue CastTo(ReturnValue srcVal, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder) {
            return Resolved.CastTo(srcVal, destType, mod, builder);
        }

        public override bool Equals(object obj) {
            return Resolved.Equals(obj);
        }

        public override int GetHashCode() {
            return Resolved.GetHashCode();
        }

        public override string ToString() {
            return m_Resolved == null ? ToResolve.ToString() : Resolved.ToString();
        }
        
    }

}
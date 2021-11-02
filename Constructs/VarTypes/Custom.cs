using System;
using System.Collections.Generic;
using System.Linq;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Actually resolves to a typedef, struct, union, or function.
    public class VarTypeCustom : VarType {
        public VariableOrFunction ToResolve;
        VarType Resolved;

        public VarTypeCustom(VariableOrFunction toResolve) {
            Type = VarTypeEnum.Custom;
            ToResolve = toResolve;
        }

        protected override LLVMTypeRef LLVMType() {
            throw new NotImplementedException();
        }
        
    }

}
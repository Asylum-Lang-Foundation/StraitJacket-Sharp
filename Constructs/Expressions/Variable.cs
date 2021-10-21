using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // A variable to resolve.
    public class ExpressionVariable : Expression {
        public VariableOrFunction ToResolve;
        Variable Resolved;

        public ExpressionVariable(VariableOrFunction toResolve) {
            ToResolve = toResolve;
        }

    }

}
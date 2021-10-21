using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Call the result of a value of a function.
    public class ExpressionCall : Expression {
        public Expression ToCall;
        public ExpressionComma Parameters;

        public ExpressionCall(Expression toCall, ExpressionComma parameters) {
            ToCall = toCall;
            Parameters = parameters;
        }

        public override void ResolveVariables() {
            ToCall.ResolveVariables();
            Parameters.ResolveVariables();
        }

        public override void ResolveTypes() {
            // TODO: TOCALL MUST KNOW ABOUT PARAMETERS TO SELECT CORRECT FUNCTION!!!
            Parameters.ResolveTypes();
            ToCall.ResolveTypes();
        }

    }

}
using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Cast an expression to another type of expression.
    public class ExpressionCast : Expression {
        public Expression ToCast;
        public VarType DestType;
        VarType SrcType;

        public ExpressionCast(Expression toCast, VarType destType) {
            ToCast = toCast;
            DestType = destType;
        }

        public override void ResolveCalls() { ToCast.ResolveCalls(); }
        public override void ResolveVariables() { ToCast.ResolveVariables(); }
        public override void ResolveTypes() { ToCast.ResolveTypes(); SrcType = ToCast.ReturnType(); }

        public override VarType ReturnType() {
            return DestType;
        }

        public override LLVMValueRef Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            throw new System.NotImplementedException();
        }

    }

}
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

        public override void ResolveVariables() {
            ToCast.ResolveVariables();
        }

        public override void ResolveTypes() {
            ToCast.ResolveTypes();
            SrcType = ToCast.ReturnType();
            if (!SrcType.CanCastTo(DestType)) {
                throw new System.Exception("BAD CAST!!!");
            }
        }

        public override VarType ReturnType() {
            return DestType;
        }

        public override bool IsPlural() {
            return false;
        }

        public override void StoreSingle(ReturnValue src, ReturnValue dest, VarType srcType, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            throw new System.NotImplementedException();
        }

        public override void StorePlural(ReturnValue src, ReturnValue dest, VarType srcType, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            throw new System.NotImplementedException(); // How did we get here???
        }

    }

}
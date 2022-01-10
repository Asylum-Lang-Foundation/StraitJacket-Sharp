using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacketLib.Constructs {

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
            LValue = false;
            SrcType = ToCast.ReturnType();
            if (!SrcType.CanCastTo(DestType)) {
                throw new System.Exception("BAD CAST!!!");
            }
        }

        public override VarType GetReturnType() {
            return DestType;
        }

        public override bool IsPlural() {
            return false;
        }

        // This should NEVER happen, you can't store into a cast!
        public override void StoreSingle(ReturnValue src, ReturnValue dest, VarType srcType, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            throw new System.Exception("??????");
        }

        // This should NEVER happen, you can't store into a cast!
        public override void StorePlural(ReturnValue src, ReturnValue dest, VarType srcType, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            throw new System.Exception("??????");
        }

        // Compile the cast.
        public override ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            ReturnValue toCast = ToCast.Compile(mod, builder, param);
            if (ToCast.LValue) toCast = new ReturnValue(builder.BuildLoad(toCast.Val, "SJ_Load"));
            return SrcType.CastTo(toCast, DestType, mod, builder);
        }

        public override string ToString() {
            return "((" + DestType + ")" + ToCast.ToString() + ")";
        }

    }

}
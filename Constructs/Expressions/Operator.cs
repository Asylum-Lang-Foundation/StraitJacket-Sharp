using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Operator that returns a value from two expressions.
    public class ExpressionOperator : Expression {
        public List<Expression> Inputs = new List<Expression>();
        public Operator Operator;
        VarType RetType;

        public ExpressionOperator(List<Expression> inputs, Operator op) {
            Inputs = inputs;
            Operator = op;
        }

        public override ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param)
        {
            throw new System.NotImplementedException();
        }

        public override bool IsPlural()
        {
            throw new System.NotImplementedException();
        }

        public override VarType ReturnType()
        {
            throw new System.NotImplementedException();
        }

        public override void StorePlural(ReturnValue src, ReturnValue dest, VarType srcType, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder, object param)
        {
            throw new System.NotImplementedException();
        }

        public override void StoreSingle(ReturnValue src, ReturnValue dest, VarType srcType, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder, object param)
        {
            throw new System.NotImplementedException();
        }

    }

}
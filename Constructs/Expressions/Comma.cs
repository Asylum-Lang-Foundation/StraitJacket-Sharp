using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Comma operator, which basically separates expressions.
    // Use this to feed functions, even if less than 2 parameters are given.
    // After compiling, you get the values by an index from another function.
    // This approach is hacky, but using an alloca arbitrily is bad unless it can be alloca'd at the entry.
    public class ExpressionComma : Expression {
        public List<Expression> Expressions;
        VarTypeTuple DestType;
        List<LLVMValueRef> ExpressionValues;

        public ExpressionComma(List<Expression> expressions) {
            Expressions = expressions;
        }

        public override void ResolveVariables() {
            foreach (var e in Expressions) {
                e.ResolveVariables();
            }
        }

        public override void ResolveTypes() { 
            List<VarType> memberTypes = new List<VarType>();
            foreach (var e in Expressions) {
                e.ResolveTypes();
                memberTypes.Add(e.ReturnType());
            }
            DestType = new VarTypeTuple(memberTypes);
        }

        public override VarType ReturnType() {
            return DestType;
        }

        public LLVMValueRef GetLLVMValue(int index) {
            return ExpressionValues[index];
        }

        // NOTICE: NEVER USE THIS TO GET A VALUE!
        public override LLVMValueRef Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            ExpressionValues = new List<LLVMValueRef>();
            foreach (var e in Expressions) {
                ExpressionValues.Add(e.Compile(mod, builder, param));
            }
            return null;
        }
        
    }

}
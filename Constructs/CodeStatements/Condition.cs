using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // A conditional statement, such as if-else.
    public class Condition : ICompileable {
        public Expression ConditionCheck;
        public CodeStatements Then;
        public CodeStatements Else;
        public FileContext FileContext;

        public FileContext GetFileContext() => FileContext;

        // Create a new condition.
        public Condition(Expression conditionCheck, CodeStatements then, CodeStatements other = null) {
            ConditionCheck = conditionCheck;
            Then = then;
            Else = other;
        }

        // Resolve variables.
        public void ResolveVariables() {
            ConditionCheck.ResolveVariables();
            Then.ResolveVariables();
            if (Else != null) Else.ResolveVariables();
        }

        // Resolve types.
        public void ResolveTypes() {
            ConditionCheck.ResolveTypes();
            Then.ResolveTypes();
            if (Else != null) Else.ResolveTypes();
            if (ConditionCheck.ReturnType().Equals(new VarTypeSimplePrimitive(SimplePrimitives.Bool))) {
                throw new System.Exception("?????????");
            }
        }

        // Compile the conditional branch.
        public ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {

            // Control flow blocks. Then - If condition is met. Other - Condition is not met. Cont - Both if and else continue here.
            LLVMBasicBlockRef then = null;
            LLVMBasicBlockRef other = null;
            LLVMBasicBlockRef cont = null;

            // Append necessary blocks.
            then = LLVMBasicBlockRef.AppendInContext(mod.Context, Scope.PeekCurrentFunction.LLVMValue, "SJ_IfThen");
            if (Else != null) other = LLVMBasicBlockRef.AppendInContext(mod.Context, Scope.PeekCurrentFunction.LLVMValue, "SJ_IfElse");
            cont = LLVMBasicBlockRef.AppendInContext(mod.Context, Scope.PeekCurrentFunction.LLVMVal, "SJ_IfCont");
            
            // Compile condition.
            LLVMValueRef conditionCheck = ConditionCheck.Compile(mod, builder, param).Val;
            builder.BuildCondBr(ConditionCheck.Compile(mod, builder, param).Val, then, other == null ? cont : other);

            // Compile then.
            builder.PositionAtEnd(then);
            Then.Compile(mod, builder, param);
            builder.BuildBr(cont);

            // Compile else.
            if (other != null) { 
                builder.PositionAtEnd(other);
                Else.Compile(mod, builder, param);
                builder.BuildBr(cont);
            }

            // Resume compiling at the continuation.
            builder.PositionAtEnd(cont);

            // We don't return anything.
            return null;

        }

    }

}
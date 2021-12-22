using System.Collections.Generic;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // A loop that repeats itself infinitely.
    public class Loop : ICompileable {
        public static Stack<Loop> LoopStack = new Stack<Loop>();
        public CodeStatements Body;
        public CodeStatements RunBeforeLoop;
        public LLVMBasicBlockRef BodyBlock;
        public LLVMBasicBlockRef BreakBlock;
        public FileContext FileContext;

        public FileContext GetFileContext() => FileContext;

        public Loop(CodeStatements body, CodeStatements runBeforeLoop = null) {
            Body = body;
            RunBeforeLoop = runBeforeLoop;
        }

        // Resolve variables.
        public void ResolveVariables() {
            LoopStack.Push(this);
            Body.ResolveVariables();
            LoopStack.Pop();
            if (RunBeforeLoop != null) RunBeforeLoop.ResolveVariables();
        }

        // Resolve types.
        public void ResolveTypes() {
            LoopStack.Push(this);
            Body.ResolveTypes();
            LoopStack.Pop();
            if (RunBeforeLoop != null) RunBeforeLoop.ResolveTypes();
        }

        // Compile the loop.
        public ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {

            // Create the blocks.
            BodyBlock = LLVMBasicBlockRef.AppendInContext(mod.Context, Scope.PeekCurrentFunction.LLVMVal, "SJ_Loop");
            BreakBlock = LLVMBasicBlockRef.AppendInContext(mod.Context, Scope.PeekCurrentFunction.LLVMVal, "SJ_LoopBreak");

            // Build a jump into the body block.
            if (RunBeforeLoop != null) RunBeforeLoop.Compile(mod, builder, param);
            builder.BuildBr(BodyBlock);

            // Necessary for breaks to occur.
            LoopStack.Push(this);

            // Build the body block.
            builder.PositionAtEnd(BodyBlock);
            Body.Compile(mod, builder, param);
            builder.BuildBr(BodyBlock);

            // Continue at the end block.
            builder.PositionAtEnd(BreakBlock);

            // Pop the break.
            LoopStack.Pop();

            // We don't return anything.
            return null;

        }

    }

}
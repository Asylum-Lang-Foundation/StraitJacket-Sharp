using System.Collections;
using System.Collections.Generic;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Continue the loop.
    public class Continue : ICompileable {
        public int ContinueNum; // How many loops to continue.
        public FileContext FileContext;

        public FileContext GetFileContext() => FileContext;

        public Continue(int continueNum) {
            ContinueNum = continueNum;
        }

        // Resolve variables.
        public void ResolveVariables() {}

        // Resolve types.
        public void ResolveTypes() {
            if (ContinueNum > Loop.LoopStack.Count) {
                throw new System.Exception("Breaking out of too many loops!");
            }
        }

        public void CompileDeclarations(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {}

        // Compile the break.
        public ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) { 

            // Only compile if not dead.
            if (CodeStatements.BlockTerminated) return null;

            // Jump to the correct exit.
            Stack<Loop> tmp = new Stack<Loop>();
            for (int i = 0; i < ContinueNum; i++) {
                tmp.Push(Loop.LoopStack.Pop()); // Break out of this many loops.
            }
            builder.BuildBr(tmp.Peek().BodyBlock); // Jump back to loop again.
            for (int i = 0; i < ContinueNum; i++) {
                Loop.LoopStack.Push(tmp.Pop()); // Add the loops back to the stack.
            }
            CodeStatements.BlockTerminated = true;

            // Don't return.
            return null;

        }


    }

}
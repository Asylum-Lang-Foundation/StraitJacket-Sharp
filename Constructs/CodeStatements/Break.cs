using System.Collections;
using System.Collections.Generic;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Break out of a loop.
    public class Break : ICompileable {
        public int BreakNum; // How many loops to break from.
        public FileContext FileContext;

        public FileContext GetFileContext() => FileContext;

        public Break(int breakNum) {
            BreakNum = breakNum;
        }

        // Resolve variables.
        public void ResolveVariables() {}

        // Resolve types.
        public void ResolveTypes() {
            if (BreakNum > Loop.LoopStack.Count) {
                throw new System.Exception("Breaking out of too many loops!");
            }
        }

        // Compile the break.
        public ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) { 

            // Jump to the correct exit.
            Stack<Loop> tmp = new Stack<Loop>();
            for (int i = 0; i < BreakNum; i++) {
                tmp.Push(Loop.LoopStack.Pop()); // Break out of this many loops.
            }
            builder.BuildBr(tmp.Peek().BreakBlock); // Jump to break block.
            for (int i = 0; i < BreakNum; i++) {
                Loop.LoopStack.Push(tmp.Pop()); // Add the loops back to the stack.
            }

            // Don't return.
            return null;

        }


    }

}
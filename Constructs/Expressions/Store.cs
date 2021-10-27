using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Store a value somewhere. Operates different depending on how many values are returned.
    public class ExpressionStore : Expression {
        public Expression Src;
        public Expression Dest;

    }

}
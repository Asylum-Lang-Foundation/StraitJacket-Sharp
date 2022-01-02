using System.Collections.Generic;
using StraitJacket.Constructs;
using LLVMSharp.Interop;

namespace StraitJacket.Builder {

    // Asylum program builder.
    public partial class ProgramBuilder {
        Dictionary<string, Constructs.AST> ASTs = new Dictionary<string, Constructs.AST>();
        CodeStatements TopLevel = new CodeStatements();
        CodeStatements CurrStatements;

        // Create a new builder.
        public ProgramBuilder(Constructs.AST easl, Scope easlScope, int scopeNum) {
            ASTs.Add("EASL", easl);
            CurrScope = easlScope;
            ScopeNum = scopeNum;
            CurrStatements = TopLevel;
        }

        // Compile the code.
        public Dictionary<string, LLVMModuleRef> Compile() {
            Dictionary<string, LLVMModuleRef> ret = new Dictionary<string, LLVMModuleRef>();
            if (TopLevel.Statements.Count > 0) {
                ASTs[TopLevelFile].TopLevel = TopLevel;
            }
            foreach (var s in ASTs.Keys) {
                ASTs[s].PrepareForCompilation();
                var mod = ASTs[s].Compile(s, "");
                if (!s.Equals("EASL")) mod.Verify(LLVMVerifierFailureAction.LLVMPrintMessageAction);
                ret.Add(s, mod);
            }
            return ret;
        }

    }

}
using StraitJacket.Constructs;

namespace StraitJacket.AST {

    // Context for building files.
    public class BuildContext {

        // Current scope for resolving types and variables.
        public Scope CurrentScope = new Scope() { Name = "" };

        // Universal AST for defined types and EASL.
        public StraitJacket.Constructs.AST UniversalAST = new Constructs.AST();

        // Current AST.
        public StraitJacket.Constructs.AST CurrentAST;

        // If compiling for the universal namespace (types and EASL).
        public bool UniversalMode;

        // Mode that is currently being visited.
        public Compiler.VisitMode VisitMode;

        // Reference to the current implementation.
        public Implementation Implementation;

        // Name of the module.
        public string ModuleName;

    }

}
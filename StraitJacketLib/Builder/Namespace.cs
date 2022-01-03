using StraitJacketLib.Constructs;

namespace StraitJacketLib.Builder { 

    // Asylum program builder.
    public partial class ProgramBuilder {

        // A namespace statement.
        public void StatementNamespace(string nameSpace) {

            // First, we must unwind all the way back to the root namespace.
            while (CurrScope.Parent != null) {
                CurrScope = CurrScope.Parent;
            }

            // Now enter the correct namespace.
            string[] spaces = nameSpace.Split('.');
            foreach (var s in spaces) {
                EnterScope(s, true);
            }

        }

        // Using statement.
        public void UsingStatement(string usingSpace) {
            throw new System.NotImplementedException(); // TODO!!!
        }

    }

}
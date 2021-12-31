using System.Collections.Generic;
using StraitJacket.Constructs;

namespace StraitJacket.Builder {

    // Asylum program builder.
    public partial class Builder {
        Dictionary<string, Constructs.AST> ASTs = new Dictionary<string, Constructs.AST>();
        CodeStatements TopLevel = new CodeStatements();
        CodeStatements CurrStatements;

    }

}
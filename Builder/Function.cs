using System.Collections.Generic;
using StraitJacket.Constructs;

namespace StraitJacket.Builder {

    // Asylum program builder.
    public partial class Builder {
        Function CurrFunction = null;

        // Begin a function. TODO: ATTRIBUTES, MODIFIERS, GENERICS!!!
        public void BeginFunction(string name, VarType returnType, List<VarParameter> parameters) {
            
            // Start creating a new function.
            Function fn = new Function();
            fn.Name = name;
            fn.Scope = Scope();
            fn.ModulePath = CurrFile;

            // Modifiers.
            if ((CurrModifier & Modifier.Inline) > 0) {
                fn.Inline = true;
            }
            if ((CurrModifier & Modifier.Static) > 0) {
                fn.Static = true;
            }

            // Parameters.
            fn.Parameters = parameters;

        }

        // End a function.
        public void EndFunction() {
            if (CurrFunction == null) throw new System.Exception("No function to end!");
            AST.Universals.Add(CurrFunction);
            CurrFunction = null;
        }

    }

}
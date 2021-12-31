using System.Collections.Generic;
using System.Linq;
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
            if ((CurrModifier & Modifier.Async) > 0) {
                fn.Async = true;
            }


            // Parameters.
            fn.Parameters = parameters;
            if (fn.Parameters.Count() > 0 && fn.Parameters.Last().Value.Type.Variadic) {
                fn.Variadic = true;
            }

            // Return type.
            fn.ReturnType = returnType;

            // Init function.
            fn.Type = new VarTypeFunction(returnType, parameters.Select(x => x.Value.Type).ToList());
            EnterScope("%FN%_" + fn.ToString());
            fn.Scope.AddFunction(fn.Name, fn.ToString(), fn);
            fn.Definition = new CodeStatements();
            CurrStatements = fn.Definition;

        }

        // End a function.
        public void EndFunction() {
            if (CurrFunction == null) throw new System.Exception("No function to end!");

            // Cleanup.
            CurrStatements = null;
            AST.Universals.Add(CurrFunction);
            CurrFunction = null;
            ExitScope();

        }

        // Declare an external function. TODO: ATTRIBUTES, MODIFIERS, GENERICS!!!
        public void ExternFunction(string name, VarType returnType, List<VarParameter> parameters) {

            // Start creating a new function.
            Function fn = new Function();
            fn.Extern = true;
            fn.Static = true;
            fn.Name = name;
            fn.Scope = Scope();
            fn.Scope.AddFunction(fn.Name, fn.Name, fn); // No mangling.
            fn.ModulePath = CurrFile;

            // Modifiers.
            if ((CurrModifier & Modifier.Async) > 0) {
                fn.Async = true;
            }

            // Parameters.
            fn.Parameters = parameters;
            if (fn.Parameters.Count() > 0 && fn.Parameters.Last().Value.Type.Variadic) {
                fn.Variadic = true;
            }

            // Return type.
            fn.ReturnType = returnType;

            // Finished.
            fn.Type = new VarTypeFunction(fn.ReturnType, fn.Parameters.Select(x => x.Value.Type).ToList());

        }

    }

}
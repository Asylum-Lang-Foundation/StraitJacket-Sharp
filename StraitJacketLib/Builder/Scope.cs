using System.Collections.Generic;
using StraitJacketLib.Constructs;

namespace StraitJacketLib.Builder {

    // Asylum program builder.
    public partial class ProgramBuilder {
        Scope CurrScope;
        int ScopeNum;

        // Enter a subset of a scope, be it a function, if statement, namespace, etc.
        private void EnterScope(string name, bool allowReEnter = false) {

            // If it's a blank name, we're in something like an if statement or loop and want a unique identifier.
            if (name == "") {
                name = "%?%_" + ScopeNum++;
            }

            // Scope already exists.
            if (CurrScope.Children.ContainsKey(name)) {
                if (allowReEnter) {
                    CurrScope = CurrScope.Children[name];
                } else {
                    throw new System.Exception("Duplicate scope but re-entering is not allowed: " + name);
                }
            }
            
            // Scope doesn't exist already, so add it.
            else {
                var parent = CurrScope;
                CurrScope.Children.Add(name, new Scope());
                CurrScope = CurrScope.Children[name];
                CurrScope.Name = name;
                CurrScope.Parent = parent;
            }

        }

        // Exit a scope.
        private void ExitScope() {
            CurrScope = CurrScope.Parent;
        }

        // Get the current scope.
        public Scope Scope() => CurrScope;
        
    }

}
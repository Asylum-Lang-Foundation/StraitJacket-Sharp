using System.Collections.Generic;
using StraitJacket.Constructs;

namespace StraitJacket.Builder { 

    // Asylum program builder.
    public partial class ProgramBuilder {
        Modifier CurrModifier = Modifier.Protected;
        Stack<Modifier> ModifierStack = new Stack<Modifier>();

        // Reset the modifier back to its default.
        public void ModifierDefault() {
            while (ModifierStack.Count > 0) {
                PopModifier();
            }
        }

        // Push a modifier.
        public void PushModifier(Modifier modifier) {
            ModifierStack.Push(CurrModifier);
            CurrModifier = modifier;
        }

        // Pop a modifier.
        public void PopModifier() {
            if (ModifierStack.Count <= 0) throw new System.Exception("Can't pop more modifiers than present!");
            CurrModifier = ModifierStack.Pop();
        }
        
    }

}
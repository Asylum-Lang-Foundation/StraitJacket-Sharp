using System.Collections.Generic;
using System.Linq;
using StraitJacketLib.Constructs;

namespace StraitJacketLib.Builder {

    // Asylum program builder. TODO: PROPERTIES!!!
    public partial class ProgramBuilder {
        VarTypeStruct CurrStruct = null;

        // Start building a struct.
        public void BeginStruct(string name, params VarTypeStruct[] implements) {
            CurrStruct = new VarTypeStruct(Scope(), CurrModifier, name, new List<StructEntry>(), implements.ToList());
            Scope().AddType(name, CurrStruct);
            EnterScope("Struct_" + name);
        }

        // Add a struct entry.
        public void StructEntry(VarType type, string name) {
            if (CurrStruct == null) throw new System.Exception("Currently not in a struct!");
            StructEntry e = new StructEntry();
            e.Modifier = CurrModifier;
            e.Var = new Variable();
            e.Var.Name = name;
            e.Var.Type = type;
            if (CurrStruct.Entries.Where(x => x.Var.Name.Equals(name)).Count() > 0 || name.Equals("base") || name.Equals("bases") || name.Equals("this") || name.Equals("This")) {
                throw new System.Exception("Variable with name " + name + " already exists in struct!");
            }
            CurrStruct.Entries.Add(e);
        }

        // Stop building a struct.
        public void EndStruct() {
            if (CurrStruct == null) throw new System.Exception("Currently not in a struct!");
            CurrStruct = null;
            ExitScope();
        }

    }

}
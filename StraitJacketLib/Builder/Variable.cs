using System.Collections.Generic;
using System.Linq;
using StraitJacketLib.Constructs;

namespace StraitJacketLib.Builder {

    // Asylum program builder.
    public partial class ProgramBuilder {

        // Create a new variable or function.
        public VariableOrFunction VariableOrFunction(string path) {
            return new VariableOrFunction()
            {
                Path = path,
                Scope = Scope()
            };
        }

        // Create a new variable expression.
        public ExpressionVariable ExpressionVariable(string path) {
            return new ExpressionVariable(VariableOrFunction(path));
        }

        // Create a variable.
        public Variable Variable(VarType type, string name) {
            return new Variable() {
                Name = name,
                Scope = Scope(),
                Type = type
            };
        }

        // Variable definition.
        public VariableDefinition VariableDefinition(Expression definition, params Variable[] vars) {
            foreach (var v in vars) {
                Scope().AddVar(v.Name, v);
            }
            return new VariableDefinition(vars.ToList(), definition);
        }

        // Custom type.
        public VarTypeCustom VarTypeCustom(string path) {
            return new VarTypeCustom(VariableOrFunction(path));
        }

        // Shortcut a type definition.
        public void Typedef(VarType oldType, string newType) {
            Scope().AddType(newType, oldType);
        }

    }

}
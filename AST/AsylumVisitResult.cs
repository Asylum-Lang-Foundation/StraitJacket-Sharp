using System.Collections.Generic;
using StraitJacket.Constructs;

namespace StraitJacket.AST {

    // For storing information about the result.
    public class AsylumVisitResult {
        public Attribute Attribute;
        public CodeStatement CodeStatement;
        public Expression Expression;
        public Function Function;
        public FunctionCall FunctionCall;
        public Implementation Implementation;
        public Modifier Modifier;
        public VarParameter Parameter;
        public List<VarParameter> Parameters;
        public Variable Variable;
        public VariableOrFunction VariableOrFunction;
        public VarType VariableType;
    }

}
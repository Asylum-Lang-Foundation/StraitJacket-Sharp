using System.Collections.Generic;
using StraitJacketLib.Constructs;

namespace Asylum.AST {

    // For storing information about the result.
    public class AsylumVisitResult {
        public StraitJacketLib.Constructs.AST AST;
        public Attribute Attribute;
        public ICompileable CodeStatement;
        public CodeStatements CodeStatements;
        public Expression Expression;
        public Function Function;
        public Implementation Implementation;
        public Modifier Modifier;
        public Operator Operator;
        public VarParameter Parameter;
        public List<VarParameter> Parameters;
        public Variable Variable;
        public VariableOrFunction VariableOrFunction;
        public VarType VariableType;
        public List<VarType> VariableTypes;
    }

}
using StraitJacket.Constructs;

namespace StraitJacket.AST {

    public class BuildContext {
        public Scope CurrentScope = new Scope() { Name = "" };
        public StraitJacket.Constructs.AST AST = new Constructs.AST();
        public Implementation Implementation;
    }

}
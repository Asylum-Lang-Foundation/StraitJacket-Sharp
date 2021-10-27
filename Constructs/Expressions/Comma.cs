using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Comma operator, which separates and returns multiple expressions.
    // TODO: What if a function returns multiple values and it needs to be stored?
    public class ExpressionComma : Expression {
        public List<Expression> Expressions;

        // Construct a comma expression given a list of expressions, and automatically split commas.
        public ExpressionComma(List<Expression> expressions) {
            Type = ExpressionType.Comma;
            Expressions = new List<Expression>();
            foreach (var e in expressions) {
                if (e.Type == ExpressionType.Comma) {
                    Expressions.AddRange((e as ExpressionComma).Expressions);
                } else {
                    Expressions.Add(e);
                }
            }
        }

        public override void ResolveVariables() {
            foreach (var e in Expressions) {
                e.ResolveVariables();
            }
        }

        public override void ResolveTypes() { 
            List<VarType> memberTypes = new List<VarType>();
            foreach (var e in Expressions) {
                e.ResolveTypes();
                memberTypes.Add(e.ReturnType());
            }
        }

        public override VarType ReturnType() {
            List<VarType> types = new List<VarType>();
            foreach (var e in Expressions) {
                types.Add(e.ReturnType());
            }
            return new VarTypeTuple(types);
        }

        public override ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            List<ReturnValue> rets = new List<ReturnValue>();
            foreach (var e in Expressions) {
                rets.Add(e.Compile(mod, builder, param));
            }
            return new ReturnValue(rets);
        }

    }

}
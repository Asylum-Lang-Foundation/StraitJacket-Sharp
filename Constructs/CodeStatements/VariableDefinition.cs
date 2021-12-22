using System.Collections.Generic;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {
    
    // Variable definition.
    public class VariableDefinition : ICompileable {
        public List<Variable> Variables = new List<Variable>();
        public Expression Definition;
        public FileContext FileContext;
        List<Expression> GeneratedExpressions = new List<Expression>();

        public FileContext GetFileContext() => FileContext;

        public VariableDefinition(List<Variable> variables, Expression definition) {

            // Split into individual expressions.
            Variables = variables;
            Definition = definition;
            foreach (var v in variables) {
                GeneratedExpressions.Add(
                    new ExpressionStore(Definition, new ExpressionVariable(
                            new VariableOrFunction() { Scope = v.Scope, Path = v.Name })));
            }

        }

        public void ResolveVariables() {
            Definition.ResolveVariables();
            foreach (var e in GeneratedExpressions) {
                e.ResolveVariables();
            }
        }

        public void ResolveTypes() {
            Definition.ResolveTypes();
            foreach (var e in GeneratedExpressions) {
                e.ResolveTypes();
            }
        }

        public void CompileDeclarations(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            foreach (var v in Variables) {
                v.LLVMValue = builder.BuildAlloca(v.Type.GetLLVMType(), "SJ_Define_" + v.Name);
            }
        }

        public ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            foreach (var e in GeneratedExpressions) {
                e.Compile(mod, builder, param);
            }
            return new ReturnValue();
        }

    }

}
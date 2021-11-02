using System.Collections.Generic;
using System.Linq;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Code statement type.
    public enum CodeStatementType {
        FunctionCall,
        ReturnStatement,
        VariableDeclaration,
        VariableAssignment
    }

    // Code statements.
    public class CodeStatements : ICompileable {
        public List<ICompileable> Statements = new List<ICompileable>();
        public FileContext FileContext;

        public FileContext GetFileContext() => FileContext;

        public void ResolveVariables() {
            foreach (var c in Statements) {
                c.ResolveVariables();
            }
        }

        public void ResolveTypes() {
            foreach (var c in Statements) {
                c.ResolveTypes();
            }
        }

        // TODO: RETURN TYPE MECHANISM!!! Param is expect return.
        public ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            if (param == null) param = false;
            foreach (var s in Statements) {
                s.Compile(mod, builder, param);
            }
            return (bool)param ? new ReturnValue(builder.BuildRetVoid()) : null;
        }

    }

    // Return statement.
    public class ReturnStatement : ICompileable {
        public Expression ReturnValue;
        public FileContext FileContext;

        public FileContext GetFileContext() => FileContext;

        public void ResolveVariables() {
            ReturnValue.ResolveVariables();
        }

        public void ResolveTypes() {
            ReturnValue.ResolveTypes();
        }

        public LLVMValueRef Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            return ReturnValue.Compile(mod, builder, param);
        }

    }

    // Variable definition.
    public class VariableDefinition : ICompileable {
        public List<Variable> Variables = new List<Variable>();
        public Expression Definition;
        public FileContext FileContext;

        public FileContext GetFileContext() => FileContext;

        public void ResolveVariables() {
            Definition.ResolveVariables();
        }

        public void ResolveTypes() {
            Definition.ResolveTypes();
        }

        public LLVMValueRef Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            LLVMValueRef expr = Definition.Compile(mod, builder, param);
            foreach (var v in Variables) {
                v.LLVMValue = builder.BuildAlloca(v.Type.GetLLVMType(), v.Name);
                LLVMValueRef toStore = expr;
                LLVMTypeRef varType = v.Type.GetLLVMType();
                if (varType.Kind == LLVMTypeKind.LLVMIntegerTypeKind) {
                    if (expr.TypeOf.Kind == LLVMTypeKind.LLVMIntegerTypeKind) {
                        if (expr.TypeOf.IntWidth < varType.IntWidth) {
                            toStore = builder.BuildZExt(toStore, LLVMTypeRef.CreateInt(varType.IntWidth), "zext_");
                            // TODO: SIGN!!! ALSO MOVE TO DEDICATED CASTING SECTION!
                        } else if (expr.TypeOf.IntWidth > varType.IntWidth) {
                            toStore = builder.BuildTrunc(toStore, LLVMTypeRef.CreateInt(varType.IntWidth), "trunc_");
                        }
                    }
                }
                builder.BuildStore(toStore, v.LLVMValue);
            }
            return null;
        }

    }

}
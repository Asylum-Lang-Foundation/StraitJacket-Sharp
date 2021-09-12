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

        public void ResolveCalls() {
            foreach (var c in Statements) {
                c.ResolveCalls();
            }
        }

        public void ResolveTypes() {
            foreach (var c in Statements) {
                c.ResolveTypes();
            }
        }

        // TODO: RETURN TYPE MECHANISM!!! Param is expect return.
        public LLVMValueRef Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            if (param == null) param = false;
            foreach (var s in Statements) {
                s.Compile(mod, builder, param);
            }
            return (bool)param ? builder.BuildRetVoid() : null;
        }
    }

    // Call a function.
    public class FunctionCall : ICompileable {
        public Scope Scope;
        public bool Await;
        public VariableOrFunction Function;
        public Function ResolvedFunction;
        // TODO: GENERICS.
        // TODO: LABELS.
        public List<Expression> Parameters = new List<Expression>();
        public FileContext FileContext;

        public FileContext GetFileContext() => FileContext;

        public void ResolveCalls() {
            ResolvedFunction = Scope.ResolveFunction(Function);
            foreach (var p in Parameters) {
                p.ResolveCalls();
            }
        }

        public void ResolveVariables() {
            foreach (var p in Parameters) {
                p.ResolveVariables();
            }
        }

        public void ResolveTypes() {
            foreach (var p in Parameters) {
                p.ResolveTypes();
            }
        }

        public LLVMValueRef Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            if (ResolvedFunction.Equals(AsyLLVM.Function)) {
                return AsyLLVM.CompileCall(mod, builder, Parameters);
            }
            if (!ResolvedFunction.Compiled) ResolvedFunction.Compile(mod, builder, param);
            LLVMValueRef[] args = new LLVMValueRef[Parameters.Count];
            for (int i = 0; i < Parameters.Count; i++) {
                args[i] = Parameters[i].Compile(mod, builder, param);
            }
            if (ResolvedFunction.Inline) {

                // Fix arguments.
                for (int i = 0; i < args.Length; i++) {

                    // Variadic.
                    if (i >= ResolvedFunction.Parameters.Count || (i == ResolvedFunction.Parameters.Count - 1 && ResolvedFunction.Parameters.Last().Value.Type.Variadic)) {
                        ResolvedFunction.Parameters.Last().VariadicArgs = new List<LLVMValueRef>();
                        ResolvedFunction.Parameters.Last().VariadicArgs.Add(args[i]);
                        ResolvedFunction.Parameters.Last().Value.NoLoad = true;
                    } else {
                        ResolvedFunction.Parameters[i].Value.LLVMValue = args[i];
                        ResolvedFunction.Parameters[i].Value.NoLoad = true;
                    }

                }
                return ResolvedFunction.Definition.Compile(mod, builder, param);
                
            } else {
                Function currFunc = Scope.PeekCurrentFunction;
                LLVMValueRef funcToCall = null;
                if (ResolvedFunction.ModulePath.Equals(currFunc.ModulePath)) {
                    funcToCall = ResolvedFunction.LLVMVal;
                } else {
                    if (!ResolvedFunction.ModulePath.Equals(currFunc.ModulePath) && !ResolvedFunction.Inline) {
                        if (!ResolvedFunction.ExternedLLVMVals.ContainsKey(currFunc.ModulePath)) {
                            ResolvedFunction.ExternedLLVMVals.Add(currFunc.ModulePath, mod.AddFunction(ResolvedFunction.ToString(), ResolvedFunction.GetFuncTypeLLVM()));
                        }
                        funcToCall = ResolvedFunction.ExternedLLVMVals[currFunc.ModulePath];
                    }
                }
                return builder.BuildCall(funcToCall, args, "");
            }
        }
    }

    // Return statement.
    public class ReturnStatement : ICompileable {
        public Expression ReturnValue;
        public FileContext FileContext;

        public FileContext GetFileContext() => FileContext;

        public void ResolveCalls() {
            ReturnValue.ResolveCalls();
        }

        public void ResolveVariables() {
            ReturnValue.ResolveVariables();
        }

        public void ResolveTypes() {
            ReturnValue.ResolveTypes();
        }

        public LLVMValueRef Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param)
        {
            return ReturnValue.Compile(mod, builder, param);
        }

    }

    // Variable definition.
    public class VariableDefinition : ICompileable {
        public List<Variable> Variables = new List<Variable>();
        public Expression Definition;
        public FileContext FileContext;

        public FileContext GetFileContext() => FileContext;

        public void ResolveCalls() {
            Definition.ResolveCalls();
        }

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
                            toStore = builder.BuildZExt(toStore, LLVMTypeRef.CreateInt(varType.IntWidth));
                            // TODO: SIGN!!! ALSO MOVE TO DEDICATED CASTING SECTION!
                        } else if (expr.TypeOf.IntWidth > varType.IntWidth) {
                            toStore = builder.BuildTrunc(toStore, LLVMTypeRef.CreateInt(varType.IntWidth));
                        }
                    }
                }
                builder.BuildStore(toStore, v.LLVMValue);
            }
            return null;
        }

    }

}
using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Call the result of a value of a function.
    public class ExpressionCall : Expression {
        public Expression ToCall;
        public ExpressionComma Parameters;
        public bool DoAwait;

        public ExpressionCall(Expression toCall, ExpressionComma parameters, bool doAwait = false) {
            ToCall = toCall;
            Parameters = parameters;
            DoAwait = doAwait;
        }

        public override void ResolveVariables() {
            ToCall.ResolveVariables();
            Parameters.ResolveVariables();
        }

        public override void ResolveTypes() {
            // TODO: TOCALL MUST KNOW ABOUT PARAMETERS TO SELECT CORRECT FUNCTION!!!
            Parameters.ResolveTypes();
            ToCall.ResolveTypes();
        }

        public override bool IsPlural() {
            return false;
        }

        public override void StoreSingle(ReturnValue src, ReturnValue dest, VarType srcType, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            throw new System.Exception("??????");
        }

        public override void StorePlural(ReturnValue src, ReturnValue dest, VarType srcType, VarType destType, LLVMModuleRef mod, LLVMBuilderRef builder, object param) {
            throw new System.Exception("??????");
        }

        /*
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
        }*/

    }

}
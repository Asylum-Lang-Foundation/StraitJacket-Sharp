using System.Collections.Generic;
using System.Linq;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

    // Call the result of a value of a function. TODO: FIX EVERYTHING THIS IS SOOOOO HACKY!
    public class ExpressionCall : Expression {
        public Expression ToCall;
        public ExpressionComma Parameters;
        Function FunctionToCall;
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
            if (ToCall as ExpressionVariable != null) {
                FunctionToCall = (ToCall as ExpressionVariable).GetResolved as Function;
            } else {
                throw new System.NotImplementedException();
            }
        }

        public override VarType ReturnType() {
            return FunctionToCall.ReturnType;
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

        // TODO: TUPLE PARAMETERS!!!
        public override ReturnValue Compile(LLVMModuleRef mod, LLVMBuilderRef builder, object param) {

            // Compile values.
            ReturnValue toCall = ToCall.Compile(mod, builder, param);
            
            // LLVM.
            if (FunctionToCall.Equals(AsyLLVM.Function)) {
                return AsyLLVM.CompileCall(mod, builder, Parameters.Expressions);
            }

            // Compile parameters.
            ReturnValue parameters = Parameters.Compile(mod, builder, param);

            // Make sure function is compiled.
            if (!FunctionToCall.Compiled) FunctionToCall.Compile(mod, builder, param);
            LLVMValueRef[] args = parameters.Rets.Select(x => x.Val).ToArray(); // TODO: TUPLE PARAMETERS!!!

            // Inline function.
            if (FunctionToCall.Inline) {

                // Fix arguments.
                for (int i = 0; i < args.Length; i++) {

                    // Variadic.
                    if (i >= FunctionToCall.Parameters.Count || (i == FunctionToCall.Parameters.Count - 1 && FunctionToCall.Parameters.Last().Value.Type.Variadic)) {
                        FunctionToCall.Parameters.Last().VariadicArgs = new List<LLVMValueRef>();
                        FunctionToCall.Parameters.Last().VariadicArgs.Add(args[i]);
                        FunctionToCall.Parameters.Last().Value.NoLoad = true;
                    } else {
                        FunctionToCall.Parameters[i].Value.LLVMValue = args[i];
                        FunctionToCall.Parameters[i].Value.NoLoad = true;
                    }

                }
                return FunctionToCall.Definition.Compile(mod, builder, param);

            }

            // Regular.
            else {
                Function currFunc = Scope.PeekCurrentFunction;
                LLVMValueRef funcToCall = null;
                if (FunctionToCall.ModulePath.Equals(currFunc.ModulePath)) {
                    funcToCall = FunctionToCall.LLVMVal;
                } else {
                    if (!FunctionToCall.ModulePath.Equals(currFunc.ModulePath) && !FunctionToCall.Inline) {
                        if (!FunctionToCall.ExternedLLVMVals.ContainsKey(currFunc.ModulePath)) {
                            FunctionToCall.ExternedLLVMVals.Add(currFunc.ModulePath, mod.AddFunction(FunctionToCall.ToString(), FunctionToCall.GetFuncTypeLLVM()));
                        }
                        funcToCall = FunctionToCall.ExternedLLVMVals[currFunc.ModulePath];
                    }
                }
                return new ReturnValue(builder.BuildCall(funcToCall, args, "SJ_Call" + FunctionToCall.ToString()));
            }

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
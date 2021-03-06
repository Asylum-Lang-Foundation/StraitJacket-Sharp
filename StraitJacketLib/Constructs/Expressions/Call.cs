using System.Collections.Generic;
using System.Linq;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacketLib.Constructs {

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
            LValue = false;
            Parameters.ResolveTypes();
            ToCall.ResolveTypes();
            if (ToCall as ExpressionVariable != null) {
                FunctionToCall = (ToCall as ExpressionVariable).GetResolved as Function;
            } else {
                throw new System.NotImplementedException();
            }
        }

        public override VarType GetReturnType() {
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

            // LLVM.
            if (FunctionToCall.Equals(AsyLLVM.Function)) {
                return AsyLLVM.CompileCall(mod, builder, Parameters.Expressions);
            }

            // Compile values.
            ReturnValue toCall = ToCall.Compile(mod, builder, param);

            // Compile parameters.
            ReturnValue parameters = Parameters.Compile(mod, builder, param);

            // Make sure function is compiled.
            if (!FunctionToCall.Compiled) FunctionToCall.Compile(mod, builder, param);
            LLVMValueRef[] args = parameters.Rets.Select(x => x.Val).ToArray(); // TODO: TUPLE PARAMETERS!!!

            // Inline function.
            if (FunctionToCall.Inline) {

                // Fix arguments.
                //Scope.PushFunction(FunctionToCall);
                for (int i = 0; i < args.Length; i++) {

                    // Variadic.
                    if (i >= FunctionToCall.Parameters.Count || (i == FunctionToCall.Parameters.Count - 1 && FunctionToCall.Parameters.Last().Value.Type.Variadic)) {
                        FunctionToCall.Parameters.Last().VariadicArgs = new List<LLVMValueRef>();
                        var val = builder.BuildAlloca(args[i].TypeOf, "SJ_Param_Variadic_" + i);
                        builder.BuildStore(args[i], val);
                        FunctionToCall.Parameters.Last().VariadicArgs.Add(val);
                    } else {
                        var val = builder.BuildAlloca(args[i].TypeOf, "SJ_Param_" + FunctionToCall.Parameters[i].Value.Name);
                        builder.BuildStore(args[i], val);
                        FunctionToCall.Parameters[i].Value.LLVMValue = val;
                    }

                }
                var ret = FunctionToCall.Definition.Compile(mod, builder, param);
                //Scope.PopFunction();
                return ret;

            }

            // Regular.
            else {
                Function currFunc = Scope.PeekCurrentFunction;
                LLVMValueRef funcToCall = null;
                if (FunctionToCall.Extern || FunctionToCall.ModulePath.Equals(currFunc.ModulePath)) {
                    funcToCall = FunctionToCall.LLVMVal;
                } else {
                    if (!FunctionToCall.ModulePath.Equals(currFunc.ModulePath) && !FunctionToCall.Inline) {
                        if (!FunctionToCall.ExternedLLVMVals.ContainsKey(currFunc.ModulePath)) {
                            FunctionToCall.ExternedLLVMVals.Add(currFunc.ModulePath, mod.AddFunction(FunctionToCall.ToString(), FunctionToCall.GetFuncTypeLLVM()));
                        }
                        funcToCall = FunctionToCall.ExternedLLVMVals[currFunc.ModulePath];
                    }
                }
                return new ReturnValue(builder.BuildCall(funcToCall, args));
            }

        }

        public override string ToString() {
            return "(" + ToCall.ToString() + "(" + Parameters.ToString() + ")" + ")";
        }

    }

}
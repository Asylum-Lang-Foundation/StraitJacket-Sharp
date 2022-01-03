using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacketLib.Constructs {

    // LLVM function calls translate directly to LLVM assembly.
    public static class AsyLLVM {

        // The "normal" appearance of the LLVM assembly function.
        public static Function Function = new Function() {
            Name = "llvm",
            Static = true,
            Inline = true,
            Async = false,
            Unsafe = false,
            Extern = false,
            Variadic = true,
            Attributes = new List<Attribute>(),
            Parameters = new List<VarParameter>() {
                new VarParameter() { Value = new Variable() { Name = "instruction", Type = new VarTypeSimplePrimitive(SimplePrimitives.ConstString) { Constant = true } } },
                new VarParameter() { Value = new Variable() { Name = "args", Type = new VarTypeSimplePrimitive(SimplePrimitives.Object) { Variadic = true } } }
            },
            ReturnType = new VarTypeSimplePrimitive(SimplePrimitives.Object)
        };

        // Since LLVM assembly calls are inline, they have to be defined for every call. Here we just translate the instructions.
        public static ReturnValue CompileCall(LLVMModuleRef mod, LLVMBuilderRef builder, List<Expression> args) {
            string instruction = (args[0] as ExpressionConstStringPtr).Str;
            LLVMValueRef v1 = args.Count > 1 ? args[1].Compile(mod, builder, null).Val : null;
            if (args.Count > 1 && args[1].LValue) v1 = builder.BuildLoad(v1, "SJ_LoadLLVMA1");
            LLVMValueRef v2 = args.Count > 2 ? args[2].Compile(mod, builder, null).Val : null;
            if (args.Count > 2 && args[2].LValue) v2 = builder.BuildLoad(v2, "SJ_LoadLLVMA2");
            switch (instruction) {
                case "add":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildAdd(v1, v2));
                case "nswadd":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildNSWAdd(v1, v2));
                case "nuwadd":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildNUWAdd(v1, v2));
                case "sub":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildSub(v1, v2));
                case "nswsub":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildNSWSub(v1, v2));
                case "nuwsub":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildNUWSub(v1, v2));
                case "mul":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildMul(v1, v2));
                case "nswmul":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildNSWMul(v1, v2));
                case "nuwmul":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildNUWMul(v1, v2));
                case "udiv":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildUDiv(v1, v2));
                case "sdiv":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildSDiv(v1, v2));
                case "exactsdiv":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildExactSDiv(v1, v2));
                case "urem":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildURem(v1, v2));
                case "srem":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildSRem(v1, v2));
                case "shl":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildShl(v1, v2));
                case "lshr":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildLShr(v1, v2));
                case "ashr":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildAShr(v1, v2));
                case "and":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildAnd(v1, v2));
                case "or":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildOr(v1, v2));
                case "xor":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildXor(v1, v2));
                case "not":
                    VerifyArgs(1);
                    return new ReturnValue(builder.BuildNot(v1));
            }
            void VerifyArgs(int num) {
                if (num != args.Count - 1) {
                    throw new System.Exception("LLVM assembly call with an invalid number of arguments!");
                }
            }
            throw new System.Exception("AHHHHH");
        }

    }

}
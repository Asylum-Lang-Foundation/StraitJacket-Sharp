using System.Collections.Generic;
using LLVMSharp;
using LLVMSharp.Interop;

namespace StraitJacket.Constructs {

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
                new VarParameter() { Name = "instruction", Type = new VarType() { Type = VarTypeEnum.Primitive, Primitive = Primitives.String, Constant = true } },
                new VarParameter() { Name = "args", Type = new VarType() { Type = VarTypeEnum.Primitive, Primitive = Primitives.Object, Variadic = true } }
            },
            ReturnType = new VarType() { Type = VarTypeEnum.Primitive, Primitive = Primitives.Object }
        };

        // Since LLVM assembly calls are inline, they have to be defined for every call. Here we just translate the instructions.
        public static LLVMValueRef CompileCall(LLVMModuleRef mod, LLVMBuilderRef builder, List<Expression> args) {
            string instruction = (string)args[0].Val;
            switch (instruction) {
                case "add":
                    VerifyArgs(2);
                    return builder.BuildAdd(args[1].Compile(mod, builder), args[2].Compile(mod, builder));
                case "nswadd":
                    VerifyArgs(2);
                    return builder.BuildNSWAdd(args[1].Compile(mod, builder), args[2].Compile(mod, builder));
                case "nuwadd":
                    VerifyArgs(2);
                    return builder.BuildNUWAdd(args[1].Compile(mod, builder), args[2].Compile(mod, builder));
                case "sub":
                    VerifyArgs(2);
                    return builder.BuildSub(args[1].Compile(mod, builder), args[2].Compile(mod, builder));
                case "nswsub":
                    VerifyArgs(2);
                    return builder.BuildNSWSub(args[1].Compile(mod, builder), args[2].Compile(mod, builder));
                case "nuwsub":
                    VerifyArgs(2);
                    return builder.BuildNUWSub(args[1].Compile(mod, builder), args[2].Compile(mod, builder));
                case "mul":
                    VerifyArgs(2);
                    return builder.BuildMul(args[1].Compile(mod, builder), args[2].Compile(mod, builder));
                case "nswmul":
                    VerifyArgs(2);
                    return builder.BuildNSWMul(args[1].Compile(mod, builder), args[2].Compile(mod, builder));
                case "nuwmul":
                    VerifyArgs(2);
                    return builder.BuildNUWMul(args[1].Compile(mod, builder), args[2].Compile(mod, builder));
                case "udiv":
                    VerifyArgs(2);
                    return builder.BuildUDiv(args[1].Compile(mod, builder), args[2].Compile(mod, builder));
                case "sdiv":
                    VerifyArgs(2);
                    return builder.BuildSDiv(args[1].Compile(mod, builder), args[2].Compile(mod, builder));
                case "exactsdiv":
                    VerifyArgs(2);
                    return builder.BuildExactSDiv(args[1].Compile(mod, builder), args[2].Compile(mod, builder));
                case "urem":
                    VerifyArgs(2);
                    return builder.BuildURem(args[1].Compile(mod, builder), args[2].Compile(mod, builder));
                case "srem":
                    VerifyArgs(2);
                    return builder.BuildSRem(args[1].Compile(mod, builder), args[2].Compile(mod, builder));
                case "shl":
                    VerifyArgs(2);
                    return builder.BuildShl(args[1].Compile(mod, builder), args[2].Compile(mod, builder));
                case "lshr":
                    VerifyArgs(2);
                    return builder.BuildLShr(args[1].Compile(mod, builder), args[2].Compile(mod, builder));
                case "ashr":
                    VerifyArgs(2);
                    return builder.BuildAShr(args[1].Compile(mod, builder), args[2].Compile(mod, builder));
                case "and":
                    VerifyArgs(2);
                    return builder.BuildAnd(args[1].Compile(mod, builder), args[2].Compile(mod, builder));
                case "or":
                    VerifyArgs(2);
                    return builder.BuildOr(args[1].Compile(mod, builder), args[2].Compile(mod, builder));
                case "xor":
                    VerifyArgs(2);
                    return builder.BuildXor(args[1].Compile(mod, builder), args[2].Compile(mod, builder));
                case "not":
                    VerifyArgs(1);
                    return builder.BuildNot(args[1].Compile(mod, builder));
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
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
                new VarParameter() { Value = new Variable() { Name = "instruction", Type = VarType.AppendConstantToType(VarType.CreatePrimitiveSimple(Primitives.String)) } },
                new VarParameter() { Value = new Variable() { Name = "args", Type = VarType.AppendVariadicToType(VarType.CreatePrimitiveSimple(Primitives.String)) } }
            },
            ReturnType = VarType.CreatePrimitiveSimple(Primitives.Object)
        };

        // Since LLVM assembly calls are inline, they have to be defined for every call. Here we just translate the instructions.
        public static LLVMValueRef CompileCall(LLVMModuleRef mod, LLVMBuilderRef builder, List<Expression> args) {
            string instruction = (string)args[0].Val;
            switch (instruction) {
                case "add":
                    VerifyArgs(2);
                    return builder.BuildAdd(args[1].Compile(mod, builder, null), args[2].Compile(mod, builder, null));
                case "nswadd":
                    VerifyArgs(2);
                    return builder.BuildNSWAdd(args[1].Compile(mod, builder, null), args[2].Compile(mod, builder, null));
                case "nuwadd":
                    VerifyArgs(2);
                    return builder.BuildNUWAdd(args[1].Compile(mod, builder, null), args[2].Compile(mod, builder, null));
                case "sub":
                    VerifyArgs(2);
                    return builder.BuildSub(args[1].Compile(mod, builder, null), args[2].Compile(mod, builder, null));
                case "nswsub":
                    VerifyArgs(2);
                    return builder.BuildNSWSub(args[1].Compile(mod, builder, null), args[2].Compile(mod, builder, null));
                case "nuwsub":
                    VerifyArgs(2);
                    return builder.BuildNUWSub(args[1].Compile(mod, builder, null), args[2].Compile(mod, builder, null));
                case "mul":
                    VerifyArgs(2);
                    return builder.BuildMul(args[1].Compile(mod, builder, null), args[2].Compile(mod, builder, null));
                case "nswmul":
                    VerifyArgs(2);
                    return builder.BuildNSWMul(args[1].Compile(mod, builder, null), args[2].Compile(mod, builder, null));
                case "nuwmul":
                    VerifyArgs(2);
                    return builder.BuildNUWMul(args[1].Compile(mod, builder, null), args[2].Compile(mod, builder, null));
                case "udiv":
                    VerifyArgs(2);
                    return builder.BuildUDiv(args[1].Compile(mod, builder, null), args[2].Compile(mod, builder, null));
                case "sdiv":
                    VerifyArgs(2);
                    return builder.BuildSDiv(args[1].Compile(mod, builder, null), args[2].Compile(mod, builder, null));
                case "exactsdiv":
                    VerifyArgs(2);
                    return builder.BuildExactSDiv(args[1].Compile(mod, builder, null), args[2].Compile(mod, builder, null));
                case "urem":
                    VerifyArgs(2);
                    return builder.BuildURem(args[1].Compile(mod, builder, null), args[2].Compile(mod, builder, null));
                case "srem":
                    VerifyArgs(2);
                    return builder.BuildSRem(args[1].Compile(mod, builder, null), args[2].Compile(mod, builder, null));
                case "shl":
                    VerifyArgs(2);
                    return builder.BuildShl(args[1].Compile(mod, builder, null), args[2].Compile(mod, builder, null));
                case "lshr":
                    VerifyArgs(2);
                    return builder.BuildLShr(args[1].Compile(mod, builder, null), args[2].Compile(mod, builder, null));
                case "ashr":
                    VerifyArgs(2);
                    return builder.BuildAShr(args[1].Compile(mod, builder, null), args[2].Compile(mod, builder, null));
                case "and":
                    VerifyArgs(2);
                    return builder.BuildAnd(args[1].Compile(mod, builder, null), args[2].Compile(mod, builder, null));
                case "or":
                    VerifyArgs(2);
                    return builder.BuildOr(args[1].Compile(mod, builder, null), args[2].Compile(mod, builder, null));
                case "xor":
                    VerifyArgs(2);
                    return builder.BuildXor(args[1].Compile(mod, builder, null), args[2].Compile(mod, builder, null));
                case "not":
                    VerifyArgs(1);
                    return builder.BuildNot(args[1].Compile(mod, builder, null));
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
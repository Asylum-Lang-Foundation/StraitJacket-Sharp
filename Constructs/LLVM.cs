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
                new VarParameter() { Value = new Variable() { Name = "instruction", Type = new VarTypeSimplePrimitive(SimplePrimitives.ConstString) { Constant = true } } },
                new VarParameter() { Value = new Variable() { Name = "args", Type = new VarTypeSimplePrimitive(SimplePrimitives.ConstString) { Variadic = true } } }
            },
            ReturnType = new VarTypeSimplePrimitive(SimplePrimitives.Object)
        };

        // Since LLVM assembly calls are inline, they have to be defined for every call. Here we just translate the instructions.
        public static ReturnValue CompileCall(LLVMModuleRef mod, LLVMBuilderRef builder, List<Expression> args) {
            string instruction = (args[0] as ExpressionConstStringPtr).Str;
            switch (instruction) {
                case "add":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildAdd(args[1].Compile(mod, builder, null).Vals[0], args[2].Compile(mod, builder, null).Vals[0]));
                case "nswadd":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildNSWAdd(args[1].Compile(mod, builder, null).Vals[0], args[2].Compile(mod, builder, null).Vals[0]));
                case "nuwadd":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildNUWAdd(args[1].Compile(mod, builder, null).Vals[0], args[2].Compile(mod, builder, null).Vals[0]));
                case "sub":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildSub(args[1].Compile(mod, builder, null).Vals[0], args[2].Compile(mod, builder, null).Vals[0]));
                case "nswsub":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildNSWSub(args[1].Compile(mod, builder, null).Vals[0], args[2].Compile(mod, builder, null).Vals[0]));
                case "nuwsub":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildNUWSub(args[1].Compile(mod, builder, null).Vals[0], args[2].Compile(mod, builder, null).Vals[0]));
                case "mul":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildMul(args[1].Compile(mod, builder, null).Vals[0], args[2].Compile(mod, builder, null).Vals[0]));
                case "nswmul":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildNSWMul(args[1].Compile(mod, builder, null).Vals[0], args[2].Compile(mod, builder, null).Vals[0]));
                case "nuwmul":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildNUWMul(args[1].Compile(mod, builder, null).Vals[0], args[2].Compile(mod, builder, null).Vals[0]));
                case "udiv":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildUDiv(args[1].Compile(mod, builder, null).Vals[0], args[2].Compile(mod, builder, null).Vals[0]));
                case "sdiv":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildSDiv(args[1].Compile(mod, builder, null).Vals[0], args[2].Compile(mod, builder, null).Vals[0]));
                case "exactsdiv":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildExactSDiv(args[1].Compile(mod, builder, null).Vals[0], args[2].Compile(mod, builder, null).Vals[0]));
                case "urem":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildURem(args[1].Compile(mod, builder, null).Vals[0], args[2].Compile(mod, builder, null).Vals[0]));
                case "srem":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildSRem(args[1].Compile(mod, builder, null).Vals[0], args[2].Compile(mod, builder, null).Vals[0]));
                case "shl":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildShl(args[1].Compile(mod, builder, null).Vals[0], args[2].Compile(mod, builder, null).Vals[0]));
                case "lshr":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildLShr(args[1].Compile(mod, builder, null).Vals[0], args[2].Compile(mod, builder, null).Vals[0]));
                case "ashr":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildAShr(args[1].Compile(mod, builder, null).Vals[0], args[2].Compile(mod, builder, null).Vals[0]));
                case "and":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildAnd(args[1].Compile(mod, builder, null).Vals[0], args[2].Compile(mod, builder, null).Vals[0]));
                case "or":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildOr(args[1].Compile(mod, builder, null).Vals[0], args[2].Compile(mod, builder, null).Vals[0]));
                case "xor":
                    VerifyArgs(2);
                    return new ReturnValue(builder.BuildXor(args[1].Compile(mod, builder, null).Vals[0], args[2].Compile(mod, builder, null).Vals[0]));
                case "not":
                    VerifyArgs(1);
                    return new ReturnValue(builder.BuildNot(args[1].Compile(mod, builder, null).Vals[0]));
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
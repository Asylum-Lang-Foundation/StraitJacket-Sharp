using System;
using System.IO;
using Antlr4.Runtime;
using LLVMSharp;
using StraitJacket.AST;
using StraitJacket.Constructs;

namespace StraitJacket
{
    class Program
    {

        // For now, this is just a very simple compiler that can only compile a file in the tests folder with only the name you feed it.
        static void Main(string[] args)
        {
            if (args.Length == 0) {
                args = new string[] { "HelloWorld" };
            }
            string file = "Tests/" + args[0] + ".asy";
            Compiler c = new Compiler();
            c.AddFile("EASL/Types.asy");
            c.AddFile("EASL/Unsigned.asy");
            c.AddFile(file);
            var mod = c.Compile(args[0]);
            if (mod == null) return;
            mod.WriteBitcodeToFile("Tests/" + args[0] + ".bc");
        }

    }

}

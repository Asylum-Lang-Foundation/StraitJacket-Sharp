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
        static void Main(string[] args)
        {
            if (args.Length == 0) {
                args = new string[] { "Dummy" };
            }
            string file = "Tests/" + args[0] + ".asy";
            Compiler c = new Compiler();
            c.AddFile("EASL/Types.asy");
            //c.AddFile("EASL/Unsigned.asy"); NEED TO FIX COMPILER FIRST!
            c.AddFile(file);
            var mod = c.Compile(args[0]);
            mod.WriteBitcodeToFile("Tests/" + args[0] + ".bc");
        }
    }
}

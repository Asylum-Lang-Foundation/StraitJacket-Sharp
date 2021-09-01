# StraitJacket-Sharp
Bootstrapper compiler for the Asylum Programming Language made in C#. THIS WILL BE DEPRECATED AS SOON AS ASYLUM IS STABLE ENOUGH TO CREATE A COMPILER FOR ITSELF! Asylum Programming Language discord server: https://discord.gg/cn5wmz6SqA

# About
StraitJacket-Sharp is currently the main compiler for Asylum, until Asylum is stable enough to build a compiler for it. The job of this is to take Asylum source files and convert them to LLVM-IR bitcode or a machine executable. It currently is in a very unstable state where only simple test programs can run. There currently are no compilation flags, the only thing that can be controlled is the test name. The compiler will not even give you errors at the moment, and will even try to compile incorrect code!

# Folders
Root - Holds main project code, and entry point source files.
.vscode - Visual Studio Code launch settings.
AST - Code for converting ANTLR4's Abstract Syntax Tree (AST) into an object-oriented representation.
Constructs - Definitions of object-oriented representations of the AST, checking code, and compilation code.
EASL - The Embedded Asylum Standard Library (EASL), which define the language itself. This is compiled before any thing else is every time.
Grammar - ANTLR4 built files along with the grammar file used to generate them.
Tests - Test Asylum programs to compile.

# Necessary Installs
It is required to have Microsoft's `.NET` installed and executable through path with `dotnet`. You may need to run `dotnet restore` first in this directory to resolve all the needed packages. It is also required to have clang installed and executable on the path as well. In order to produce the `.ll` file, LLVM tools need to be installed, but this is not mandatory and you can remove the `llvm-dis` line from the scripts and have your code compile just fine. If you want to install LLVM's tools, you can look [here](https://github.com/Gota7/LLVM-Invoker).

# Usage
As the compiler is unstable at the moment, it can only really be used for test cases in the `Tests` folder. To make a program, make a `.asy` file with valid Asylum code that can be compiled. Then execute either `TEST.bat ProgramName` or `test.sh ProgramName` depending on your platform. Notice that `ProgramName` does not include the `.asy` extension at the end. This will compile your program then run it, along with spitting out an LLVM-IR bitcode (.bc) file and an LLVM-IR text (.ll) file.
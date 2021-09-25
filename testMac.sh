mkdir Tests/obj
mkdir Tests/bin
rm Tests/obj/$1.bc
rm Tests/bin/$1.elf
rm Tests/obj/$1.ll
dotnet run $1.asy
llvm-dis Tests/obj/$1.bc -o Tests/obj/$1.ll
clang -L /Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/usr/lib -O2 Tests/obj/$1.bc -o Tests/bin/$1.elf
Tests/bin/$1.elf
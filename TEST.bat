rm Tests/%1.bc
rm Tests/%1.exe
rm Tests/%1.ll
dotnet run %1
llvm-dis Tests/%1.bc -o Tests/%1.ll
clang -O2 Tests/%1.bc -o Tests/%1.exe
"Tests/%1.exe"
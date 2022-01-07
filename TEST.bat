mkdir "Tests/obj"
mkdir "Tests/bin"
rm Tests/obj/%1.bc
rm Tests/bin/%1.exe
rm Tests/obj/%1.ll
dotnet run --project StraitJacket/StraitJacket.csproj %1.asy
llvm-dis "Tests/obj/%1.bc" -o "Tests/obj/%1.ll"
clang -O2 "Tests/obj/%1.bc" -o "Tests/bin/%1.exe"
"Tests/bin/%1.exe"
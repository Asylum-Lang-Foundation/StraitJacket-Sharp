int i = 0;
while (i < 3) {
    println("Hi!");
    i = (int)llvm("add", i, (int)1);
}
int i = 3;
do {
    println("Hi!");
    i = (int)llvm("add", i, (int)1);
} while (i < 3);
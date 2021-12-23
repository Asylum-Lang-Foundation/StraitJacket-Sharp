for (int i = 0; i < 7; i = (int)llvm("add", i, (int)1)) {
    if (i < 2) {
        println("Skipped!");
        continue;
    }
    println("Hi!");
}
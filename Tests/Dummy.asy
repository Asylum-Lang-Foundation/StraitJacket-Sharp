fn add(int a, int b) -> int {
    a = (int)llvm("add", a, b);
    //println();
    a
}

int a = 3;
int b = 7;
int c = (add(a, b));
printf("%d\n", c);
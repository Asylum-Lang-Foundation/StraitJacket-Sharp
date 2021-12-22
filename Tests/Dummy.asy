fn add(int a, int b) -> int {
    ((int)llvm("add", a, b))
}

int a = 3;
int b = 7;
int c = ((int)add(a, b));
printf("%d\n", c);
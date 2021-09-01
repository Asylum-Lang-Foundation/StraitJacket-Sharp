extern fn printf(string format, ... args) -> s32;

inline fn hello() {
    int num = 7;
    printf("Hello, this is Gota%d!\n", num);
}

fn main() {
    int a = 3;
    int b = 4;
    printf("Test number: %d\n", (u32)llvm("add", a, b));
    hello();
    hello();
    hello();
}
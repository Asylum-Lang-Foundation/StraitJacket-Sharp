struct SomeOtherStruct {
    pub u16 a;
}

struct TestStruct {
    pub SomeOtherStruct other;
    pub int a;
    pub s8 b;
}

TestStruct test;
test.other.a = 5;
test.a = 3;
test.b = 7;
printf("%d\n", test.other.a);
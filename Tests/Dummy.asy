int a = 3;
int* b = &(&a);
//(*b) = 7;
printf("0x%x\n", b);
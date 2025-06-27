#include <stdio.h>

void hello() {
  printf("hello!");
}

int add(int a, int b) {
  // int sum = a + b;
  // return sum;
  return a + b;
}

int main()
{
    int a = 5;
    int b = 10;
    int sum = a + b;
    printf("%i\n", sum);
    
    int sum1 = add(5,10);
    printf("%d\n", sum1);
    
    printf("%d\n", add(5, 30));
    printf("%d\n", add(3, 30));
    printf("%d\n", add(523, 20));
}


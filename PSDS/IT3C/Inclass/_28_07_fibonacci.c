// WAP to print fibonacci series using recursion

#include <stdio.h>
// 0 1 1 2 3 5 8 13 21 34 55 89 ...
int fib(int n)
{
  // base condition: if n is 0 then return 0 or if n is 1 then return 1
  if(n <= 1) {
    return n;
  }
  // recursive function call
  return fib(n - 1) + fib(n - 2);
}

int main()
{
  printf("%d\n", fib(5));
  printf("%d\n", fib(6));
} 

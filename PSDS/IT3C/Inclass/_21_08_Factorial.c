// Write a program to find the factorial of a number using recursion.
#include <stdio.h>

int fact(int n)
{
  // base condition : when n is 0 then return 1;
  if (n == 0)
  {
    return 1;
  }
  // recursive function call
  return n * fact(n - 1);
}

int main()
{
  int n;
  printf("Enter a number: ");
  scanf("%d", &n);
  printf("%d", fact(n));
}

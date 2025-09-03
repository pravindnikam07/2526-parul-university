#include <stdio.h>
#include <stdlib.h>

int sum(int n)
{
  if (n == 0)
  {
    return 0;
  }

  return n + sum(n - 1);
}

int main()
{
  int sum1 = sum(5);
  printf("Sum is %d\n", sum1);
}

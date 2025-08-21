// WAP to find the number of ways to reach the nth step if you can take either 1 or 2 steps at a time.

#include <stdio.h>

int countWays(int n) {
  // base condition: if n is 0 then return 1 or if n is less than 0 return 0

  if(n == 0) {
    return 1;
  }
  if(n < 0) {
    return 0;
  }

  return countWays(n - 1) + countWays(n - 2);
}

int main() {
  printf("%d\n", countWays(1)); // 1 => 1 way
  printf("%d\n", countWays(2)); // 11 2 => 2 ways
  printf("%d\n", countWays(3)); // 111 12 21 => 3 ways
  printf("%d\n", countWays(5)); // 11111 1112 1121 1211 2111 => 8 ways
}

#include<stdio.h>
#include<stdlib.h>

void printNumbers(int num) {
  if(num > 10) {
    return;
  }
  printf("%d ", num);
  printNumbers(num + 1);
}

void printNum(int num) {
  if(num < 1) {
    return;
  }
  printNum(num - 1);
  printf("%d ", num);
}

int main() {
  int n = 1;
  printNumbers(1);

  printf("\n");
  printNum(20);
}

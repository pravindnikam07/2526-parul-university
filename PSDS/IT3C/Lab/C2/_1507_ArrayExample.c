#include <stdio.h>
#include <stdlib.h>

int main()
{
  // Static array declaration and initialization
  int arr[] = {1, 2, 3, 4, 5};

  // Alternatively, you can declare an array with a fixed size
  // int arr[5];
  // arr[1] = 10;
  // arr[2] = 20;
  // arr[3] = 30;

  // Iterating over the array and printing its elements
  for (int i = 0; i < 5; i++)
  {
    printf("%d\n", arr[i]);
  }

  // Dynamic array allocation using malloc, calloc
  printf("\nDynamic Array:\n");
  int size = 5;
  int *arr1 = (int *)malloc(size * sizeof(int));  // using malloc
  // int *arr1 = (int *)calloc(size, sizeof(int)); // using calloc

  // initializing the dynamic array
  for(int i = 0; i < size; i++) {
    arr1[i] = i + 1;
  }

  // printing dynamic array
  for (int i = 0; i < 5; i++)
  {
    printf("%d\n", arr1[i]);
  }
}

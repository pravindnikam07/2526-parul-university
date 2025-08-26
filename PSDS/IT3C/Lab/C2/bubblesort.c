#include <stdio.h>
#include <stdlib.h>

void printArray(int arr[], int n)
{
  for (int i = 0; i < n; i++)
  {
    printf("%d ", arr[i]);
  }
  printf("\n");
}

void printCharArray(char arr[], int n)
{
  for (int i = 0; i < n; i++)
  {
    printf("%c ", arr[i]);
  }
  printf("\n");
}

// bubble sort algorithm
void bubbleSort(int arr[], int n)
{
  for (int i = 0; i < n - 1; i++)
  {
    for (int j = 0; j < n - i - 1; j++)
    {
      if (arr[j] > arr[j + 1])
      {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }
    // printArray(arr, n); // Print array after each pass
  }
}

void bubbleSortChar(char arr[], int n)
{
  for (int i = 0; i < n - 1; i++)
  {
    for (int j = 0; j < n - i - 1; j++)
    {
      if (arr[j] > arr[j + 1])
      {
        char temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }

  }
}

int main()
{

  int arr[] = {64, 34, 90, 12, 22, 11, 9};
  int n = sizeof(arr) / sizeof(arr[0]);
  printf("Unsorted array: \n");
  printArray(arr, n);
  bubbleSort(arr, n);
  printf("Sorted array: \n");
  printArray(arr, n);

  char arr2[] = {'d', 'a', 'c', 'b', 'e'};
  int m = sizeof(arr2) / sizeof(arr2[0]);
  printf("Unsorted char array: \n");
  printCharArray(arr2, m);
  bubbleSortChar(arr2, m);
  printf("Sorted char array: \n");
  printCharArray(arr2, m);
  return 0;
}

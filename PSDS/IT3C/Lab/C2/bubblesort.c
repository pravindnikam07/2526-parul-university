#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Function to print integer array
void printArray(int arr[], int n)
{
  for (int i = 0; i < n; i++)
  {
    printf("%d ", arr[i]);
  }
  printf("\n");
}

// Function to print character array
void printCharArray(char arr[], int n)
{
  for (int i = 0; i < n; i++)
  {
    printf("%c ", arr[i]);
  }
  printf("\n");
}

// Function to print string array
void printStringArray(char arr[][100], int n)
{
  for (int i = 0; i < n; i++)
  {
    printf("%s ", arr[i]);
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

// bubble sort function for char (stable sorting)
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

// bubble sort function for strings (stable sorting)
void bubbleSortStrings(char arr[][100], int n)
{
  for (int i = 0; i < n - 1; i++)
  {
    for (int j = 0; j < n - i - 1; j++)
    {
      if (strcmp(arr[j], arr[j + 1]) > 0)
      {
        char temp[100];
        strcpy(temp, arr[j]);
        strcpy(arr[j], arr[j + 1]);
        strcpy(arr[j + 1], temp);
      }
    }
    printStringArray(arr, n); // Print array after each pass
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

  printf("\nBubble Sort for Strings:\n");
  char arr5[][100] = {"banana", "apple", "orange", "grape", "kiwi"};
  int r = sizeof(arr5) / sizeof(arr5[0]);
  printf("Unsorted array: \n");
  printStringArray(arr5, r);
  bubbleSortStrings(arr5, r);
  printf("Sorted array: \n");
  printStringArray(arr5, r);
  return 0;
}

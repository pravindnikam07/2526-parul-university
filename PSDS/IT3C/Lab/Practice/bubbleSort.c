// WAP to implement bubble sort in c
#include <stdio.h>
void bubblesort(int arr[], int n)
{
  int i, j, temp;
  for (i = 0; i < n - 1; i++)
  {
    for (j = 0; j < n - i - 1; ++j)
    {
      if (arr[j] < arr[j + 1])
      {
        temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }
  }
}
int main()
{
  int arr[] = {20, 30, 40, 50, 60, 70};
  int n = sizeof(arr) / sizeof(arr[0]);
  bubblesort(arr, n);
  for (int i = 0; i < n; i++)
  {
    printf("%d ",arr[i]);

  }
}

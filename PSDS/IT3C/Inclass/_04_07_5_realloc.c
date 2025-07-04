#include <stdio.h>
#include <stdlib.h>

int main()
{
    int size;
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    // creating dynamic array
    int *arr = (int *)malloc(size * sizeof(int));

    // initializing the array
    for (int i = 0; i < size; i++)
    {
        arr[i] = i * i;
    }

    // printing the array
    for (int i = 0; i < size; i++)
    {
        printf("%d ", arr[i]);
    }

    // increasing the size of the arr
    int newSize;
    printf("\nEnter the new size of the array: ");
    scanf("%d", &newSize);

    arr = realloc(arr, newSize * sizeof(int));

    for (int i = size; i < newSize; i++)
    {
        arr[i] = i * i;
    }

    // printing the array
    for (int i = 0; i < newSize; i++)
    {
        printf("%d ", arr[i]);
    }
}
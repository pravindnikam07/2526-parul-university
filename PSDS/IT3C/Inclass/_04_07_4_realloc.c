
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int size;
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    int *arr = malloc(size * sizeof(int));

    printf("Enter the elements of the array: ");
    for (int i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }

    for (int i = 0; i < size; i++)
    {
        printf("%d ", arr[i]);
    }

    int newSize;
    printf("\nEnter the new size of the array: ");
    scanf("%d", &newSize);

    arr = realloc(arr, newSize * sizeof(int));

    for (int i = 0; i < newSize; i++)
    {
        printf("%d ", arr[i]);
    }

    printf("\n");

    // Free the allocated memory
    free(arr);

    return 0;
}

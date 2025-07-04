
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

    // free the allocated memory
    free(arr);
    return 0;
}

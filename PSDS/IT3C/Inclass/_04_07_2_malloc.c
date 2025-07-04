
#include <stdio.h>
#include <stdlib.h>

int main()
{
    double size;
    printf("Enter the size of the array: ");
    scanf("%lf", &size);

    double *arr = malloc(size * sizeof(double));

    printf("Enter the elements of the array: ");
    for (int i = 0; i < size; i++)
    {
        scanf("%lf", &arr[i]);
    }

    for (int i = 0; i < size; i++)
    {
        printf("%lf ", arr[i]);
    }

    // Free the allocated memory
    free(arr);
    return 0;
}

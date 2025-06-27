#include <stdio.h>

void createArray(int size)
{
    double arr[size];

    for (int i = 0; i < size; i++)
    {
        arr[i] = i * 0.23; // [0.00, 0.23, 0.46, 0.69, ..., 229.77]
    }

    for (int i = 0; i < size; i++)
    {
        printf("%f ", arr[i]); // output with default precision
        // printf("%.3f ", arr[i]);    // output with 3 decimal places
        // printf("%.2f ", arr[i]);    // output with 2 decimal places
    }

    printf("\n");
}

int main()
{
    createArray(5);
    createArray(1000);
}
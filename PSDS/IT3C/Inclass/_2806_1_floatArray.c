#include <stdio.h>

void createArray(int size)
{
    // step 1: creating array of size.
    float arr[size];

    // step 2: assigning the values to each element in the array
    // arr[0] = 3.142;
    // arr[1] = 6.284;

    for (int i = 0; i < size; i++)
    {
        arr[i] = i * 3.142;
    }

    // step 3: printing each element of the array
    // printf("%f\n", arr[0]);
    // printf("%f\n", arr[1]);

    for (int i = 0; i < size; i++)
    {
        printf("%.3f\n", arr[i]);
    }
}

int main()
{
    createArray(10);
}
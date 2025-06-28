// Online C compiler to run C program online
#include <stdio.h>

void createArray(int size)
{
    int arr[size];

    printf("Enter the integer values");
    for (int i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("your values;");

    for (int i = 0; i < size; i++)
    {
        printf("%d\n", arr[i]);
    }
}

int main()
{
    int size;

    printf("Enter the size of the array you want to create");
    scanf("%d", &size);
    createArray(size);

    return 0;
}
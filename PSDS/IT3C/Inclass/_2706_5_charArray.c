#include <stdio.h>

void createCharArray()
{
    char arr[] = {'a', 'b', 'v', '1', '#'};

    for (int i = 0; i < sizeof(arr); i++)
    {
        printf("%c ", arr[i]);
    }
}

int main()
{
    createCharArray();
}
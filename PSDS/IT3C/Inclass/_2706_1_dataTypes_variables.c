#include <stdio.h>
#include <stdbool.h>

int main()
{

    // integer type
    int integer = 20; // variable declaration and initialization

    // int integer;     // variable declaration
    // integer = 20;    // initialization

    printf("%d\n", integer); // output => 20
    printf("%i\n", integer); // %i or %d is used to print integer type

    // floatint point Number
    float floatNumber = 30.3;
    printf("%f\n", floatNumber);   // output => 30.299999 || // %f is used to print float type
    printf("%.2f\n", floatNumber); // output => 30.30 (2 decimal places)

    // double type
    double d = 32.4;
    printf("%f\n", d);   // output => 32.400000 (default precision) || // %f is used to print double type
    printf("%.2f\n", d); // output => 32.40 (2 decimal places)

    // character type
    char character = 'A';
    printf("%c\n", character); // output => A || // %c is used to print character type
    printf("%d\n", character); // output => 65 || // %d is used to print ASCII value of character
    printf("%i\n", character); // output => 65 || // %i is also used to print ASCII value of character

    // boolean type
    bool b = false;
    printf("%d\n", b); // output => 0 || // %d is used to print boolean type (0 for false, 1 for true)
    // how to print boolean type in C
    // Note: C does not have a built-in boolean type, but we can use stdbool.h for boolean values
    // To print boolean values, we can use %d format specifier
    b = true;
    printf("%d\n", b); // output => 1 || // %d is used to print boolean type (0 for false, 1 for true)

    // String type
    char string[] = "Hello World!"; // String is an array of characters in C
    // Note: C does not have a built-in string type, but we can use char array to represent strings
    // Note: String is a sequence of characters terminated by a null character '\0'
    // The null character is automatically added at the end of the string when we use double quotes
    // Example: char string[] = "Hello World!"; // This is a string
    // Example: char string[20] = "Hello World!"; // This is also a string with a fixed size of 20 characters
    printf("%s\n", string); // output => Hello World! || // %s is used to print string type

    // Static Array
    int arr[] = {1, 2, 3, 4, 5};      // Static array of integers
    double darr[] = {11.1, 2.2, 3.3}; // Static array of doubles
    char chararr[] = {'a', 'b', '1'}; // Static array of characters
    // Note: Static array is an array with a fixed size, which is defined at compile time

    int arr[5];             // [0, 0, 0, 0, 0]
    printf("%d\n", arr[0]); // output => 0
    arr[0] = 1;             // [1, 0, 0, 0, 0]
    arr[1] = 2;             // [1, 2, 0, 0, 0]

    printf("%d\n", arr[0]); // output => 1
    printf("%d\n", arr[3]); // output => 0

    printf("=========== loop ===========\n");
    // loop
    // Syntax of for loop
    // for(initialization; condition; increament/decrement) {// body}

    for (int i = 0; i <= 10; i++) // i = 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    {
        printf("%i ", i); // output => 0 1 2 3 4 5 6 7 8 9 10
    }
    printf("\n");

    // Syntax of while loop
    /*

    initialization => 1
    while(condition) { => 2
      // body => 4
      // increament/decrement => 3
    }
    */

    int i = 0;
    while (i <= 10)
    {
        printf("%d ", i); // output => 0 1 2 3 4 5 6 7 8 9 10
        i++;              // i = i + 1; // increament
    }

    // WAP to store 1000 numbers in an integer array
    int arr[1000]; // Declare an array of size 1000

    for (int i = 0; i < 1000; i++)
    {
        arr[i] = i + 1; // [1,2,3,4,...,999,1000] || // Initialize the array with numbers from 1 to 1000
    }

    for (int i = 0; i < 1000; i++)
    {
        printf("%d ", arr[i]); // Output the array elements
    }
}
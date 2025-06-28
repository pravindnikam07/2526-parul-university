#include <stdio.h>

int main()
{
    // let start with a simple program to read an integer from the user
    int num;
    printf("Enter an integer: ");
    scanf("%d", &num);

    // now we will print the integer entered by the user
    printf("You entered: %d\n", num);

    // float input
    float fnum;
    printf("Enter a float: ");
    scanf("%f", &fnum);
    printf("You entered: %.2f\n", fnum);

    // double input
    double dnum; 
    printf("Enter a double: ");
    scanf("%lf", &dnum);
    printf("You entered: %.2lf\n", dnum);

    // character input
    char ch;
    printf("Enter a character: ");
    scanf(" %c", &ch); // note the space before %c to consume any newline character
    printf("You entered: %c\n", ch);

}
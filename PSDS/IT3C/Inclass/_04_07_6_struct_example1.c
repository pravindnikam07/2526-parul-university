
#include <stdio.h>
#include <stdlib.h>

struct Student
{
    char *name;
    int rollno;
    double marks;
};

int main()
{
    struct Student student1;

    student1.name = "Ramesh";
    student1.rollno = 12;
    student1.marks = 90.45;

    printf("Name: %s\n", student1.name);
    printf("Roll No: %d\n", student1.rollno);
    printf("marks; %.2f\n", student1.marks);
}

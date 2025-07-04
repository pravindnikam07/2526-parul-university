
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

    int size;
    printf("Enter the number of students: ");
    scanf("%d", &size);

    struct Student *students = malloc(size * sizeof(struct Student));

    for (int i = 0; i < size; i++)
    {
        printf("Enter name for student %d: ", i + 1);
        scanf("%s", students[i].name);

        printf("Enter roll number for student %d: ", i + 1);
        scanf("%d", &students[i].rollno);

        printf("Enter marks for student %d: ", i + 1);
        scanf("%lf", &students[i].marks);
    }

    printf("\nStudent Details:\n");
    for (int i = 0; i < size; i++)
    {
        printf("Name: %s\n", &students[i].name);
        printf("Roll No: %d\n", students[i].rollno);
        printf("Marks: %f\n", students[i].marks);
    }
}
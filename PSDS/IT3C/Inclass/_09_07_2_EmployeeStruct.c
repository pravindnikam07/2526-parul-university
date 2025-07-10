#include <stdio.h>
#include <stdlib.h>

struct Employee
{
    int empId;
    char *name;
    double salary;
};

int main()
{

    int size = 3;
    struct Employee *emp;
    emp = malloc(size * sizeof(struct Employee));

    emp[0].empId = 101;
    emp[0].name = "Alice";
    emp[0].salary = 808023.32;

    emp[1].empId = 201;
    emp[1].name = "David";
    emp[1].salary = 468023.32;

    printf("Employee ID: %i\n", emp[0].empId);
    printf("Employee Name: %s\n", emp[0].name);
    printf("Employee Salary: %.2f\n", emp[0].salary);

    printf("Employee ID: %i\n", emp[1].empId);
    printf("Employee Name: %s\n", emp[1].name);
    printf("Employee Salary: %.2f\n", emp[1].salary);
}
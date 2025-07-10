
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
    struct Employee emp1;
    emp1.empId = 102;
    emp1.name = "David";
    emp1.salary = 50000.501234;

    printf("Employee ID: %i\n", emp1.empId);
    printf("Employee Name: %s\n", emp1.name);
    printf("Employee Salary: %.3f\n", emp1.salary);
}
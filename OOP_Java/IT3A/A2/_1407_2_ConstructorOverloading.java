
public class _1407_2_ConstructorOverloading {
  // constructor overloading
  public static void main(String[] args) {
    // default constructor
    Employee emp1 = new Employee();
    emp1.name = "John Doe";
    emp1.age = 30;
    emp1.salary = 50000.0;
    emp1.printDetails();

    // name parameterized constructor
    Employee emp2 = new Employee("Devid");
    emp2.printDetails();

    // name, age, salary parameterized constructor
    Employee emp3 = new Employee("Wilson", 21, 200000);
    emp3.printDetails();
  }
}

class Employee {
  String name;
  int age;
  double salary;

  // default constructor
  Employee() {
    System.out.println("Inside the default constructor");
  }

  // parameterized constructor
  Employee(String name) {
    this.name = name;
    System.out.println("Inside the name parameterize constructor");
  }

  Employee(int age) {
    this.age = age;
  }

  // parameterized constructor with name, age, and salary
  Employee(String name, int age, double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
    System.out.println("Inside the name, age, salary parameterize constructor");
  }

  // for printing the details of the employee
  void printDetails() {
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);
    System.out.println("Salary: " + this.salary);
  }
}

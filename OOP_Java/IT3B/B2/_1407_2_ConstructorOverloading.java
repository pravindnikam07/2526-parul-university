
public class _1407_2_ConstructorOverloading {

  public static void main(String[] args) {

    Student s1 = new Student();
    s1.printDetails();
    s1.name = "Devid";
    s1.roll = 101;
    s1.printDetails();

    Student s2 = new Student("Ravi", 102);
    s2.printDetails();

    Student s3 = new Student("Rohan", 103);
    s3.printDetails();
  }
}

class Student {
  String name;
  int roll;

  // Default constructor
  Student() {
    System.out.println("Inside the default constructor");
  }

  // Parameterized constructor
  Student(String name, int roll) {
    this.name = name;
    this.roll = roll;
    System.out.println("Inside the parameterized constructor");
  }

  void printDetails() {
    System.out.println(("Name: " + this.name));
    System.out.println("Roll: " + this.roll);
  }
}

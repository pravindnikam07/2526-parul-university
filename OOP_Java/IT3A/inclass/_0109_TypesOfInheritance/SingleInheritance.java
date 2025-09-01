
public class SingleInheritance {

  public static void main(String[] args) {

    Student student = new Student();
    student.name = "Joe";
    student.age = 20;
    student.studentId = 12345;

    student.displayStudent();
  }
}

// Parent class
class Person {
  String name;
  int age;

  void display() {
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);
  }
}

// Child class
class Student extends Person {

  int studentId;

  void displayStudent() {
    super.display();
    System.out.println("Student name: " + super.name);
    System.out.println("Student ID: " + this.studentId);
  }
}

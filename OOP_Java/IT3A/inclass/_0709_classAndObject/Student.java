
public class Student {

    // data members => variables
    String name;
    int rollNo;
    double marks;

    // constructor
    public Student(String name, int roll, double marks) {
        this.name = name;
        this.rollNo = roll;
        this.marks = marks;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {

    }

    // behaviour => methods
    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

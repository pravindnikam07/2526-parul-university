
public class _0107_4_StudentExample {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Prakash";
        student1.roll = 50;
        student1.email = "abc@gmail.com";

        student1.collegeName = "PIET";

        System.out.println(student1.name);
        System.out.println(student1.roll);
        System.out.println(student1.email);
        System.out.println(student1.collegeName);

        Student student2 = new Student();

        student2.name = "Ravi";
        student2.roll = 53;
        student2.email = "ced@gmail.com";

        System.out.println(student2.name);
        System.out.println(student2.roll);
        System.out.println(student2.email);
        System.out.println(student2.collegeName);

    }
}

class Student {

    // Instance variable of student class
    String name; 
    int roll;
    String email;

    // Static Variables of student class
    static String collegeName;
}

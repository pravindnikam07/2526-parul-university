
public class Runner {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John Doe";
        s1.printDetails();

        Student s2 = new Student("Ravi", 22, 980);
        s2.printDetails();
    }
}

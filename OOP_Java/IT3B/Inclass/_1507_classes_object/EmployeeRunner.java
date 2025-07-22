
public class EmployeeRunner {
  public static void main(String[] args) {

    Employee emp1 = new Employee("Ravi", 15, "9876543234");
    // emp1.name = "ravikant";

    System.out.println(emp1.getName());
    emp1.setname("Manoj");
    System.out.println(emp1.getName());
  }
}

class Employee {
  private String name;
  private int age;
  private String mobileNo;

  public Employee(String name, int age, String mobileNo) {
    this.name = name;
    this.age = age;
    this.mobileNo = mobileNo;
  }

  // public getter setter methods
  public String getName() {
    return this.name;
  }

  public void setname(String name) {
    this.name = name;
  }

}

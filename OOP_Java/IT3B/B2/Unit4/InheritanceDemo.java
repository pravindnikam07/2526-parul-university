
public class InheritanceDemo {
  public static void main(String[] args) {

    Parent p1 = new Parent("Parent1");
    p1.display();
    p1.parentMethod();

    Child c1 = new Child("Child1", "ParentOfChild1");
    c1.display();
    c1.parentMethod();
    System.out.println(c1.parentName);

  }
}

// Parent or Base or super class
class Parent {
  String parentName;

  Parent(String name) {
    this.parentName = name;
  }

  void parentMethod() {
    System.out.println("This is parent method.");
  }

  void display() {
    System.out.println("From Parent class Parent Name: " + parentName);
  }
}

class Child extends Parent {
  String childName;

  Child(String name, String parentName) {
    super(parentName);
    this.childName = name;
  }

  void display() {
    super.display();
    System.out.println("From Child class Child Name: " + childName);
  }

}

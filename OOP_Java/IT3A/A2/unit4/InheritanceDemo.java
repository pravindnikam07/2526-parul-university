public class InheritanceDemo {
  public static void main(String[] args) {

    Parent p1 = new Parent("Parent1");
    p1.showParentName();

    Child1 c1 = new Child1("Child1", "Parent of child1");
    c1.showChildName();
    c1.showParentName();
    c1.parentName = "My parent";
    System.out.println(c1.parentName);
    c1.showParentName();
    c1.showDetails();
  }
}

// parent, base, super class
class Parent {
  String parentName;
  Parent(String name) {
    this.parentName = name;
  }
  void showParentName() {
    System.out.println("Parent Name: " + parentName);
  }
}

// child, derived, sub class
class Child1 extends Parent {
  String childName;
  Child1(String name, String parentName) {
    super(parentName);
    this.childName = name;
  }
  void showChildName() {
    System.out.println("Child Name: " + childName);
  }
  void showDetails() {
    System.out.println("Child Name: " + childName);
    System.out.println("Parent Name: " + parentName);
  }
}

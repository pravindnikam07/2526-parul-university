
public class MultiLevelInheritance {

  public static void main(String[] args) {

    Child child = new Child();
    child.grandParantName = "Devid";
    child.parentName = "Joe";
    child.childName = "Sam";
    child.displayGrandParant();
    child.displayParent();
    child.displayChild();
  }
}

// Grand Parant class
class GrandParent {
  String grandParantName;

  void displayGrandParant() {
    System.out.println("Grand Parant Name: " + this.grandParantName);
  }
}

// Parent class
class Parent extends GrandParent {
  String parentName;

  void displayParent() {
    System.out.println("Parent NameL: " + this.parentName);
  }
}

// Child class
class Child extends Parent {
  String childName;

  void displayChild() {
    super.displayGrandParant();
    System.out.println("Child Name: " + this.childName);
  }
}

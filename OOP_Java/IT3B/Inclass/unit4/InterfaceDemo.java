public class InterfaceDemo {

  public static void main(String[] args) {

    Intr objIntr = new IntrImpl();
    objIntr.printName();
    Intr.display();
    objIntr.fun();
    System.out.println(Intr.a);
  }
}

interface Intr {

  int a = 10;
  // public static final int a = 10;

  // abstract method
  void printName();
  // public abstract void printName();
  // default method signature
  // public abstract void printName();

  // static method
  public static void display() {
    System.out.println("Hello from static method...");
  }

  // default method
  default void fun() {
    System.out.println("Hello from default method...");
  }

}

class IntrImpl implements Intr {

  @Override
  public void printName() {
    System.out.println("Hello from IntrImpl...");
  }
}


public class InterfaceDemo {
  public static void main(String[] args) {

    // Intr intr1 = new Intr(); // error: Intr is abstract; cannot be instantiated

    Intr intr2 = new IntrImpl(); // interface reference implemented class object
    intr2.sayHello();

    IntrImpl intr3 = new IntrImpl(); // implemented class reference implemented class object
    intr3.sayHello();
  }
}

interface Intr {
  // syntax => public static final dataType variableName = value;
  int a = 10; // public static final
  // public static final int a = 10;

  // full method signature
  // syntax => public abstract returnType methodName();
  // public abstract void sayHello();
  public abstract void sayHello(); // abstract
  // void sayHello();

  // default method
  default void print() {
    System.out.println("Hello from default method");
  }

  // static method
  static void fun() {
    System.out.println("Hello from static method fun");
  }
}

class IntrImpl implements Intr {

  int x;

  @Override
  public void sayHello() {
    System.out.println("Hello from IntrImpl");
  }

  public void foo() {
    x = 12;
    System.out.println("Hello from foo");
  }
}

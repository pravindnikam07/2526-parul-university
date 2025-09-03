
public class MultipleInheritance {
  public static void main(String[] args) {

    // C objc = new C();
    // objc.sayHello();
  }
}

class D {

}

class A extends D {
  void sayHello() {
    System.out.println("Hello from class A");
  }
}

class B extends D {
  void sayHello1() {
    System.out.println("Hello from class B");
  }
}

// class C extends A, B { not allowed multiple inheritance in java with the help
// of classes.

// }

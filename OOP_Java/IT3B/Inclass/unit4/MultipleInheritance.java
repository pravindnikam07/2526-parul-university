public class MultipleInheritance {

  public static void main(String[] args) {

    C objC = new C();
    objC.funA();
    objC.funB();

    A objA = new C();
    objA.funA();
    // objA.funB(); // Not allowed

    B objB = new C();
    objB.funB();
    // objB.funA(); // Not allowed
  }
}

interface A {

  void funA();
}

interface B {

  void funB();
}

class C implements A, B {

  @Override
  public void funA() {
    System.out.println("Hello from funA...");
  }

  @Override
  public void funB() {
    System.out.println("Hello from funB...");
  }
}

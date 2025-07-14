
public class _1407_1_MethodOverloading {
  public static void main(String[] args) {

    Calculator cal = new Calculator();

    System.out.println(cal.add(3, 4));
    System.out.println(cal.add(5.5, 7.5));
    System.out.println(cal.add(2, 3, 5));
    System.out.println(cal.add(3, 4.5));

  }
}

class Calculator {
  // method to add two integers
  int add(int a, int b) {
    System.out.println("Inside the 2 param int type add method");
    return a + b;
  }

  // method to add two doubles
  double add(double a, double b) {
    System.out.println("Inside the 2 param double type add method");
    return a + b;
  }

  // Method to add three integers
  int add(int a, int b, int c) {
    System.out.println("Inside the 3 param int type add method");
    return a + b + c;
  }
}

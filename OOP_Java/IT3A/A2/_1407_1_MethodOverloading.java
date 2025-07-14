
public class _1407_1_MethodOverloading {
  // Method overloading

  public static void main(String[] args) {

    Calculator calculator = new Calculator(); // using default constructor

    System.out.println(calculator.add(4, 6));
    System.out.println(calculator.add(5.5, 6.5));
    System.out.println(calculator.add(1, 2, 4));
  }

}

class Calculator {

  // Method to add two integers
  int add(int a, int b) {
    return a + b;
  }

  // Method to add double values
  double add(double a, double b) {
    return a + b;
  }

  // Method to add three integers
  int add(int a, int b, int c) {
    return a + b + c;
  }
}

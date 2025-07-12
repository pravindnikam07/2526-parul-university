public class _1207_1_MethodOverloading {

  public static void main(String[] args) {

    Calculator cal = new Calculator();
    int a = 4;
    int b = 6;

    System.out.println(cal.add(a, b));

    System.out.println(cal.add(4.3, 5.6)); //
    System.out.println(cal.add(10, 45));
  }
}

class Calculator {

  // method for integer addition
  int add(int a, int b) {
    System.out.print("Inside integer add method: ");
    return a + b;
  }

  // method for double addition
  double add(double a, double b) {
    System.out.println("Inside double add method: ");
    return a + b;
  }

}

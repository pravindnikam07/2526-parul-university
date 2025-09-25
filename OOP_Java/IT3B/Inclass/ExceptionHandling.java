public class ExceptionHandling {

  public static void main(String[] args) {
    System.out.println("Program starte...");

    int a = 10;
    int b = 0;
    try {
      int c = a / b;
      System.out.println(c);
    }
    catch(ArithmeticException ae) {
      System.out.println("Error: " + ae.getMessage());
    }

    System.out.println("Program ended...");
  }
}

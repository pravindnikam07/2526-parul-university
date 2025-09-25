import java.util.*;

public class ExceptionHandling1 {
  public static void main(String[] args) {
    System.out.println("program started...");
    Scanner sc = new Scanner(System.in);

    int a = 20;
    try {
      int b = sc.nextInt();
      System.out.println(a / b);
    } catch (InputMismatchException ime) {
      System.out.println("Enter numeric value...");
    } catch (ArithmeticException e) {
      System.out.println("Divide by zero...");
    } finally {
      sc.close();
      System.out.println("Inside the finally block...");
    }

    System.out.println("program end...");
  }
}

public class ExceptionHandling {
  public static void main(String[] args) {
    System.out.println("Program started...");
    String s = "Hello world";

    try {
      for (int i = 0; i < 15; i++) {
        System.out.println(s.charAt(i));
      }
    } catch (StringIndexOutOfBoundsException siobe) {
      // siobe.printStackTrace();
      System.out.println(siobe.getMessage());
      System.out.println("You are trying to access an invalid index of the string.");
    }

    try {
      sayHello();
    } catch (CustomException ce) {
      System.out.println(ce.getMessage());
    }

    System.out.println("Program ended...");
  }

  static void sayHello() throws CustomException {
    boolean throwException = true;

    if (throwException) {
      throw new CustomException("This is a custom exception");
    } else {
      System.out.println("No exception thrown.");
    }
  }
}

class CustomException extends RuntimeException {
  public CustomException(String message) {
    super(message);
  }
}

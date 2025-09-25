public class CustomExceptionHandling {

  public static void main(String[] args) {

    int age = 15;

    if (age >= 18) {
      System.out.println("You are eligible to cast vote...");
    } else {
      throw new InvalideAgeException();
      // System.out.println("You are not eligible...");
    }
  }
}

class InvalideAgeException extends RuntimeException {

}

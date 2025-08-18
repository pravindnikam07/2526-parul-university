public class StringDemo {

  public static void main(String[] args) {
    // 1. string literals
    // 2. new keyword with String constructor
    // 3. StringBuilder
    // 4. StringBuffer

    // 1. String literals
    // syntax: DataType variableName = "text";
    String str1 = "Hello";
    System.out.println(str1);

    // 2. new keyword with String constructor
    // Syntax: String variableName = new String("text");
    String str2 = new String("Hi");
    System.out.println(str2);

    // 3. StringBuilder
    // Syntax: StringBuilder variableName = new StringBuilder("text");
    StringBuilder str3 = new StringBuilder("Hello Java");
    System.out.println(str3);

    // 4. StringBuffer
    // Syntax: StringBuffer variableName = new StringBuffer("text");
    StringBuffer str4 = new StringBuffer("Hello World");
    System.out.println(str4);
  }
}

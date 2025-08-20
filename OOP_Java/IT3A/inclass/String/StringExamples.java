public class StringExamples {
  public static void main(String[] args) {

    String s1 = "Hi";
    String s2 = "Hi";
    String s3 = new String("Hi");
    String s4 = new String("Hi");

    System.out.println(s1 == s2); // true

    System.out.println(s1 == s3); // false
    System.out.println(s4 == s3); // false

    // Using == operator compares the reference of the objects (Address in memory)

    // using equals() method compares the content of the objects

    System.out.println("============= Equals method =============");
    System.out.println(s1.equals(s2)); // true
    System.out.println(s1.equals(s3)); // true
    System.out.println(s4.equals(s3)); // true

    // Methods in String class
    // 1. length()
    // 2. charAt(int index)
    // 3. substring(int startIndex, int endIndex)
    // 4. equals()
    // 5. equalsIgnoreCase(String str)

    String str = "Hello World";
    System.out.println("Str length is : "+ str.length());
    System.out.println("Character at index 1 is : " + str.charAt(1));

    

  }
}

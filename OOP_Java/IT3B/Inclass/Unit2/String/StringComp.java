public class StringComp {
  public static void main(String[] args) {
    String s1 = "Hi";
    String s2 = "Hi";

    String s3 = new String("Hi");
    String s4 = new String("Hi");
    String s5 = "Hello";

    System.out.println(s1 == s2); // true
    System.out.println(s1 == s3); // false
    System.out.println(s3 == s4); // false

    // == operator compares references (memory locations)

    System.out.println(s1.equals(s2)); // true
    System.out.println(s1.equals(s3)); // true
    System.out.println(s1.equals(s5)); // false

    // equals() method compares values

    // charAt(index) method
    String str = "     Hello ";
    System.out.println(str.charAt(3)); // l

    // length() method
    System.out.println(str.length()); // 5

    System.out.println(str);
    str = str.concat("World"); // reassign
    System.out.println(str); // Hello World
    System.out.println(str); // HelloWorld

    // trim() method
    str = str.trim();
    System.out.println(str); // HelloWorld

    // toUpperCase() method
    str = str.toUpperCase();
    System.out.println(str); // HELLOWORLD

    // toLowerCase() method
    str = str.toLowerCase();
    System.out.println(str); // helloworld

    // compareTo() method => negetive, zero, positive
    String a = "aman";
    String b = "rajat";
    String c = "aman";

    System.out.println(a.compareTo(b)); // negetive
    System.out.println(b.compareTo(a)); // positive
    System.out.println(a.compareTo(c)); // zero

    String[] arr = new String[] { "A", "Z", "Q", "B" };

    if (arr[1].compareTo(arr[2]) > 0) {
      // swap
      System.out.println(true);
    } else {
      System.out.println(false);
    }

    // substring() method
    String sub = "abcd"; // substrings => a ab abc abcd b bc bcd c cd d
    // subsequences => a ab ac ad abc abd

    System.out.println(sub.substring(0, 2)); // ab

  }
}

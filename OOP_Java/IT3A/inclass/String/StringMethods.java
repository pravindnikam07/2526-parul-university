public class StringMethods {
  public static void main(String[] args) {

    String str = "Hello, World!";
    // str = "Hi"; // you can reassign a new value to str but you cannot change the
    // original string.

    // length() method to find the length of the string
    int length = str.length();
    System.out.println("Length of the string: " + length);

    // charAt() method to get the character at a specific index
    char _4thIndexChar = str.charAt(4);
    System.out.println("Character at index 5: " + _4thIndexChar);

    // toUpperCase() method to convert the string to uppercase
    String upperCaseStr = str.toUpperCase();
    System.out.println("String in upperCaes: " + upperCaseStr); // HELLO, WORLD!
    System.out.println(str); // Hello, World!

    // toLowerCase() method to convert the string to lowercase
    String lowerCaseStr = str.toLowerCase();
    System.out.println("String in lowerCase: " + lowerCaseStr); // hello, world!

    // compareTo() method to compare two strings
    String a = "aman";
    String b = "ravi";
    String c = "aman";
    String d = "Aman";

    System.out.println(a.compareTo(b)); // negative value (a < b)
    System.out.println(b.compareTo(a)); // positive value (b > a)
    System.out.println(a.compareTo(c)); // 0 (a == c)

    // equals() method to check if two strings are equal
    System.out.println(a.equals(b)); // false
    System.out.println(a.equals(c)); // true
    System.out.println(a.equals(d)); // false

    // equalsIgnoreCase() method to check if two strings are equal ignoring case
    System.out.println(a.equalsIgnoreCase(d)); // true

    // substring() method to get a part of the string

    // abc
    // substring of abc
    // a ab abc b bc c

    String subStr = str.substring(4);
    System.out.println(subStr); 

    String subStr2 = str.substring(1, 4);
    System.out.println(subStr2); // ell

    // iterating over the string

    for (int i = 0; i < str.length(); i++) {
      System.out.print(str.charAt(i) + " ");
    }
    System.out.println();

    // abc => ['a', 'b', 'c'] using toCharArray() method
    for (char ch : str.toCharArray()) {
      System.out.print(ch + " ");
    }

  }
}

import java.util.Arrays;

public class _0309_ReverseString {

  public static void main(String[] args) {

    String s = "ramesh";

    // using for loop and concat method and String literal way
    String reverse = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      reverse = reverse.concat("" + s.charAt(i));
    }
    System.out.println("Original String: " + s);
    System.out.println("Reverse String: " + reverse);

    // using StringBuilder class and append method
    StringBuilder sb = new StringBuilder();
    for (int i = s.length() - 1; i >= 0; i--) {
      sb.append(s.charAt(i));
    }
    System.out.println("Reverse String using StringBuilder: " + sb.toString());

    // Using StringBuilder and reverse method
    StringBuilder sb2 = new StringBuilder(s);
    System.out.println(sb2);
    sb2.reverse();
    String revs = sb2.toString();
    System.out.println("Reverse String using StringBuilder reverse method: " + revs);

    String str = "    Hel,lo, Wo,rld  ";

    // char[] charArray = new char[str.length()];
    // for (int i = 0; i < str.length(); i++) {
    // charArray[i] = str.charAt(i);
    // }

    // char[] charArray = str.toCharArray();
    String[] charArray = str.trim().split(" ");
    System.out.println(Arrays.toString(charArray));

  }
}

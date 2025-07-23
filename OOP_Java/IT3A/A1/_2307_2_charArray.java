
import java.util.Arrays;

public class _2307_2_charArray {
  public static void main(String[] args) {
    char[] arr = new char[] { 'a', 'b', 'c', 'd', 'e' };

    System.out.println(Arrays.toString(arr));

    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
      // swap
      char temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;

      left++;
      right--;
    }

    System.out.println(Arrays.toString(arr));
  }
}

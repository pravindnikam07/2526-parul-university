
import java.util.Arrays;

public class _2107_2_ArrayReverse {

  static int[] arr;

  public static void main(String[] args) {
    arr = new int[] { 1, 2, 3, 4, 5 };
    System.out.println(Arrays.toString(arr));
    reverseArray();

    System.out.println(Arrays.toString(arr));

  }

  static void reverseArray() {
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;

      left++;
      right--;
    }
  }

}

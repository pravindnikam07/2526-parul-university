
import java.util.Arrays;

public class _2107_1_Array {

  public static void main(String[] args) {
    // declaring the array in java

    // data_type[] variable_name = new data_type[size];

    int[] arr = new int[5]; // array of integers with size 5
    arr[0] = 1;
    arr[1] = 2;
    double[] doubleArr = new double[5]; // array of doubles with size 5

    int[] intArr = new int[] { 1, 2, 3, 4, 5 }; // array of integers with initialization

    System.out.println(Arrays.toString(intArr));
    int[] reverseArr = reverseArray(intArr);

    System.out.println(Arrays.toString(reverseArr));

  }

  static int[] reverseArray(int[] arr) {
    int[] reverseArray = new int[arr.length];

    int index = 0;
    for (int i = arr.length - 1; i >= 0; i--) {
      reverseArray[index] = arr[i];
      index++;
    }

    return reverseArray;

  }
}

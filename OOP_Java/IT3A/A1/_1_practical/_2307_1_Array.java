
import java.util.Arrays;

public class _2307_1_Array {

  public static void main(String[] args) {
    // integer array
    // dataType[] variableName = new dataType[size];
    // dataType[] variableName = new dataType[]{value1, value2, value3, ...};

    // creation of an array
    int[] arr = new int[5]; // [0,0,0,0,0]

    // updating values in the array
    arr[0] = 20; // [20,0,0,0,0]
    arr[1] = 40; // [20,40,0,0,0]

    // accessing values in the array
    System.out.println(arr[0]); // output: 20
    System.out.println(arr[1]); // output: 40
    System.out.println(arr[2]); // output: 0

    // traverse
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    // updating rest elements
    arr[2] = 60;
    arr[3] = 80;
    arr[4] = 100;

    System.out.println(arr); // this will print the reference of the array ex I@251a69d7
    System.out.println(Arrays.toString(arr)); // [20, 40, 60, 80, 100]

    // reversing the array

    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
      // swap
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;

      left++;
      right--;
    }

    System.out.println(Arrays.toString(arr)); // [100, 80, 60, 40, 20]

  }
}

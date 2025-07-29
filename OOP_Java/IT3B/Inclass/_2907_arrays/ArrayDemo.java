
import java.util.Arrays;

public class ArrayDemo {
  public static void main(String[] args) {
    // 1D array
    // syntax = dataType[] variableName = new dataType[size];

    // integer array
    int[] nums = new int[5]; // [0,0,0,0,0]
    nums[0] = 1; // [1,0,0,0,0]
    nums[1] = 4; // [1,4,0,0,0]
    System.out.println(nums[0]); // 1

    // printing the array
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println();

    // or
    System.out.println(nums); // [I@251a69d7 <= address of the array
    System.out.println(Arrays.toString(nums)); // [1,4,0,0,0]

    // or
    int[] arr = new int[] { 1, 2, 3, 4, 5 }; // [1,2,3,4,5]

  }

}

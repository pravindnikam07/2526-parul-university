
import java.util.Arrays;

public class ArrayDemo {
  public static void main(String[] args) {
    // creating the array

    // syntax => dataType[] arrayName = new dataType[size];
    // dataType[] arrayName = new dataType[]{value1, value2, value3, ...};

    // integer array

    // initializing an array
    int[] nums = new int[5]; // [0,0,0,0,0]
    int[] nums2 = new int[]{1,2,3,4,6,7};  // [1,2,3,4,6,7]

    // assigning values to the array
    nums[0] = 5; // [5,0,0,0,0]
    nums[1] = 10; // [5,10,0,0,0]

    // accessing the values
    System.out.println(nums[0]); // 5
    System.out.println(nums[1]); // 10
    System.out.println(nums[2]); // 0

    // finding the length of the array
    System.out.println(nums.length); // length of the array => 5

    System.out.println(nums); // it will address => [I@7ad041f3

    // printing the elements of the array
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println();

    // or
    System.out.println(Arrays.toString(nums)); // [5, 10, 0, 0, 0]
    System.out.println(Arrays.toString(nums2)); // [1, 2, 3, 4, 6, 7]
  }
}

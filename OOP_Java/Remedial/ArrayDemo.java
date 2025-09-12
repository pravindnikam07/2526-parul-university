import java.util.Arrays;

public class ArrayDemo {
  public static void main(String[] agrs) {

    //
    // int[] nums = {1,2,3,4,6,7};
    // int nums[] = {1,2,3,4,6,7};
    // int nums[] = new int[]{1,2,3,4,6,7};
    int nums[] = new int[6]; // [0,0,0,0,0,0]
    nums[0] = 1; // [1,0,0,0,0,0]
    nums[1] = 2; // [1,2,0,0,0,0]

    // System.out.println(nums[0]); // output => 1
    System.out.println(nums); // [I@7ad041f3
    System.out.println(Arrays.toString(nums)); // [1, 2, 0, 0, 0, 0]

    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println();

    int[] arr = { 34, 23, 89, 4, 101, 38 };

    int minElement = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < minElement) {
        minElement = arr[i];
      }
    }
    System.out.println("Minimum element in the array is: " + minElement);

    int secondMin = Integer.MAX_VALUE;
    // System.out.println(Integer.MAX_VALUE);
    // byte => Byte wrapper class
    // short (primitive) => Short wrapper class
    // int => Integer wrapper class
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != minElement && arr[i] < secondMin) {
        secondMin = arr[i];
      }
    }
    System.out.println("Second Minimum element in the array is: " + secondMin);

    int maxElement = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > maxElement) {
        maxElement = arr[i];
      }
    }

    System.out.println("Maximum element in the array is: " + maxElement);

    int[] arr1 = { 2, 5, 3, 8, 9 };
    int target = 6;

    boolean isPairFound = false;
    for (int i = 0; i < arr1.length; i++) {
      int element1 = arr1[i];
      for (int j = i + 1; j < arr1.length; j++) {
        int element2 = arr1[j];
        if (element1 + element2 == target) {
          isPairFound = true;
          System.out.println("Pair found");
        }
      }
    }
    if (isPairFound == false) {
      System.out.println("Pair not found");
    }
  }
}

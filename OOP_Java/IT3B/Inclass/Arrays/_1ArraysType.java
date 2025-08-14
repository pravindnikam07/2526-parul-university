public class _1ArraysType {
  public static void main(String[] args) {
    // 1. 1D arrya

    // syntax
    // dataType[] arrayName = new dataType[size];
    // dataType[] arrayName = {values...};
    // dataType[] arrayName = new dataType[]{values...};

    int[] nums = new int[5];
    nums[0] = 10;
    nums[1] = 20;

    int[] nums1 = { 10, 20, 30, 40, 50 };
    int[] nums2 = new int[] { 10, 20, 30, 40, 50 };

    // iterating through an array
    for (int i = 0; i < nums1.length; i++) {
      System.out.print(nums1[i] + " ");
    }
    System.out.println();

    // enhanced for loop (for-each loop)
    /*
     * for(dataType variable : dataSource/array) {
     * // body
     * }
     */
    for (int num : nums1) {
      System.out.print(num + " ");
    }
    System.out.println();

    // 2. 2D array

    // syntax => dataType[][] arrayName = new dataType[noOfRows][noOfColumns];
    int[][] matrix = new int[3][3];
    matrix[0][0] = 1;
    matrix[0][1] = 2;

    int[][] matrix1 = new int[][] {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    int[][] matrix3 = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 },
        { 10, 11, 12 }
    };

    for (int row = 0; row < matrix3.length; row++) {
      int[] arr = matrix3[row];
      for (int col = 0; col < arr.length; col++) {
        System.out.print(arr[col] + " ");
      }
      System.out.println();
    }

    // or

    for (int row = 0; row < matrix3.length; row++) {
      for (int col = 0; col < matrix3[row].length; col++) {
        System.out.print(matrix3[row][col] + " ");
      }
      System.out.println();
    }

    // finding the sum
    int sum = 0;
    for (int row = 0; row < matrix3.length; row++) {
      for (int col = 0; col < matrix3[row].length; col++) {
        sum += matrix3[row][col];
      }
    }
    System.out.println("Sum of all elements: " + sum);

    // finding the sum of each row
    for (int row = 0; row < matrix3.length; row++) {
      int rowSum = 0;
      for (int col = 0; col < matrix3[row].length; col++) {
        rowSum += matrix3[row][col];
      }
      System.out.println("Sum of row " + row + ": " + rowSum);
    }

    // finding the sum of each column
    // finding the sum of each row
    for (int col = 0; col < matrix3[0].length; col++) {
      int colSum = 0;
      for (int row = 0; row < matrix3.length; row++) {
        colSum += matrix3[row][col];
      }
      System.out.println("Sum of col " + col + ": " + colSum);
    }

    // 3. Jagged array (array of arrays)

    int[][] jaggedArray = {
        { 1, 2, 3 },
        { 4, 5 },
        { 6, 7, 8, 9 }
    };
  }
}

/*
 *
 * a. int[] arr = new int[5];
 * b. int arr[] = new int[5];
 * c. int arr[] = new int[5]{10, 20, 30, 40, 50}; // wrong syntax
 * d. int arr[] = {10, 20, 30, 40, 50};
 * e. none of the above
 *
 */

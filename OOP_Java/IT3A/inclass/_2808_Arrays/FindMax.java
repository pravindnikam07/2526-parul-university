
public class FindMax {

  static int findMax(int[] arr) {
    // implement here
    int maxElement = arr[0];
    int maxElementIndex = 0;
    for (int i = 1; i < arr.length; i++) {
      if (maxElement < arr[i]) {
        maxElement = arr[i];
        maxElementIndex = i;
      }
    }

    System.out.println(maxElementIndex);
    return maxElement;
  }

  static void peakElement(int[] arr) {
    // find the all peak elements

    int peakElement = -1;
    for (int i = 1; i < arr.length - 1; i++) {
      if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
        peakElement = arr[i];
        System.out.println(peakElement + " " + i);
      }
    }

    if (arr[0] > arr[1]) {
      System.out.println(arr[0] + " " + 0);
    }
    if (arr[arr.length - 1] > arr[arr.length - 2]) {
      System.out.println(arr[arr.length - 1]);
    }
  }

  public static void main(String[] args) {
    // Find the max element in the array

    int[] arr = new int[] { 3, 2, 64, 54, 43, 1, 4, 54, 32 };
    System.out.println(findMax(arr));

    peakElement(arr);

  }
}

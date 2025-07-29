
public class ArrayExample {
  public static void main(String[] args) {
    int[] arr = new int[] { 74, 32, 65, 23, 64, 32, 12, 9, 13, 8 };
    System.out.println(findMax(arr));

    findPeak(arr);

  }

  // Find the peak element in the array
  static void findPeak(int[] arr) {
    // implement here
    int peakElement = -1;
    if (arr[0] > arr[1]) {
      peakElement = arr[0];
      System.out.println(peakElement);

    }

    for (int i = 1; i < arr.length - 1; i++) {
      if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
        peakElement = arr[i];
        System.out.println(peakElement);
        
      }
    }

    if (arr[arr.length - 1] > arr[arr.length - 2]) {
      peakElement = arr[arr.length - 1];
      System.out.println(peakElement);
    }

  }

  // find the max element in the array and print the index
  static int findMax(int[] arr) {
    // implement here
    int maxElement = arr[0]; // 65
    int maxEleIndex = 0;

    for (int i = 1; i < arr.length; i++) {
      if (maxElement < arr[i]) {
        maxElement = arr[i];
        maxEleIndex = i;
      }
    }
    System.out.println(maxEleIndex);
    return maxElement;
  }
}

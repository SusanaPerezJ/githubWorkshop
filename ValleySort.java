public class ValleySort {
  public static void main(String[] args) {
    int[] input = { 6, 7, 1, 5, 4, 3, 3 };
    // Expected output should be index 2
    int minIndex = findMinIndex(input);
    System.out.println(minIndex);

    sortLeft(input, 0, minIndex);
    // Expected new value of input should be {7,6,1,5,4,3,3}
    // You should also change the line below to print out each value in the array.
    // Since you will need to do this several times, it might be good to make a
    // method
    // that prints your integer array.
    System.out.println(input);

    sortRight(input, minIndex, input.length);
    // Expected new value of input should be {7,6,1,3,3,4,5}
    // You should also change the line below to print out each value in the array.
    System.out.println(input);

    input = merge(input, minIndex);
    // Expected new value of input should be {1,3,3,4,5,6,7}
    // You should also change the line below to print out each value in the array.
    System.out.println(input);

  }

  public static int[] performFullSort(int[] input) {
    int minIndex = findMinIndex(input);
    sortLeft(input, 0, minIndex);
    sortRight(input, minIndex, input.length);
    return merge(input, minIndex);
  }

  public static int findMinIndex(int[] input) {
    int mindex = 0;
    // It's the min-Index...or mindex. Get it?
    return mindex;
  }

  public static void sortLeft(int[] arr, int start, int end) {

  }

  public static void sortRight(int[] arr, int start, int end) {

  }

  public static int[] merge(int[] input, int minIndex) {
    return input;
  }
}
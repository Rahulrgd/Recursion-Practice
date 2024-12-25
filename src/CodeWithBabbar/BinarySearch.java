package CodeWithBabbar;

public class BinarySearch {

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int ans = binarySearch(arr, 0, arr.length - 1, 9);
    System.out.println(ans);
  }

  private static int binarySearch(int[] arr, int s, int l, int t) {
    int mid = ((l - s) / 2) + s;
    if(s>l) return -1;
    if (arr[mid] == t) {
      return mid;
    } else if (t > arr[mid]) {
      try {
        return binarySearch(arr, mid + 1, l, t);
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    } else if (t < arr[mid]) {
      return binarySearch(arr, s, mid, t);
    }
    return -1;
  }
}

package CodeWithBabbar;

public class LinearSearch {

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    int ans = findIndex(arr, 0, 8);
    System.out.println(ans);
  }

  private static int findIndex(int[] arr, int i, int t) {
    if(i>=arr.length) return -1;
    if(t == arr[i]) return i;
    return findIndex(arr, ++i, t);
  }
}

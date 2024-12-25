package RecursionCodes;

public class FindTarget {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 33 };
    int ans = find(arr, 12, 0);
    System.out.println(ans);
  }

  private static int find(int[] arr, int t, int i) {
    if(i>=arr.length) return -1;
    if(arr[i]==t) return i;
    return find(arr, t, ++i);
  }
}

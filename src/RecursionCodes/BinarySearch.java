package RecursionCodes;


public class BinarySearch {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int ans = search(arr, 0, arr.length-1, 9);
    System.out.println(ans);
  }

  private static int search(int[] arr, int s, int l, int t) {
    if(s>l) return -1;
    if(arr[s]==t) return s;
    if(arr[l]==t) return l;
    int m= ((l-s)/2)+s;
    if(arr[m]==t) return m;
    if(t>arr[m]) return search(arr, m+1, l, t);
    if(t<arr[m]) return search(arr, s, m-1, t);
    return -1;
  }
}

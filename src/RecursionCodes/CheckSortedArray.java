package RecursionCodes;

public class CheckSortedArray {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    boolean ans = check(arr, 0);
    System.out.println(ans);
  }

  private static boolean check(int[] arr, int index) {
    if(index == arr.length-1) return true;
    return arr[index]<arr[index+1] & check(arr, ++index);
  }
}

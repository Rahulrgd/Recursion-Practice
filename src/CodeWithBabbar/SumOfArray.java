package CodeWithBabbar;

public class SumOfArray {

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4 };

    int ans = sum(arr, 0, 0);
    System.out.println(ans);
  }

  private static int sum(int[] arr, int i, int sum) {
    if(i == arr.length) return sum;
    int temp = sum + arr[i];
    return sum(arr, ++i, temp);
  }
}

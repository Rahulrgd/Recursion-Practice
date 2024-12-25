package CodeWithBabbar;

public class L34_BubbleSort {

  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1 };
    int[] ans = sort(arr, arr.length - 1);
    for(int e : ans){
        System.out.print(e + " ");
    }
  }

  private static int[] sort(int[] arr, int l) {
    if (l == 0) return arr;
    for (int i = 0; i <= l - 1; i++) {
      if (arr[i] > arr[l]) {
        int temp = arr[l];
        arr[l] = arr[i];
        arr[i] = temp;
      }
    }
    return sort(arr, --l);
  }
}

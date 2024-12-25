package RecursionCodes;

public class SelectionSort {

  public static void main(String[] args) {
    int[] arr = { 4, 3, 2, 1 };
    int[] ans = sort(arr, arr.length, 0);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  private static int[] sort(int[] arr, int n, int i) {
    if (i == n - 1) return arr;
    int minInd=i;
    for (int j = i; j < n; j++) {
        if(arr[j]<arr[i]){
            minInd=j;
        }
    }
    int temp = arr[i];
    arr[i]=arr[minInd];
    arr[minInd]=temp;
    return sort(arr, n, ++i);
  }
}

package RecursionCodes;

import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    int[] arr = { 4, 3, 2, 1 };
    int[] ans = sort(arr, arr.length - 1);
    System.out.println(Arrays.toString(ans));
  }

  private static int[] sort(int[] arr, int n) {
    if(n==0) return arr;
    for(int i=0; i<n; i++){
        if(arr[i]>arr[i+1]){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    return sort(arr, --n);
  }
}

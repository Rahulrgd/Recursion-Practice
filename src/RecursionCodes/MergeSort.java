package RecursionCodes;

import java.util.Arrays;

public class MergeSort {

  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1 };
    System.out.println(Arrays.toString(arr));
    int[] ans = mergeSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }

  private static int[] mergeSort(int[] arr, int left, int right) {
    if (left < right) {
      int mid = left + (right - left) / 2;
      mergeSort(arr, left, mid);
      mergeSort(arr, mid + 1, right);
      merge(arr, left, mid, right);
    }
    return arr;
  }

  private static void merge(int[] arr, int left, int mid, int right) {
    // array size
    int n1 = mid-left +1;
    int n2 = right - mid;

    // temprory arrays
    int[] leftArray = new int[n1];
    int[] rightArray = new int[n2];

    // Copy data to arrays
    for(int i=0; i<n1; i++){
      leftArray[i]=arr[left+i];
    }

    for(int i=0; i<n2; i++){
      rightArray[i]=arr[mid+i+1];
    }

    // Merge temprory array back to original array
    int i=0, j=0, k=left;

    while(i<n1 & j<n2){
      if(leftArray[i]<=rightArray[j]){
        arr[k]=leftArray[i];
        i++;
      }else{
        arr[k]=rightArray[j];
        j++;
      }
      k++;
    }

    // Copy the remaining element of left array
    while(i<n1){
      arr[k]=leftArray[i];
      i++;
      k++;
    }

    // Copy the remaining element of right array
    while(j<n2){
      arr[k]=rightArray[j];
      j++;
      k++;
    }
  }
}

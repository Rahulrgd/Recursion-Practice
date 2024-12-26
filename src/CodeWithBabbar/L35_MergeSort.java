package CodeWithBabbar;

public class L35_MergeSort {

  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1 };
    sort(arr, 0, arr.length - 1);
    for (int e : arr) {
      System.out.print(e + " ");
    }
  }

  private static void sort(int[] arr, int l, int r) {
    if (l < r) {
      int mid = l + ((r - l) / 2);
      sort(arr, l, mid);
      sort(arr, mid + 1, r);
      merge(arr, l, mid, r);
    }
  }

  private static void merge(int[] arr, int l, int mid, int r) {
    // left right array size
    int n1 = mid - l + 1;
    int n2 = r - mid;

    // left right temp arrays
    int left[] = new int[n1];
    int right[] = new int[n2];

    // copy data
    for (int i = 0; i < n1; i++) {
      left[i] = arr[l + i];
    }
    for (int i = 0; i < n2; i++) {
      right[i] = arr[mid + i + 1];
    }

    // merge
    int i = 0, j = 0, k = l;
    while (i < n1 && j < n2) {
      if (left[i] <= right[j]) {
        arr[k] = left[i];
        i++;
      } else {
        arr[k] = right[j];
        j++;
      }
      k++;
    }

    // copy remaining values
    if (i < n1) {
      while (i < n1) {
        arr[k] = left[i];
        i++;
        k++;
      }
    }
    if (j < n2) {
      while (j < n2) {
        arr[k] = right[j];
        j++;
        k++;
      }
    }
  }
}

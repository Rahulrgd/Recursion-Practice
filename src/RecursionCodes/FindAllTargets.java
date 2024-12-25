package RecursionCodes;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllTargets {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 4 };
    ArrayList<Integer> ans = find(arr, 4, 0, new ArrayList<Integer>());
    System.out.println(ans);
  }

  private static ArrayList<Integer> find(
    int[] arr,
    int t,
    int i,
    ArrayList<Integer> list
  ) {
    if (i >= arr.length) return list;
    if (arr[i] == t) list.add(i);

    return find(arr, t, ++i, list);
  }
}

package RecursionCodes;

public class FibonaciNumber {

  public static void main(String[] args) {
    int ans = findFibonaci(4);
    System.out.println(ans);
  }

  private static int findFibonaci(int n) {
    if (n<2) return n;
    return findFibonaci(n-1) + findFibonaci(n-2);
  }
}

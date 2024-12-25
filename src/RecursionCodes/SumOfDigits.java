package RecursionCodes;

public class SumOfDigits {

  public static void main(String[] args) {
    int ans = findSum(50);
    System.out.println(ans);
  }

  private static int findSum(int n) {
    if (n<=1) return n;
    return n+findSum(n-1);
  }
}

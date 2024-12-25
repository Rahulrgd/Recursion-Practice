package RecursionCodes;

public class DigitSum {

  public static void main(String[] args) {
    int ans = sum(120);
    System.out.println(ans);
  }

  private static int sum(int n) {
    if(n<=1) return n;
    return n%10+sum(n/10);
  }
}

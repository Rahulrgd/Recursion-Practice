package RecursionCodes;

public class Factorial {

  public static void main(String[] args) {
    int ans = factorial(3);
    System.out.println(ans);
  }

  private static int factorial(int n) {
    if(n<=1) return n;
    return n*factorial(n-1);
  }
}

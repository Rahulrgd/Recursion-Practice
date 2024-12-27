package Assignment_1;

public class FactorialCalculation {

  public static void main(String[] args) {
    int ans = findFactorial(5);
    System.out.println(ans);
  }

  private static int findFactorial(int n) {
    if(n==0) return 1;
    return n * findFactorial(n-1);
  }
}

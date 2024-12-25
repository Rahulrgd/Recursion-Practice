package RecursionCodes;

public class ReverseNumber {

  public static void main(String[] args) {
    int ans = reverse(123);
    System.out.println(ans);
  }
  static int sum=0;

  private static int reverse(int n) {
    if(n<=0) return sum;
    int rem = n%10;
    sum= sum*10+rem;
    return reverse(n/10);
  }
}

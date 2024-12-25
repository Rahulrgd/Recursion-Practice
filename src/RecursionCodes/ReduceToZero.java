package RecursionCodes;

public class ReduceToZero {

  public static void main(String[] args) {
    int n = 5;
    int ans = toZero(n, 0);
    System.out.println(ans);
  }

  private static int toZero(int n, int s) {
    if(n<=0) return s;
    if(n%2==0) return toZero(n/2, ++s);
    return toZero(--n, ++s);
  }
}

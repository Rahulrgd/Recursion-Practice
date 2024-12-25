package RecursionCodes;

public class ReverseNumberMethod2 {

  public static void main(String[] args) {
    int n = -1234321;
    int ans = reverse(n,0);
    System.out.println(ans);
    if(n==ans) System.out.println("true");
        else System.out.println("false");;
  }

  private static int reverse(int n, int result) {
    if(n<0) {
        return -reverseHelper(-n,0);
    }
    return reverseHelper(n, result);
  }

  private static int reverseHelper(int n, int result){
    if(n==0) return result;
    return reverse(n/10, result*10+n%10);
  }
}

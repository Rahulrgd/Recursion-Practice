package RecursionCodes;

public class CountZeros {

  public static void main(String[] args) {
    int ans = countZeros(100, 0);
    System.out.println(ans);
  }

  private static int countZeros(int n, int z) {
    if (n<=0) return z;
    if(n%10==0) return countZeros(n/10,++z);
        else return countZeros(n/10, z);
  }
}

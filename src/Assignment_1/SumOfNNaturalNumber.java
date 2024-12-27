package Assignment_1;

public class SumOfNNaturalNumber {

  public static void main(String[] args) {
    int ans = findSum(10);
    System.out.println(ans);
  }

  private static int findSum(int n) {
    if(n==0) return n;
    return n + findSum(n-1);
  }
}

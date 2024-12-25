package CodeWithBabbar;

public class L34_PowerOf3 {

  public static void main(String[] args) {
    int digit = 3;
    int pow = 3;
    int ans = find(digit, pow);
    System.out.println(ans);
  }

  private static int find(int digit, int pow) {
    if(pow == 0) return 1;

    return digit * find(digit, --pow);
  }
}

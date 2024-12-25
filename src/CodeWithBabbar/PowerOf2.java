package CodeWithBabbar;

public class PowerOf2 {

  public static void main(String[] args) {
    int ans = print(4);
    System.out.println(ans);
  }

  private static int print(int pow) {
    if(pow == 0 ) return 1;
    return 2 * print(pow -1);
  }
}

package CodeWithBabbar;

public class L34_CheckPalindrome {

  public static void main(String[] args) {
    String str = "abcbad";
    boolean ans = check(str, 0, str.length() - 1);
    System.out.println(ans);
  }

  private static boolean check(String str, int s, int e) {
    if (s > e) return true;
    if (str.charAt(s) == str.charAt(e)) return check(str, ++s, --e);
    return false;
  }
}

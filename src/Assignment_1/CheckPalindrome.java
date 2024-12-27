package Assignment_1;

public class CheckPalindrome {

  public static void main(String[] args) {
    boolean ans = check("madam");
    System.out.println(ans);
  }

  private static boolean check(String str) {
    return helperFunction(str, 0, str.length() - 1);
  }

  private static boolean helperFunction(String str, int i, int j) {
    if(i>j) return true; 
    if(str.charAt(i)!= str.charAt(j)) return false;
    helperFunction(str, ++i, --j);
    return true;
  }
}

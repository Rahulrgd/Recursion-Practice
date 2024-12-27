package Assignment_1;

public class ReverseString {

  public static void main(String[] args) {
    String rWord = reverse("Rahul");
    System.out.println(rWord);
  }

  private static String reverse(String name) {
    char[] charArr = name.toCharArray();
    return helperFunction(charArr, 0, charArr.length - 1);
  }

  private static String helperFunction(char[] charArr, int l, int r) {
    if(l>r) return new String(charArr);
    char temp = charArr[l];
    charArr[l] = charArr[r];
    charArr[r] = temp;
    helperFunction(charArr, ++l, --r);
    return new String(charArr);
  }
}

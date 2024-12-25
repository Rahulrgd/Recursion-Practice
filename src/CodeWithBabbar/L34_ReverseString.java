package CodeWithBabbar;

public class L34_ReverseString {

  public static void main(String[] args) {
    String name = "Rahul";
    String reverseString = rString(name, 0, name.length() - 1);
    System.out.println(reverseString);
  }

  private static String rString(String name, int s, int e) {
    if(s>e) return name;
    char charArr[] = new char[name.length()];
    charArr = name.toCharArray();

    char temp = charArr[s];
    charArr[s]=charArr[e];
    charArr[e]=temp;
    name = new String(charArr);
    return rString(name, ++s, --e);
  }
}

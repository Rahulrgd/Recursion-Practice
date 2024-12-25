package CodeWithBabbar;

public class SayDigit {

  public static void main(String[] args) {
    String digits[] = {
      "Zero",
      "One",
      "Two",
      "Three",
      "Four",
      "Five",
      "Six",
      "Seven",
      "Eight",
      "Nine",
    };
    sayDigit(412, digits);
  }

  private static void sayDigit(int num, String[] digits) {
    if(num<=0) return ;
    int temp = num%10;
    sayDigit(num/10, digits);
    System.out.print(digits[temp] + " ");
  }
}

package CodeWithBabbar;

public class PrintCounting {

  public static void main(String[] args) {
    printCount(5);
  }

  private static void printCount(int n) {
      if(n==0) return;
      printCount(n-1);
      System.out.print(n + " ");
  }
}

package RecursionCodes;

public class ReverseTrangle {

  public static void main(String[] args) {
    // printPattern(6);
    printPattern2(6,1);
  }

  private static void printPattern2(int r, int c) {
    if(r<=0) return;
    if(c<r) {
        System.out.print("*");
        printPattern2(r, ++c);
    }else{
        System.out.println();
        printPattern2(--r, 1);
    }
  }

  private static void printPattern(int n) {
    if (n <= 0) return;
    for (int i = 1; i <= n; i++) {
      System.out.print("*");
    }
    System.out.println();
    printPattern(--n);
  }
}

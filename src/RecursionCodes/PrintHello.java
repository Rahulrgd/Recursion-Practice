package RecursionCodes;

public class PrintHello {

  public static void main(String[] args) {
    printHello(5);
  }

  private static void printHello(int n) {
    if (n <= 0) return;
    System.out.println("Hello World");
    n--;
    printHello(n);
  }
}

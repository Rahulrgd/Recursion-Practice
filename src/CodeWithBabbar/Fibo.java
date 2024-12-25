package CodeWithBabbar;

public class Fibo {

  public static void main(String[] args) {
    int ans = printFibo(3);
    System.out.print(ans + " ");
    
  }

  private static int printFibo(int num) {
    if(num <=1) return 1;
    return printFibo(num-1) + printFibo(num-2);
  }
}

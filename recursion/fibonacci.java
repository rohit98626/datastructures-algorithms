// write a program of fibonacci series using recursion
// time complexity O(2^n)
package recursion;
import java.util.*;

public class fibonacci {
  static int fib(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    return fib(n-1) + fib(n-2);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    sc.close();
    System.out.println("fibonacci series of " + x + " are:");
    
    for (int i=0; i < x; i++) {
      System.out.println(fib(i));
    }
  }
}
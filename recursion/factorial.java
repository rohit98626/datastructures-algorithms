// write a program to find the factorial of a number 
package recursion;
import java.util.*;

public class factorial {
  static int fac(int n) {
    if (n == 0) return 1;
    return n * fac(n-1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    sc.close();

    System.out.println("factorial of "+ x + " is: " + fac(x));
    fac(x);
  }
}
// write a program to find the sum of n natural numbers 
// time complexity O(n)
package recursion;
import java.util.*;

public class nnatural {
  static int sum(int n) {
    if (n == 0) {
      return 0;
    }
    return n + sum(n - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    sc.close();

    System.out.println("sum of n natural no.s are:"+ sum(i));
    sum(i);
  }
}
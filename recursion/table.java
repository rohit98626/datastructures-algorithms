// write a program to print a table of a number 
package recursion;

import java.util.*;
public class table {
  static void Tableno(int num, int i ) {
    if ( i > 10) {
      return;
    }
    System.out.println(num + "x" + i + "=" + (num * i));
    Tableno (num, i+1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    System.out.println("Multiplication of:");
    Tableno(n, 1);
  }
}
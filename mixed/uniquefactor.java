// write a program to find the unique factors of a number. o(n), dp= 1,2,3,4,6,7,12,24
package mixed;

import java.util.Scanner;

public class uniquefactor {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();

      for (int i = 1; i * i <= n; i++) {
        if (n % i == 0) {
          if (i == n / i) {
            System.out.print(i + " "); // only once for square root factor
          } else {
            System.out.print(i + " " + (n / i) + " ");
          }
        }
      }
    }
  }
}
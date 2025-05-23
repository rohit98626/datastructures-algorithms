package mixed;
// write a program to find the unique factors of a number. o(n), dp= 1,2,3,4,6,7,12,24
import java.util.Scanner;

public class uniquefactor {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int n = sc.nextInt();

    for(int i= 1 ; i*i <= n; i++) {
      if (n%i==0 ){
      if ((n / i ^ 2) != i) {
        System.out.print( i + " " + (n / i));
      }
    }
    }
  }
  
}
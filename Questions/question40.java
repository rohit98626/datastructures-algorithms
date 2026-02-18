package Questions;
//Write a Java program that takes an integer n and calculates the sum of all its distinct prime factors.
import java.util.Scanner;
public class question40 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    int sum = 0; 

    for(int i=2 ; i*i <= n; i++) { 
      if (n % i == 0) {
        sum += i; 
        while (n % i == 0) {
          n /= i;
        }
      }
    }

    if (n > 1) {
      sum += n;
    }

    System.out.println(sum);
  }
  
}

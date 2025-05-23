package mixed;
//Write a Java program that takes an integer n and calculates the sum of all its distinct prime factors.
import java.util.Scanner;
public class calculatedisprimeno {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    int sum = 0; // initializes a variable "sum to store the total of distinct prime factors"

    for(int i=2 ; i*i <= n; i++) { // this loop runs from 2 to root n , We only go up to √n because if n has any factors greater than √n, then the smaller factor pair would have already been processed.//Example: If n = 60, i goes up to 7 because 7*7 > 60.
      if (n % i == 0) {
        sum += i; // Adds this factor i to the sum. We’re treating it as a distinct prime factor.
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

// leetcode q. no 233 || number of digit one
package bitmanipulation;
import java.util.*;

public class numberofdigitone {
  public static void main(String[] args) {
    System.out.print("enter the value of n : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    
    int count = 0;
    long i = 1;

    while(i <= n){
      long higher = n /(i * 10);
      long curr = (n/i) % 10;
      long lower = n % i;

      if(curr == 0){
        count += higher * i;
      } else if(curr == 1){
        count += higher * i + (lower + 1);
      } else {
        count += (higher + 1) * i;
      }
      i *= 10;
    }
    System.out.println(count);
  }  
}
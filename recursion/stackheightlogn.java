// print x^n (Stack height = logn)
// Time Complexity = O(2^log n) = O(n) >>> not optimized
package recursion;

public class stackheightlogn {
  public static int calpower(int x, int n){
    if(n == 1){
      return x;
    }
    if(x == 0){
      return 0;
    }

    //if n is even 
    if(n % 2 == 0){
      return calpower(x, n/2) * calpower(x, n/2);
    } else { // if n is odd
      return calpower(x, n/2) * calpower(x, n/2) * x;
    }
  }
  public static void main(String[] args) {
    int x = 2, n =5;
    int ans = calpower(x, n);
    System.out.println(ans); 
  } 
}
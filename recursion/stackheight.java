// print x^n (Stack height = n)
// Time Complexity = O(n)
package recursion;

public class stackheight {
  public static int calpower(int x, int n){
    if(n == 1){
      return x;
    }
    if(x == 0){
      return 0;
    }

    int xPowernm1 = calpower(x, n-1);
    int xPowern = x * xPowernm1;
    return xPowern;
  }
  public static void main(String[] args) {
    int x = 2, n =5;
    int ans = calpower(x, n);
    System.out.println(ans); 
  } 
}
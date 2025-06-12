// factorial
// time complexity O(n)
package recursion;

public class facdiffmeth {
  public static int calucaltefac(int n){
    if(n == 1 || n == 0){
      return 1;
    }

    int fac = calucaltefac(n-1);
    int facn = n * fac;
    return facn;
  }
  public static void main(String[] args) {
    int n = 5;
    int ans = calucaltefac(n);
    System.out.println(ans); 
  } 
}
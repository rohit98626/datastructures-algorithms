// fibonacci series more efficent code 
// time complexity O(n)
package recursion;

public class fibdiffmeth {
  public static void calfib(int a, int b, int n){
    if(n == 0){
      return;
    }
    int c = a+b;
    System.out.println(c);
    calfib(b, c, n-1);
  }
  public static void main(String[] args) {
    int a=0, b=1;
    System.out.println(a);
    System.out.println(b);
    int n = 7;
    calfib(a, b, n-2);
  } 
}
// place tiles of size 1xm in a floor of size nxm
// time complexity O(2^n) 
package recursion;

public class tiles {
  public static int placetiles(int n, int m) {
    if(n == m){
      return 2;
    }
    if( n < m){
      return 1;
    }

    int verticalPlacement = placetiles(n-m, m);
    int horizontalPlacement = placetiles(n-1, m);

    return verticalPlacement + horizontalPlacement;
  }
  public static void main(String[] args) {
    int n=4, m=2;
    int totaltiles = placetiles(n, m);
    System.out.println(totaltiles);
  } 
}
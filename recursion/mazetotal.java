// count total paths in a maze to move from (0,0) to (n,m).
// time complexity of this problem is very high, so now we will solve this by dynamic programming.
package recursion;

public class mazetotal {
  public static int countpath(int i, int j, int n, int m) {
    if(i == n || j == m) {
      return 0;
    }
    if(i == n-1 && j == m-1) {
      return 1;
    }

    int downpaths = countpath(i+1, j, n, m);
    int rightpaths = countpath(i, j+1, n, m);
    return downpaths + rightpaths;
  }
  public static void main(String[] args) {
    int n = 3, m = 4;
    int totalpaths = countpath(0, 0, n, m);
    System.out.println(totalpaths); 
  } 
}
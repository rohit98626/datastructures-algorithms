// maze total done by dp
// time complexity O(n.m)
package recursion;

public class dpmazetotal {
  public static int countpaths(int n, int m) {
    int[][] dp = new int[n][m];

    dp[n-1][m-1] = 1;

    for(int i=n-1; i>=0; i--){
      for(int j=m-1; j>=0; j--){
        if(i == n-1 && j == m-1){
          continue;
        }
        int downpaths = 0;
        int rightpaths = 0;

        if(i+1 < n) {
          downpaths = dp[i+1][j];
        }
        if(j+1 < m) {
          rightpaths = dp[i][j+1];
        }

        dp[i][j] = downpaths + rightpaths;
      }
    }
    return dp[0][0];
  }
  public static void main(String[] args) {
    int n=3, m=4;
    int totalpaths = countpaths(n, m);
    System.out.println(totalpaths); 
  } 
}
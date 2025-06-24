// tiles.java using dp
// time complexity O(n)
package recursion;

public class dptiles {
  public static int placetiles(int n, int m) {
    int[] dp = new int[n + 1];

    for(int i=0; i<=n; i++) {
      if (i < m) {
        dp[i] = 1;
      } else if (i == m) {
        dp[i] = 2;
      } else {
        dp[i] = dp[i - 1] + dp[i - m];
      }
    }
    return dp[n];
  }
  public static void main(String[] args) {
    int n=4, m=2;
    System.out.println(placetiles(n, m)); 
  } 
}
// product of array except self (Optimized both TC and SC  O(n) and O(1))
package Array;

public class prodofarr3 {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4};
    int n = nums.length;
    int[] ans = new int[n];
    ans[0] = 1;
    
    //prefix => ans
    for(int i=1; i<n; i++) {
      ans[i] = ans[i-1] * nums[i - 1];
    }

    //suffix
    int suffix=1;

    for(int i=n-2; i>=0; i--) {
      suffix*= nums[i + 1];
      ans[i] *= suffix;
    }

    for(int x : ans) {
      System.out.print( x + ",");
    }
  }
}

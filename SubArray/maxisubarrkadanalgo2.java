/*  
   Maximum Subarray sum using kadane's algorithm

Given an integer array nums, find the contiguous subarray with the maximum sum. 
*/

// Kadane's algo

package SubArray;

public class maxisubarrkadanalgo2 {
  public static void main(String[] args) {
    int[] arr = {3,-4,5,4,-1,7,-8};
    int maxsum = arr[0];
    int currsum = 0;

    for(int i=0; i<arr.length; i++) {
      
      currsum += arr[i];
      maxsum = Math.max(currsum, maxsum);

      if( currsum < 0) {
        currsum = 0;
      }
    }
    System.out.println(maxsum);
  }
  
}

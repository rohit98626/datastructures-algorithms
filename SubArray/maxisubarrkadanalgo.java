/*  
   Maximum Subarray sum using kadane's algorithm

Given an integer array nums, find the contiguous subarray with the maximum sum. 
*/

// brute force

package SubArray;

public class maxisubarrkadanalgo {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};

    int n = arr.length;
    int maxsum = 1;

    for(int start=0; start<n; start++) {
      int currsum = 0;

      for(int end=start; end<n; end++) {

        currsum += arr[end];
        maxsum = Math.max(currsum, maxsum);
      }
    }
    System.out.println(maxsum);
  } 
}
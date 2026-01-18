// trapping rain water

// two Pointer 

/* You are given an array of non-negative integers where each element represents the height of a bar in an elevation map.
Each bar has a width of 1 unit.

When it rains, water can be trapped between the bars. */

package Array;

public class trappingrainwater2 {
  public static void main(String[] args) {
    int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
    int water = 0;

    int left = 0;
    int right = arr.length-1;
    int leftmax = 0;
    int rightmax = 0;

    while(left < right ) {
      leftmax = Math.max(leftmax, arr[left]);
      rightmax = Math.max(rightmax, arr[right]);

      if( leftmax < rightmax) {
        water += (leftmax - arr[left]);
        left++;
      } else {
        water += (rightmax - arr[right]);
        right--;
      }
    }
    System.out.println(water);
  }
  
}

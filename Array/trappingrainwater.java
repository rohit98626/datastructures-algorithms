// trapping rain water

// Prefix Array Approach

/* You are given an array of non-negative integers where each element represents the height of a bar in an elevation map.
Each bar has a width of 1 unit.

When it rains, water can be trapped between the bars. */

package Array;

public class trappingrainwater {
  public static void main(String[] args) {

    int arr[] = {4, 2, 0, 3, 2, 5};
    int n = arr.length;

    int leftmax[] = new int[n];
    int rightmax[] = new int[n];
    int water = 0;

    // left max
    leftmax[0] = arr[0];
    for (int i = 1; i < n; i++) {
      leftmax[i] = Math.max(leftmax[i - 1], arr[i]);
    }

    // right max
    rightmax[n - 1] = arr[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      rightmax[i] = Math.max(rightmax[i + 1], arr[i]);
    }

    // water calculation
    for (int i = 0; i < n; i++) {
      water += Math.min(leftmax[i], rightmax[i]) - arr[i];
    }

    System.out.println(water);
  }
}

// Container With Most Water

/* You're given an array where each element represents the height of a vertical line. You need to find two lines
that, together with the x-axis, form a container that holds the maximum amount of water. */


// Two Pointer

package Array;

public class containerwithmostwater2 {
  public static void main(String[] args) {
    int[] arr = {1,2,5,9,6,8};
    int left = 0;
    int right = arr.length - 1;
    int maxwater = 0;

    while(left < right) {
      int width = right - left;
      int height = Math.min(arr[left], arr[right]);
      int area = height * width;
      maxwater = Math.max(maxwater, area);

      if(arr[left] < arr[right]) {
        left++;
      }else {
        right--;
      }
    }
    System.out.println(maxwater);
  }
  
}

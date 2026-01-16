// Container With Most Water

/* You're given an array where each element represents the height of a vertical line. You need to find two lines
that, together with the x-axis, form a container that holds the maximum amount of water. */


// BRUTE FORCE

package Array;

public class containerwithmostwater {
  public static void main(String[] args) {
    int maxwater = 0;
    int arr[] = {1,2,5,9,6,8};

    for (int i=0; i<arr.length; i++) {
      for(int j= i+1; j<arr.length; j++) {
        int width = j-i;
        int height = Math.min(arr[i], arr[j]);
        int area = width * height;
        maxwater = Math.max(maxwater, area);
      }
    }
    System.out.println(maxwater);
  } 
}
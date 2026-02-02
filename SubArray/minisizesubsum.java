//minimum size subarray sum

package SubArray;

public class minisizesubsum {
  public static void main(String[] args) {

    int[] arr = {2,3,1,2,4,3};
    int target = 7;

    int left = 0;
    int sum = 0;
    int minimumLength = Integer.MAX_VALUE;

    for (int right = 0; right < arr.length; right++) {
      sum += arr[right];   // expand window

      while (sum >= target) {
        minimumLength = Math.min(minimumLength, right - left + 1);
        sum = sum - arr[left];  // shrink window
        left++;
      }
    }

    if (minimumLength == Integer.MAX_VALUE) {
      System.out.println(0);
    } else {
      System.out.println(minimumLength);
    }
  }
}

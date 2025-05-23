// reverse array (int [] arr, int start, int end )
// arr- 10,20,30,40,50
package recursion;
import java.util.Arrays;

public class reversearray {
  public static void reverse(int[] arr , int start, int end) {
    // base case
    if (start >= end) {
      return;
    }

    // swap elements
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;

    reverse(arr, start + 1, end - 1);
  }
  public static void main(String[] args) {
    int[] arr = {1,2,4,5,34,9};
    reverse(arr, 0, arr.length-1);
    System.out.println("the reversed array is :" + Arrays.toString(arr));
  }
}
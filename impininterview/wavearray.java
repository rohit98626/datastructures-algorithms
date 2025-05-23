/*  given an unsorted array of integers, sort the arary into a wave array. an array arr[0..n-1]
is sorted in wave form if: arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= ....
input arr[] {10,5,6,3,2,20,100,80}
output arr[] {10,5,6,2,20,3,100,80}

input arr[] {20,10,8,6,4,2}
output arr[] {20,8,10,4,6,2}

--> first sort the array -- 2,3,5,6,10,20,80,100
    swap 1st two elements -- 3,2,6,5,20,10,100,80
*/

package impininterview;
import java.util.*;

public class wavearray {
  public static void main(String[] args) {
    int[] arr = {10,5,6,3,2,20,100,80};
    Arrays.sort(arr);
    for(int i=0; i<arr.length - 1; i=i+2) {
      int temp=arr[i];
      arr[i]=arr[i+1];
      arr[i+1]=temp;
    }
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
/*  Given an array, move all 0s to the end
 while maintaining the relative order of non-zero elements
do it in-place */

package Array;

public class movezeros {
  public static void main(String[] args) {
    int[] arr = {0,2,4,0,1,0,44,5,9};

    int j = 0;
    int temp = 0;

    for(int i=0; i<arr.length; i++) {
      if( arr[i] != 0) {
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        j++;
      }
    }
    
    for(int x : arr) {
      System.out.print(x);
    }

  }
}

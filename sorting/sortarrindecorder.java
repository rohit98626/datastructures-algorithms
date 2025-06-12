// sort array in descending order
package sorting;
import java.util.*;


public class sortarrindecorder {
  public static void main(String[] args){
    Integer[] arr = {1,4,2,7,5};

    Arrays.sort(arr, Collections.reverseOrder());   // O(n log n) optimized 
    System.out.println(Arrays.toString(arr));


    //scratch basic

    // int arr[] = {1,4,2,7,5};

    // for(int i=0; i<arr.length-1; i++){
    //   for(int j=0; j<arr.length-i-1; j++){
    //     if(arr[j] < arr[j+1]) {
    //       //swap
    //       int temp = arr[j];
    //       arr[j] = arr[j+1];
    //       arr[j+1] = temp;
    //     }
    //   }
    // }
    // System.out.println(Arrays.toString(arr));
    
  } 
}
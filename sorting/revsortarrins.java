/*  Reverse Sorted Array using Insertion Sort
Problem: Sort a descending array like {5, 4, 3, 2, 1} 
using insertion sort and count number of shifts. */

package sorting;
import java.util.*;

public class revsortarrins {
  public static void main(String[] args) {
    int arr[] = {5,4,3,2,1};
    int shiftcount = 0;

    for(int i=1; i<arr.length; i++){
      int current = arr[i];
      int j = i-1;
      while(j >= 0 && current < arr[j]){
        arr[j+1] = arr[j];
        shiftcount++;
        j--;
      }
      arr[j+1] = current;
    }
    System.out.println("Number of ShiftCounts are : " + " " + shiftcount);
    System.out.println(Arrays.toString(arr));
    
  } 
}
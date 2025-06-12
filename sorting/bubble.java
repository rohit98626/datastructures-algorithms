package sorting;
import java.util.*;

public class bubble {
  public static void main(String[] args) {
    int arr[] = {7,8,3,1,2};

    // time complexity O(n^2) this is not a good time complexity for sorting 

    for(int i=0; i<arr.length-1; i++) { // outer loop runs n-1 times
      for(int j=0; j<arr.length-i-1; j++) { // 1st time n then, n-1 , n-2 , etc.
        if(arr[j] > arr[j+1]) {
          //swap
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr));
  } 
}
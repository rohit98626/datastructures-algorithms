//Problem: Sort only the first k elements
package sorting;
import java.util.*;

public class sortfirkthele {
  public static void main(String[] args) {
    int arr[] = {9, 1, 5, 3, 8, 2};
    int k = 4;

    for(int i=0; i<k-1; i++){
      for(int j=0; j<k-i-1; j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j+1];
          arr[j+1] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr));
  } 
}
package sorting;
import java.util.*;

public class nopfswaps {
  public static void main(String[] args) {
    int arr[] = {4,8,1,6,2};
    int swap = 0;

    for(int i=0; i<arr.length-1; i++){
      for(int j=0; j<arr.length-i-1; j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j+1];
          arr[j+1] = arr[j];
          arr[j] = temp;
          swap++;
        }
      }
    }
    System.out.println(swap);
    System.out.println(Arrays.toString(arr)); 
  } 
}
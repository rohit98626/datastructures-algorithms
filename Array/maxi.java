// find maximum element in an array
package Array;

public class maxi {
  public static void main(String[] args) {
    
    int[] arr = {1,2,3,4,5};
    int max = Integer.MIN_VALUE;

    for(int i=0; i<arr.length; i++){
      if(arr[i] > max){
        max = arr[i];
      }
    }
    System.out.println("maximum element is : " + max );
  } 
}
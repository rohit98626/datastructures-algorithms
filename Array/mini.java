// find the minimum value from an array
package Array;

public class mini {
  public static void main(String[] args) {
    int[] arr = {2,3,1,5,6};
    int min = arr[0];

    for(int i=0; i<arr.length; i++){
      if(arr[i] < min ){
        min = arr[i];
      } 
    }
    System.out.println("minimum value is : " + min);
  } 
}
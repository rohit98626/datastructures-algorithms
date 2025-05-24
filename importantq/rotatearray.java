// rotate an array
package importantq;
public class rotatearray {
  public static void main(String[] args) {

    int [] arr = {10,11,12,13,14,15,16};
    int temp = arr[0];

    for (int i=0; i<arr.length-1 ; i++) {
      arr[i] = arr[i+1];
    }
    
    arr[arr.length-1] = temp;
    for (int i=0; i<arr.length; i++) {
      System.out.println(arr[i] + "");
    }
  } 
}
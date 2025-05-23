// find missing element from an array
package impininterview;

public class missingelementsinarray {
  public static void main(String[] args) {
    int[] arr = {3,4,6,8,9,11,13};
    for (int i=0; i<arr.length-1; i++) {
      if((arr[i+1]-arr[i])!=1) {
        System.out.println("Missing element="+ (arr[i]+1));
      }
    }
  } 
}
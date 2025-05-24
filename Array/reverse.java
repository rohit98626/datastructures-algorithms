// reverse an array
package Array;

public class reverse {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    int start = 0;
    int last = arr.length-1;

    while(start<last){
      int temp = arr[start];
      arr[start] = arr[last];
      arr[last] = temp;

      start++;
      last--;
    }

    for(int n : arr){
      System.out.print(n);
    }
  } 
}
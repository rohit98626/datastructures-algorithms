// count occurance of a number in an array 
package Array;

public class countoccurance {
  public static void main(String[] args) {
    int[] arr = {2,5,3,4,11,22,22,11,2,};
    int count = 0;
    int target = 11;

    for(int i=0; i<arr.length; i++){
      if(arr[i] == target){
        count++;
      }
    }
    System.out.println(count);
  }
}
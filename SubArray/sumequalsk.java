/*

Subarray sum equals k 


brute force

*/
package SubArray;

public class sumequalsk {
  public static void main(String[] args) {
      int[] arr = {9,4,29,3,10,5,18};
  int k = 33;
  int count = 0;

   for(int i=0; i<arr.length; i++) {
     int sum = 0;

     for(int j=i; j<arr.length; j++) {
       sum += arr[j];

       if(sum == k) {
         count++;
       }
      }
    }
    System.out.println(count);
  }
}

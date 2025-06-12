// check if an array is sorted (strictly increasing)
// time complexity O(n)
package recursion;

public class sortarr {
  public static boolean checkarr(int idx, int arr[]) {
    if(idx == arr.length-1){
      return true;
    }

    if(arr[idx] < arr[idx+1]){
      return checkarr(idx+1, arr);
    } else {
      return false;
    }
  }
  public static void main(String[] args) {
    int arr[] = {1,2,3,3,5};
    System.out.println(checkarr(0, arr)); 
  }
}
package Array;
// find if the array contians duplicate element if yes print true else false arr[]= 1,5,4,2,7,6,3

public class duplicate2 {
  public static void main(String[] args) {
    int[] arr = {1,5,4,2,7,6,3};
    System.out.println(containsDuplicate(arr));
  }

  public static boolean containsDuplicate(int[] arr) {
    for (int i = 0; i<arr.length; i++) {
      for (int j = i+1; j<arr.length; j++) {
        if(arr[i] == arr[j]){
          return true;
        }
      }
    }
    return false;
  }
}
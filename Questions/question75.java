package Questions;

import java.util.HashSet;

public class question75 {
  public static boolean containsduplicate(int[] arr) {

    HashSet<Integer> set = new HashSet<>();

    for (int num : arr) {
      if(set.contains(num)) {
        return true;
      }
      set.add(num);
    }
    return false;
  }
  public static void main(String[] args) {
    int arr[] = {1,2,4,5,2};
    System.out.println(containsduplicate(arr));
  }
}
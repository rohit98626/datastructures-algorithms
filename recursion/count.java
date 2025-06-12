// count how many times the element x appears in the given array using recursion
// time complexity O(n)
package recursion;
import java.util.*;

public class count {
  public static int Occurence(int[] arr, int x, int index) {
    if (index == arr.length) {
      return 0;
    }
    if (arr[index] == x) {
      return 1 + Occurence(arr, x, index+1);
    } else {
      return Occurence(arr, x, index+1);
    }
    
  }
  public static void main(String[] args) {
    int[] arr = {2,3,5,2,7,5,2,1,2};
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    sc.close();

    System.out.println(" count of " + x + " = " + Occurence(arr, x, 0));
  }
}
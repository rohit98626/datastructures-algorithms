// find maximum of an array using recursion
// time complexity = O(n)
package recursion;

public class maxi {
  public static int maximum(int[] arr, int index) {
    if (index == arr.length - 1) {
      return arr[index];
    }
    int maxInRest = maximum(arr, index + 1);
    return Math.max(arr[index], maxInRest);
  }
  public static void main(String[] args) {
    int[] arr = {2,3,4,9};
    int max = maximum(arr, 0);

    System.out.println("maximum is " + max);
  }
}
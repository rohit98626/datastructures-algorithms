package mixed;
// find target value 3 from array [1,3,4,5,2,3,9,8] from first to last 
public class searchary1 {
  public static void main(String[] args) {
    int[] arr = {1,3,4,5,2,3,9,8};
    int target = 3;
    int first = -1;
    int last = -1;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        if (first == -1) {
          first = i;
        }
        last = i;
      }
    }
    System.out.println("First: " + first);
    System.out.println("Last: " + last);
  }
  
}

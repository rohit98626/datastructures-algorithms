// range sum query using prefix

package Array;
import java.util.*;

public class rangesumquery2 {
  static int[] Prefix;
  public static void main(String[] args) {
    int[] nums = {-2,0,3,-5,2,-1};
    int n = nums.length;
    Prefix = new int[n];

    Prefix[0] = nums[0];
    for(int i=1; i<n; i++) {
      Prefix[i] = Prefix[i-1] + nums[i];
    }

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Left Index");
    int left = sc.nextInt();

    System.out.println("Enter the right index");
    int right = sc.nextInt();

    if(left == 0) {
      System.out.println(Prefix[right]);

    } else {
      System.out.println(Prefix[right] - Prefix[left - 1]);
    } 
  }
}
// optimized version using HashMap
package Questions;
import java.util.HashMap;
import java.util.Arrays;

public class question21 {
  public static void main(String[] args) {
    int[] nums = {1,2,25,12};
    int target = 27;
    int n = nums.length;

    HashMap<Integer,Integer> map = new HashMap<>();

    for(int i=0; i<n; i++) {
      int ans = target - nums[i];

      if(map.containsKey(ans)) {
        System.out.println(Arrays.toString(new int[] {map.get(ans), i}));
        return;
      }
      map.put(nums[i],i);
    }
  }
}
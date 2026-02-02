// continous subarray sum

package SubArray;

import java.util.HashMap;

public class contsubarrsum {
  public static void main(String[] args) {
    int[] nums = {23,2,4,7};
    int n = nums.length;
    int k = 6;

    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);

    int sum = 0;

    for(int i=0; i<n; i++) {
      sum += nums[i];

      int remainder = (k == 0) ? sum : sum%k;

      if(map.containsKey(remainder)) {
        if(i - map.get(remainder) >= 2) {
          System.out.println(true);
          return;
        }
      } else {
        map.put(remainder, i);
      }
    }
    System.out.println(false);
  } 
}
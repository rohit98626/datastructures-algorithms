/*
  subarray sum equals k 

  Prefix sum approach   using unordered hashing
*/

package SubArray;
import java.util.*;

public class sumequalsk2 {
  public static void main(String[] args) {
    int[] arr = {9,4,0,20,3,10,5};
    int k = 33;
    int n = arr.length;

    HashMap<Integer, Integer> map = new HashMap<>(); 
    int PrefixSum = 0;
    int count = 0;

    //base case
    map.put(0,1);

    for(int i=0; i<n; i++) {
      PrefixSum += arr[i];

      if(map.containsKey(PrefixSum - k)) {
        count += map.get(PrefixSum - k);
      }
      
      map.put(PrefixSum, map.getOrDefault(PrefixSum, 0) + 1);
    }
    System.out.println(count);
  }
}

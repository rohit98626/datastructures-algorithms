// slidiing window maximum

// tc - O(N-K) * K
// sc - O(N-K)

package queuee;
import java.util.*;


public class slidingwindow {
  public static void main(String[] args) {
    int[] arr = {1,3,-1,-3,5,3,2,1,6};
    int k = 3;
    int n = arr.length;
    int Max = 0;

    List<Integer> list = new ArrayList<>();

    for(int i=0; i<=n-k; i++) {
      Max = arr[i];

      for(int j=i; j<=i+k-1; j++) {
        Max = Math.max(Max, arr[j]);
      }
      list.add(Max);
    }
    System.out.println(list);
  }
}
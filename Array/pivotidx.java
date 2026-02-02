//find pivot index 

package Array;

public class pivotidx {
  public static void main(String[] args) {
    int[] nums = {1,7,3,6,5,6};
    int n = nums.length;
    int totalsum = 0;

    for(int i=0; i<n; i++){
      totalsum += nums[i];
    }

    int leftsum = 0;
    for(int i=0; i<n; i++) {
      int rightsum = totalsum - leftsum - nums[i];

      if(leftsum == rightsum) {
        System.out.println(i);
        return;
      }
      leftsum += nums[i];
    }
    System.out.println(-1);
  }
}
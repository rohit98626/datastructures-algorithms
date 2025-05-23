// return the majority element 
package Array;

public class majorityelement {
  public static void main(String[] args) {
    int[] nums = {2,2,1,1,1,2,2};
    int cand = 0;
    int count = 0;

    for(int i=0; i<nums.length; i++){
      if(count == 0){
        cand = nums[i];
      }
      if(cand == nums[i]){
        count++;
      }else{
        count--;
      }
    }
    System.out.println(cand);
  }
}
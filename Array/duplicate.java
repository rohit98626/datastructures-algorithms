// remove duplicate element from the sorted array
package Array;

public class duplicate {
  public static void main(String[] args) {
    int[] nums = {0,0,1,1,1,2,2,3,3,4,5,6};

    if(nums.length == 0) {
      return;
    }

    int i =0;

    for(int j=1; j<nums.length; j++) {
      if(nums[j] != nums[i]){
        i++;
        nums[i] = nums[j];
      }
    }
    
    System.out.println("Array after removing duplicates:");
    for(int k=0; k <= i; k++){
      System.out.print(nums[k] + "");
    }
  } 
}
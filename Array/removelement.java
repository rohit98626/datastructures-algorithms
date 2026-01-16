// remove element of the occurance of value (val) from an array
package Array;

public class removelement {
  public static void main(String[] args) {
    int[] nums = {1,2,2,3,5,6,3,2,3};
    int val = 3;

    int newLength = removeElement(nums,val);

    System.out.println("new length " + newLength);
    System.out.println("updated array :");
    for(int i = 0; i < newLength; i++){
      System.out.print(nums[i] + " ");
    }
  }

  public static int removeElement(int[] nums, int val){
    int i = 0;
    for(int j = 0; j<nums.length; j++){
      if(nums[j] != val){
        nums[i] = nums[j];
        i++;
      }
    }
    return i;
  }
}
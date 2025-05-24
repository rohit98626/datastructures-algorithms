// leetcode question 1. Two sum 
package leetcode;

import java.util.*;

public class twosum {
  public static void main(String[] args) {
    int nums[] = {1,2,4,6,7};
    int target = 3;
    int sum[] = null;

    for(int i=0; i<nums.length; i++){
      for(int j=i+1; j<nums.length; j++){
        if(nums[i] + nums[j] == target){
          sum = new int[] {i,j};
          break;
        }
      }
    }

    if(sum != null){
      System.out.println("indices " + Arrays.toString(sum));
    }else{
      System.out.println("no two numbers add up to the target");
    }
  }
}
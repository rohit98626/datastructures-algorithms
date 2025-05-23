// basic binary search code

package binarysearch;

import java.util.*;

public class bs {
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7};
    int right = arr.length-1;
    int left = 0;
    System.out.println("enter the element you want to search: " );
    Scanner sc = new Scanner(System.in);
    int ele = sc.nextInt();
    sc.close();
    boolean flag = false;

    for(int i=0; i<arr.length; i++){
      int mid = (left+right)/2;
      if(ele==arr[mid]){
        flag=true;
        break;
      }else if(ele<arr[mid]){
        right=mid+1;
      }else {
        left=mid+1;
      }
    }
    if(flag){
      System.out.println("element found");
    }else{
      System.out.println("element not found");
    }
  } 
}
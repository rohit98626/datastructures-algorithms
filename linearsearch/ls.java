// basic linear search code

package linearsearch;

import java.util.Scanner;

public class ls {
  public static void main(String[] args) {
    int arr[] = {10,11,9,8,7,19,3,21,4};
    Scanner sc = new Scanner (System.in);
    int ele = sc.nextInt();
    sc.close();
    boolean flag = false;

    for(int i=0; i<arr.length; i++){
      if(ele==arr[i]){
        flag = true;
        break;
      }
    }

    if(flag){
      System.out.println("Element Found ! ");
    }else{
      System.out.println("Element not Found ! ");
    }
  } 
}
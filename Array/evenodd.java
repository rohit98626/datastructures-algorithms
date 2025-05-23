// find even and odd elements in an array (used arraylist which is recommended for dynamic size)
package Array;
import java.util.ArrayList;

public class evenodd {
  public static void main(String[] args) {
    int[] arr = {2,4,3,12,5,1};

    ArrayList<Integer> even = new ArrayList<>();
    ArrayList<Integer> odd = new ArrayList<>(); 

    for(int i=0; i<arr.length; i++){
      if(arr[i] % 2 == 0){
        even.add(arr[i]);
      } else{
        odd.add(arr[i]);
      }
    }
    System.out.println("even nos are : " + even);
    System.out.println("odd nos are : " + odd);
  } 
}
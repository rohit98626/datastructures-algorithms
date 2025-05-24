package Array;
// take 2 arrays and add the sum of all elements
public class sum0ftwoarr {
  public static void main(String[] args) {
    int[] arr = {1,3,5,9,2,7};
    int[] arr2 = {32,11,5,6,9,1};
    int sum = 0;

    for(int i=0; i<arr.length; i++){
      sum += arr[i];
    }
    for(int j=0; j<arr2.length; j++){
      sum += arr2[j];
    }
    System.out.println("sum of both arrays are : " + sum);
  } 
}
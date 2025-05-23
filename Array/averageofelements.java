// sum of average of all elements
package Array;

public class averageofelements {
  public static void main(String[] args) {
    int[] arr = {1,2,4,5,6};
    double sum = 0;

    for(int i=0; i<arr.length; i++){
      sum += arr[i];
    }
    double average = sum / arr.length;

    System.out.println("Average of elements is : " + average);
  } 
}
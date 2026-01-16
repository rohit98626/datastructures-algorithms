/*  count elements greater than previous average

Given an array of positive integers, return the number of elements that are strictly greater than the average of all previous elements. Skip the first element.

Example

Input
responseTimes = [100, 200, 150,300]

Output
2 

*/
package Array;
import java.util.List;
import java.util.Arrays;


public class countelements {
  public static int CountResponseTimeRegression(List<Integer> responseTimes) {
    int n = responseTimes.size();
    if( n <= 1) return 0;

    int count = 0;
    long sum = responseTimes.get(0);

    for(int i=1; i < n; i++) {
      double average = (double) sum/i;

      if( responseTimes.get(i) > average) {
        count++;
      }

      sum += responseTimes.get(i);
    }
    return count;
  }
  
  public static void main(String[] args) {

    List<Integer> responseTimes = Arrays.asList(100, 200, 150, 300);
    System.out.println(CountResponseTimeRegression(responseTimes));
  }
}
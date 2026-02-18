package Questions;
// find 2nd maximum of an array time complexity big of n 
public class question41 {
  public static void main (String [] args) {

    int [] arr = {1,5,6,3,2,4};
    int max = 0;
    int firstmax = 0;
    int secondmax = 0;

    for (int i = 1; i < arr.length; i++) {
      if (arr [i] > max) {
        secondmax = firstmax;
        firstmax = arr[i];
      }
      if (arr [i] > secondmax && arr[i] !=firstmax) {
        secondmax = arr [i];
      }
    }
    System.out.println(max);
  }
  
}

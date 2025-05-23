package mixed;
// 1,5,4,3,9,1 : find maximum
public class findmaximum {
  public static void main(String [] args) {

    int[] arr = {1, 5, 4, 3, 9, 1};
    int max = Integer.MIN_VALUE;

    for(int i = 0 ; i< arr.length ; i++) {
      if ( arr[i] > max ) {
        max = arr[i];
      }
    }
    System.out.println(max);

  }
  
}

package mixed;
// perform linear search
public class search {
  public static void main(String[] args) {
    
    int[] arr = {1,3,2,5,4,7};
    int target = 1;

    for (int i = 0 ; i < arr.length ; i++) {
      if ( arr[i] == target ) 
      System.out.println(i);
    }
  }
}
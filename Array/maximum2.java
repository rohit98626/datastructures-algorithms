// find maximum using diff. method , can be used for both negative or positive arrays
package Array;

public class maximum2 {
  public static void main(String[] args) {
    int arr[] = {-10,-4,-5};
    int max = arr[0];

    for(int i=0; i<arr.length; i++) {
      if(arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println(max);
  } 
}
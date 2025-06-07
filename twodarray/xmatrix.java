// take a matrix as input from the user. search for a given number x and print the indices
// at which it occurs.
package twodarray;
import java.util.*;

public class xmatrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();

    int[][] numbers = new int[rows][cols];

    for(int i=0; i<rows; i++){
      for(int j=0; j<cols; j++){
        numbers[i][j] = sc.nextInt();
      }
    }

    int x = sc.nextInt();

    for(int i=0; i<rows; i++){
      for(int j=0; j<cols; j++){
        if(numbers[i][j] == x ){
          System.out.println("X Found at Location(" + i + "," + j + ")");
        }
      }
    }
  } 
}
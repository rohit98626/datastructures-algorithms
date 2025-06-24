// take a matrix as input from the user. search for a given number x and print the indices
// at which it occurs.
package twodarray;
import java.util.*;

public class xmatrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of rows: ");
    int rows = sc.nextInt();
    System.out.print("Enter number of columns: ");
    int cols = sc.nextInt();

    int[][] numbers = new int[rows][cols];

    System.out.println("Enter the matrix elements:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        numbers[i][j] = sc.nextInt();
      }
    }

    System.out.print("Enter the number to search: ");
    int x = sc.nextInt();

    boolean found = false;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (numbers[i][j] == x) {
          System.out.println("x found at (" + i + ", " + j + ")");
          found = true;
        }
      }
    }

    if (!found) {
      System.out.println("x not found in the matrix.");
    }

    sc.close();
  }
}
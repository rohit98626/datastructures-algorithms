// half pyramid with numbers 
package patterns;
import java.util.*;

public class halfpyrawithnos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value");
    
    int m = sc.nextInt();
    
    for(int i = 1; i<=m; i++){
      for(int j = 1; j<=i; j++){
        System.out.print(j + " ");
      }
      System.out.println();
    }
    sc.close();
  } 
}
package impininterview;
// rotate an array, when user inputs
import java.util.Scanner;

public class rotate2 {
  public static void main(String[] args) {
    int[] arr = {10, 11, 12, 13, 14, 15, 16};

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of times you want to rotate:");
    int n = sc.nextInt();
    n = n % arr.length; // Optional: avoids extra rotations if n > length
    sc.close();

    // Rotate n times
    for (int j = 0; j < n; j++) {
      int temp = arr[0];
      for (int i = 0; i < arr.length - 1; i++) {
        arr[i] = arr[i + 1];
      }
      arr[arr.length - 1] = temp;
    }

    // Print rotated array
    System.out.print("Rotated array: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
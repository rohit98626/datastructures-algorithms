// range sum query --> brute force

package Questions;

import java.util.*;

public class question12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Size of Array");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter Elements");
    for(int i=0; i<n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter Left Index");
    int left = sc.nextInt();

    System.out.println("Enter Right Index");
    int right = sc.nextInt();

    int sum = 0;
    for(int i = left; i<= right; i++) {
      sum += arr[i];
    }
    System.out.println("Range" + sum);
  }
}
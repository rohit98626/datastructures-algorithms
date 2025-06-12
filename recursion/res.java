// print sum of first n natural numbers using recursion **Different Method || tail recursive style**
// Time Complexity: O(n)
package recursion;

public class res {
  public static void nnatural(int i, int n, int sum) {
    if(i == n){
      sum += i;
      System.out.println(sum);
      return;
    }

    sum += i;
    nnatural(i+1, n, sum);
    System.out.println(i);
  }

  public static void main(String[] args) {
    nnatural(1, 5, 0);
  } 
}
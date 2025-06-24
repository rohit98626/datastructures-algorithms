// find the number of ways in which you can invite n people to your party, single or in pairs.
// time complexity O(2^n)
package recursion;

public class singleorpairs {
  public static int printways(int n) {
    if(n <= 1) {
      return 1;
    }

    //single way
    int way1 = printways(n-1);
    //paired way
    int way2 = (n-1) * printways(n-2);

    return way1 + way2;
  }
  public static void main(String[] args) {
    int n = 4;
    System.out.println(printways(n)); 
  } 
}
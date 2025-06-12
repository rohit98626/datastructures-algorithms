// Tower of Hanoi
// time complexitiy O(2^n - 1) ~ O(2^n)
package recursion;

public class towerofhanoi{
  public static void tower(int n, String src, String helper, String desi){
    if(n == 1){
      System.out.println("Transfer of Disk " + n + " from " + src + " to " + desi);
      return;
    }

    tower(n-1, src, desi, helper); // helper=desi, desi=helper
    System.out.println("Transfer of Disk "+ n + " from "+ src + " to "+ desi);
    tower(n-1, helper, src, desi);
  }
  public static void main(String[] args) {
    int n = 3;
    tower(n, "S", "H", "D");
  }
}
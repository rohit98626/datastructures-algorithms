// time complexity - O(n*n!)
package backtracking;

public class basic {
  public static void printpermutation(String str, String perm, int idx, int[] count) {
    if(str.length() == 0) {
      System.out.println(perm);
      count[0]++;
      return;
    }

    for(int i=0; i<str.length(); i++) {
      char currChar = str.charAt(i);
      String newStr = str.substring(0, i) + str.substring(i + 1);
      printpermutation(newStr, perm + currChar, idx + 1, count);
    }
  }
  public static void main(String[] args) {
    String str = "ABC";
    int[] count  = new int[1];
    printpermutation(str, "", 0, count); 
    System.out.println("Total permutations are: " + count[0]);
  } 
}
// write a program check if a no. or word is palindrome or not
//Time Complexity = O(n)
package recursion;

public class palindrome {
  public static boolean palidr(String str, int start, int end) {
    if(start >= end){
      return true;
    }
    if(str.charAt(start) != str.charAt(end)){
      return false;
    }

    return palidr(str, start+1, end-1);
  }
  public static void main(String[] args) {
    String str = "madam";
    if(palidr(str, 0, str.length()-1)){
      System.out.println("is palindrome");
    } else {
      System.out.println("not palindrome");
    } 
  } 
}
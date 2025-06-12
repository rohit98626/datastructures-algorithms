// find the 1st and last occurance of an element in string 
// time complexity O(n)
package recursion;

public class firlasocc {
  public static int first = -1;  // static 
  public static int last = -1;

  public static void findoccurance(String str, int idx, char element) {
    if(idx == str.length()){
      System.out.println(first);
      System.out.println(last);
      return;
    }
    
    char currChar = str.charAt(idx);
    if(currChar == element) {
      if(first == -1) {
        first = idx;
      } else {
        last = idx;
      }
    }
    findoccurance(str, idx+1, element); 
  }
  public static void main(String[] args) {
    String str = "ababaaceeda";
    findoccurance(str, 0, 'a');   
  }
}
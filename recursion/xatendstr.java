// move all 'X' to the end of the string.
// time complexity O(n).
package recursion;

public class xatendstr {
  public static void moveallx(String str, int idx, int count, String newString) {
    if(idx == str.length()){
      for(int i=0; i<count; i++){
        newString += 'x';
      }
      System.out.println(newString);
      System.out.println(count);
      return;
    }

    char currChar = str.charAt(idx);
    if(currChar == 'x'){
      count++;
      moveallx(str, idx+1, count, newString);
    } else {
      newString += currChar;
      moveallx(str, idx+1, count, newString);
    }
  }
  public static void main(String[] args) {
    String str = "axbcexded";
    moveallx(str, 0, 0, ""); 
  }
}
// print keypad combinations
// time complexity  O(k^n . n) ** k is the max number of letters per digit (≤ 4 for standard keypads).
package recursion;

public class keyboardcombi {
  public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

  public static void printcombi(String str, int idx, String combination) {
    if(idx == str.length()){
      System.out.println(combination);
      return;
    }

    char currChar = str.charAt(idx);
    String mapping = keypad[currChar - '0'];

    for(int i=0; i<mapping.length(); i++) {
      printcombi(str, idx+1, combination+mapping.charAt(i));
    }
  }

  public static void main(String[] args) {
    String str = "25";
    printcombi(str, 0, ""); 
  } 
}
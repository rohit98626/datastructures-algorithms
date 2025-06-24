// print all the unique subsequences of a string
// time complexity O (2^n . n)
package recursion;

import java.util.HashSet;

public class uniquesubseq {
  public static void uniquesub(String str, int idx, String newString, HashSet<String> set) {
    if(idx == str.length()){

      if(set.contains(newString)) {
        return;
      } else {
        System.out.println(newString);
        set.add(newString);
        return;
      }
    }

    char currChar = str.charAt(idx);
    uniquesub(str, idx+1, newString+currChar, set);
    uniquesub(str, idx+1, newString, set);
  }
  public static void main(String[] args) {
    String str = "aaa";
    HashSet<String> set = new HashSet<>();
    uniquesub(str, 0, "", set);
  } 
}

// using hashset + sliding window
package stringd;

import java.util.HashSet;

public class longeststring3 {
  public static void main(String[] args) {
    char[] stringarr = {'a','b','c','d','b','z','a','l','f'};
    String s = new String(stringarr);

    int n = s.length();
    int left = 0;
    int right = 0;
    int maxLength = 0;

    HashSet<Character> set = new HashSet<>(); 

    while(right < n) {
      char currentChar = s.charAt(right);

      //if duplicate find shrink window from left
      while(set.contains(currentChar)) {
        set.remove(s.charAt(left));
        left++;
      }

      set.add(currentChar);
      maxLength = Math.max(maxLength, right - left + 1);
      right++;
    }
    System.out.println(maxLength);
  }
}

  // longest substring w/o repeating characters

  // brute force 

package stringd;

import java.util.*;

public class longestsubstring2 {
  public static void main(String[] args) {
      
    char[] StringArray = {'a','b','c','d','e','c','a','b','c'};

    String s = new String(StringArray);

    int maxLength = 0;
    int n = s.length();

    for(int i=0; i<n; i++) {
      HashSet<Character> set = new HashSet<>();

      for(int j=i; j<n; j++) {
        if(set.contains(s.charAt(j))) {
          break;
        }
        set.add(s.charAt(j));
        maxLength = Math.max(maxLength, j-i+1);
      }
    }
    System.out.println(maxLength);
  }
}
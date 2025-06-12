// leetcode q. 3 longest substring without repeating characters
package stringd;

import java.util.HashMap;
import java.util.Scanner;

public class lengthoflongestsubstring {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    sc.close();

    HashMap<Character, Integer> map = new HashMap<>();
    int left = 0;
    int maxLength = 0;

    for (int right = 0; right < s.length(); right++) {
      char currentChar = s.charAt(right);

      if (map.containsKey(currentChar)) {
        left = Math.max(map.get(currentChar) + 1, left);
      }

      map.put(currentChar, right);
      maxLength = Math.max(maxLength, right - left + 1);
    }

    System.out.println(maxLength);
  }
}
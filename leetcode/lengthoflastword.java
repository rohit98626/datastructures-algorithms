// leetcode q. 58 length of last word
package leetcode;
import java.util.*;

public class lengthoflastword {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Input any Sentence : ");
    String s = sc.nextLine();
    sc.close();

    int i = s.length() - 1;
    int length = 0;

    while(i >= 0 && s.charAt(i) == ' '){
      i--;
    }
    while(i >= 0 && s.charAt(i) != ' '){
      length++;
      i--;
    }
    System.out.println(length);
  } 
}
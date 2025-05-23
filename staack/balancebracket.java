// check if brackets in a string are balanced 
package staack;
import java.util.Stack;

public class balancebracket {
  public static boolean isBalanced(String expression){
    Stack<Character> stack = new Stack<>();

    for(char ch: expression.toCharArray()){
      if( ch =='(' || ch == '{' || ch == '[') {
        stack.push(ch);
      } else if ( ch == ')' || ch =='}' || ch == ']') {
        if(stack.isEmpty()) return false;
        char top = stack.pop();
        if(! isMatchingPair(top, ch) ) return false;
      }
    }
    return stack.isEmpty();
  }

  private static boolean isMatchingPair(char open,char close) {
    return (open == '(' && close == ')') ||
           (open == '{' && close == '}') ||
           (open == '[' && close == ']');
  }

  public static void main(String[] args) {
    String exrp1 = "({[]})";
    String exrp2 = "({])";

    System.out.println(exrp1 + isBalanced(exrp1));
    System.out.println(exrp2 + isBalanced(exrp2));
  }
}
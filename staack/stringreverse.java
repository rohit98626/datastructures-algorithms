// reverse a string using stack
package staack;
import java.util.Stack;

public class stringreverse {
    public static void main(String[] args) {
        String name = "rohit";
        String rev = "";
        Stack<Character> st = new Stack<>();

        // Push each character to stack
        for (int i = 0; i < name.length(); i++) {
            st.push(name.charAt(i));
        }

        // Pop and build the reversed string
        while (!st.isEmpty()) {
            char ch = st.pop();     // Pop once
            rev = rev + ch;         // Build reversed string
        }

        System.out.println("\nReversed String: " + rev);
    }
}
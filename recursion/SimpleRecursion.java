// write a program to print natural numbers from n to 10 
package recursion;

public class SimpleRecursion {

    // Recursive method to print natural numbers from n to 10
    static void Naturalnum(int n) {
        if (n > 10) {
            return;
        }
        System.out.print(n + " ");  // Added space for clarity
        Naturalnum(n + 1);          // Recursive call
    }

    // Iterative method to print natural numbers from 0 to 10
    static void NaturalnumIterative() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Using Recursion:");
        Naturalnum(0);  // Recursive approach

        System.out.println("\nUsing Iteration:");
        NaturalnumIterative();  // Iterative approach
    }
}
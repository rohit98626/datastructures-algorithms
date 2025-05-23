package mixed;
// program to find the product of prime factors of a number 

import java.util.Scanner;

public class prod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int product = 1;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                product = product * i;
                while (n % i == 0) {
                    n = n / i;
                }
            }
        }

        if (n > 1) {
            product = product * n; 
        }

        System.out.println(product); 
    }
}

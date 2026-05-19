// code without boolean flag

import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(n <= 1) {
            System.out.println("The number is not prime.");
            sc.close();
            return;
        }

        for(int i = 2; i < n; i++) {

            if(n % i == 0) {
                System.out.println("The number is not prime.");
                sc.close();
                return;
            }
        }

        System.out.println("The number is prime.");

        sc.close();
    }
    
}
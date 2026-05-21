import java.util.Scanner;

public class TotalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0; // Isme hum apna total add karte jayenge (Accumulator)
        int number = -1; // Temp variable loop start karne ke liye

        System.out.println("Numbers enter karein (Stop karne ke liye 0 dabayein):");

        // Jab tak number 0 ke barabar nahi hota, loop chalta rahega
        while (number != 0) {
            System.out.print("Number daalein: ");
            number = sc.nextInt(); // User se input liya
            
            sum = sum + number; // Puraane sum mein naya number jod diya
        }

        System.out.println("Aapke sabhi numbers ka total sum hai: " + sum);
        sc.close();
    }
}
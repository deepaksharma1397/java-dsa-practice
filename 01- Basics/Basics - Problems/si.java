import java.util.Scanner;
public class si {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the annual interest rate (in percentage): ");
        double rate = sc.nextDouble();
        System.out.print("Enter the time (in years): ");
        int time = sc.nextInt();

        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
        sc.close();
    }
}
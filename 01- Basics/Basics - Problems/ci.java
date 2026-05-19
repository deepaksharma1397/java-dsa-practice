import java.util.Scanner;
public class ci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the time in years: ");
        double time = sc.nextDouble();

        double ci = principal * Math.pow(1 + rate / 100, time) - principal;
        System.out.printf("The compound interest is: %.2f\n", ci);
        sc.close();
    }
}
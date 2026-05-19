import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int max = (a > b) ? a : b;
        System.out.println("The maximum of " + a + " and " + b + " is: " + max);
        sc.close();
    }
}

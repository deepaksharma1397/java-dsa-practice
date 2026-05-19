import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How Many Numbers you want to Sum: ");
        int n = sc.nextInt();

        int sum = 0;
        System.out.println("Enter " + n + " numbers:");
        for (int i = 1; i <= n; i++) {
            int number = sc.nextInt();
            sum += number;
        }
        System.out.println("The sum of " + n + " numbers is: " + sum);
        sc.close();
    }
    
}
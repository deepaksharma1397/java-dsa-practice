import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        Double length = sc.nextDouble();
        System.out.print("Enter the breadth: ");
        Double breadth = sc.nextDouble();
        Double area = length * breadth;
        System.out.println("The area of the rectangle is: " + area);
        // if my value is not in float then why it is showing in float? what to write to come output without decimal
        System.out.printf("The area of the rectangle is: %.0f\n", area);

        sc.close(); 

        // what if we want output upto 3 decimal places?
        System.out.printf("The area of the rectangle is: %.3f", area);
    }
}

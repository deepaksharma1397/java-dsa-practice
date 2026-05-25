import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = (3.14*radius*radius);
        double circumference = (2*3.14*radius);
        System.out.println("The area of the circle is: " + area);
        System.out.printf("The area of the circle is: %.2f\n", area);
        System.out.println("The circumference of the circle is: " + circumference);
        System.out.printf("The circumference of the circle is: %.2f", circumference);
        sc.close();
    }
}
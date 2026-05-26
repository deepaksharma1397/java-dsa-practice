import java.util.Scanner;
public class Temp {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double cel = sc.nextDouble();
        double far = (cel * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit is: " + far); 
    sc.close();
    }
}
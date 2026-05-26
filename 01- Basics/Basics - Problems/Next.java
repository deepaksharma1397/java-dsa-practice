import java.util.Scanner;
public class Next {
    public static void main(String[] args) {
        // difference between next and nextLine() with example 
        // next() reads input until the first space, while nextLine() reads the entire line of input.
        // Example: if the user inputs "Hello World", next() will read "Hello" and nextLine() will read "Hello World".
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next(); // This will read only the first word of the input 
        // why we write string name = sc.next() instead of sc.next because next() returns a String, so we need to store it in a variable of type String.
        System.out.println("Hello, " + name + "!");
        sc.nextLine(); // This is to consume the remaining newline character after next()
        System.out.print("Enter your full name: ");    
        String fullName = sc.nextLine(); // This will read the entire line of input
        System.out.println("Hello, " + fullName + "!");
        sc.close();

    }
}

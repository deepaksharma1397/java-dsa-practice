// char to ASCII

public class Conversion2 {
    public static void main (String[] args) {
        char c = 'A';
        int ascii = (int) c; // This is called type casting, we are converting a char to an int
        System.out.println("The value of c is: " + c);
        System.out.println("The ASCII value of c is: " + ascii);
    }
}
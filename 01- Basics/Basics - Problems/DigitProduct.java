public class DigitProduct {
    public static void main(String[] args) {
        int num = 245; // Is number ke digits ka product nikalna hai (2 * 4 * 5 = 40)
        int product = 1; // Multiplication ke liye shuru mein 1 rakhte hain (0 nahi, kyunki 0 se multiply hokar sab 0 ho jayega)

        System.out.println("Original Number: " + num);

        // Jab tak number khatam hoke 0 nahi ho jata, loop chalega
        while (num > 0) {
            int lastDigit = num % 10; // 1. Last digit ko bahar nikala (%)
            
            product = product * lastDigit; // 2. Product mein multiply kiya
            
            num = num / 10; // 3. Last digit ko number se hata diya (/)
        }

        System.out.println("Digits ka product (multiplication) hai: " + product);
    }
}
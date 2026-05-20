

public class NumberTriangle {
    public static void main(String[] args) {
        int rows = 5;

        // Outer loop handles the number of rows
        for (int i = 1; i <= rows; i++) {
            
            // Inner loop handles what gets printed on each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); 
            }
            
            // This moves the cursor to the next line after finishing a row
            System.out.println(); 
        }
    }
}
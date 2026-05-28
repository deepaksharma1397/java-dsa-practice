import java.util.Scanner;

public class InvertPattern {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter a character: ");
        char c = sc.next().charAt(0); // This is how we take a char input from the user, we take a string input and then take the first character of that string
        int n ; 
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();
        for(int i = n; i >= 1 ; i--){
            for(int j = 1; j<= i; j++){
                System.out.print(c + " ");
            }           
            System.out.println();

        }
        sc.close();
}
}

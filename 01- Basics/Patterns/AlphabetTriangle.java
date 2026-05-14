import java.util.Scanner;
public class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        char print = 'A'; // is line ka mtlv hai hume kis line pe konsa character print karna hai, initially hume 'A' print karna hai
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(print + " ");
                print++; // is line ka mtlv hai hume next character print karna hai, isliye print ko increment kar diya
            }
            System.out.println();
    
        }
        sc.close();
    }

    
}
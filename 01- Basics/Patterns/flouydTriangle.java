import java.util.Scanner;
public class flouydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        int print = 1; // is line ka mtlv hai hume kis line pe konsa number print karna hai, initially hume 1 print karna hai
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(print + " ");
                print++; // is line ka mtlv hai hume next number print karna hai, isliye print ko increment kar diya
            }
            System.out.println();
        }
        sc.close();
    }
}
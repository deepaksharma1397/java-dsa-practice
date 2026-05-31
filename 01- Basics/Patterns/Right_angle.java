import java.util.Scanner;
public class Right_angle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a character: ");
            char c = sc.next().charAt(0);
            System.out.println("Enter the number of rows: ");
            int n = sc.nextInt();
            for(int i = 1; i <= n; i++){
                for(int j=1; j <= i; j++){
                    System.out.print(c);
                }
                System.out.println();
            }
            sc.close();
        }
}
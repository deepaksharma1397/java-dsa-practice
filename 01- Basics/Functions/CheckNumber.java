import java.util.Scanner;
public class CheckNumber {
    static String checkNumber(int n){
        if(n > 0){
            return "Positive";
        }
        else if(n < 0){
            return "Negative";
        }
        else{
            return "Zero";
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(checkNumber(n));
        sc.close();
    }
}
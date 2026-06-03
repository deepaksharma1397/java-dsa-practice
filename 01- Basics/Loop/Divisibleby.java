//  using while loop find all the numbers that is divisble by 2 and 23 between 0 and 95.

public class Divisibleby {
    public static void main(String []args){
        int i = 0;
        while(i <= 95){
            if (i % 2 == 0 && i % 23 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
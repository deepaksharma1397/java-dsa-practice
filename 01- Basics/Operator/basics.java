public class basics {
    public static void main(String[] args) {
       int a = 10;

        int ans = a++ + ++a;
        System.out.println(ans);

        int a2 = 10;


        int ans2 = a2++ + ++a2 + a2++ + ++a2;

        System.out.println(ans2);
        int a3 = 10;

        int ans3 = a3++ + a3++ + ++a3 + ++a3 + a3++ + a3++ + ++a3 + a3++;
        System.out.println(ans3);
        int a4 = 5;

        int ans4 = --a4 + a4++ + ++a4 + a4--;
        System.out.println(ans4);
        int a5 = 10;

            System.out.println(a5 > 5 && a5 < 20);
            System.out.println(10 < 5 || 10 < 20);



                    //bitwaise operator
        int x = 5; // 0101 in binary
        int y = 3; // 0011 in binary

        System.out.println(x & y); // 1 (0001 in binary)
        System.out.println(x | y); // 7 (0111 in binary)
        System.out.println(x ^ y); // 6 (0110 in binary)    
        // examples of bitwise operators
        int a6 = 5; // 0101 in binary
        int b6 = 3; // 0011 in binary
        System.out.println(a6 & b6); // 1 (0001 in binary)
        System.out.println(a6 | b6); // 7 (0111 in binary)
        System.out.println(a6 ^ b6); // 6 (0110 in binary)
        




    }
}

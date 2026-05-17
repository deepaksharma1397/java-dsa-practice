public class SearchCharacter {
    public static void main(String[] args) {
        String text = "java programming"; 
        char target = 'a'; // Is letter ko hume count karna hai
        int count = 0; // Letter kitni baar mila, uska record

        // Loop jo text ke pehle letter se lekar aakhri letter tak chalega
        for (int i = 0; i < text.length(); i++) {
            
            // Ek-ek karke har position (index) ka letter uthayein
            char currentLetter = text.charAt(i);

            // Agar current letter hamare target letter se match kar gaya
            if (currentLetter == target) {
                count++; // Counter ko 1 se badha do
            }
        }

        System.out.println("Text: " + text);
        System.out.println("Letter '" + target + "' isme " + count + " baar aaya hai.");
    }
}
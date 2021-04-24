import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        char letter;

        System.out.print("Input a lowercase alphabet >> ");
        letter = scr.next().charAt(0);
        
        while (letter >= 96) {
            for (int i = 0; i < letter - 96; i++) {
                System.out.print((char)(letter - i));
            }
            System.out.print("\n");
            letter--;
        }

        scr.close();
    }
}
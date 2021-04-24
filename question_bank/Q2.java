import java.util.Scanner;
public class Q2 {
    public static void main(String args[]) {
        Scanner scr = new Scanner(System.in);
        int input;
        System.out.print("Input 2-digit integer(10~99) "+">> ");
        input = scr.nextInt();
        if (input / 10 == input % 10)
            System.out.println("Yes! The digits of 10 and the digits of 1 are the same.");
        else
            System.out.println("No! The digits of 10 and the digits of 1 are different.");
        scr.close();
    }
}
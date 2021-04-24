import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a, b, c, temp;

        System.out.print("Input 3 Integers >> ");

        a = scr.nextInt();
        b = scr.nextInt();
        c = scr.nextInt();

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        
        if (a + b > c)
            System.out.println("Yes!");
        else
            System.out.println("No!");
        
        scr.close();
    }
}
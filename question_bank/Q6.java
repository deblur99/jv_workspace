import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Input (x, y) >> ");
        int a, b;
        a = scr.nextInt();
        b = scr.nextInt();
        if ((a >= 100 && a <= 200) && (b >= 100 && b <= 200))
            System.out.println("Point ("+a+", "+b+") is in the rectangle.");
        else
            System.out.println("Point ("+a+", "+b+") is not in the rectangle.");
        scr.close();
    }
}

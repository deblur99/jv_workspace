import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n;

        System.out.print("Input integer >> ");
        n = scr.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        scr.close();
    }
}

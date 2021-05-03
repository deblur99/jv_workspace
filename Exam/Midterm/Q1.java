import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String star = "*";
        String space = " ";
        System.out.print("Input integer >> ");
        int n = scr.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(space);
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(star);
            }
            System.out.println("");
        }

        scr.close();
    }
}

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n;
        System.out.print("Input integer(1~99) >> ");
        n = scr.nextInt();
        if (n % 10 == 3 || n % 10 == 6 || n % 10 == 9) {
            if (n / 10 == 3 || n / 10 == 6 || n / 10 == 9)
                System.out.println("Clap, Clap");
            else
                System.out.println("Clap");
        }
        scr.close();
    }
}

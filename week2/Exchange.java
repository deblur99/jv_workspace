import java.util.Scanner;
public class Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int won;
        float dollar;

        System.out.print("Input KRW : ");
        won = scanner.nextInt();
        dollar = won / 1100;

        System.out.println(won+" KRW is "+dollar+" USD.");
        scanner.close();
    }
}

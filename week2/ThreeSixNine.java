import java.util.Scanner;
public class ThreeSixNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int getNum;

        System.out.print("Input integer(1~99) : ");
        getNum = scanner.nextInt();

        if ((getNum % 10 == 3 || getNum % 10 == 6 || getNum % 10 == 9) &&
            (getNum / 10 == 3 || getNum / 10 == 6 || getNum / 10 == 9)) {
            System.out.print("Clap, Clap");
        }
        else if (getNum % 10 == 3 || getNum % 10 == 6 || getNum % 10 == 9 ||
                (getNum / 10 == 3 || getNum / 10 == 6 || getNum / 10 == 9)) {
            System.out.print("Clap");
        }

        scanner.close();
    }
}

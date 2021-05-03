import java.util.Scanner;
public class CalcApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 2 operands & operator >>> ");
        int a = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int b = scanner.nextInt();
        int result = 0;

        switch (operator) {
            case '+':
                Add add = new Add();
                add.setValue(a, b);
                System.out.println(add.calculate());
                break;
            case '-':
                Sub sub = new Sub();
                sub.setValue(a, b);
                System.out.println(sub.calculate());
                break;
            case '*':
                Mul mul = new Mul();
                mul.setValue(a, b);
                System.out.println(mul.calculate());
                break;
            case '/':
                Div div = new Div();
                div.setValue(a, b);
                System.out.println(div.calculate());
                break;
        }

        scanner.close();
    }
}
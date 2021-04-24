import java.util.Scanner;
public class Q10 {
   public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double a, b, result; char operator; int err = 0;
        a = b = result = 0.0;

        System.out.print("Enter >> ");
        a = scr.nextDouble();
        
        // char형 받을 때는 next 메서드로 문자열을 받고,
        // charAt 메서드에서 0번째 문자를 가져와야 한다.
        operator = scr.next().charAt(0);
        b = scr.nextDouble();

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    err = 1;
                    break;
                }
                result = a / b;
                break;
        }
        if (err == 1)
            System.out.println("Divide by 0 error");
        else
            System.out.println(a+" "+operator+" "+b+" = "+result);
        scr.close();
    } 
}

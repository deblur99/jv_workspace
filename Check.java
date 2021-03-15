import java.util.Scanner;
public class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int getNum;
        
        System.out.print("Input integer(10~99) : ");
        getNum = scanner.nextInt();
        
        if ((getNum / 10) == (getNum % 10)) {
            System.out.println("Yes! "+getNum / 10+" & "+getNum % 10+" are same.");
        } else {
            System.out.println("No! "+getNum / 10+" & "+getNum % 10+" are not same.");
        }
    
        scanner.close();
    }
}

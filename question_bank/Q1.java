import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        float input, result;
        Scanner scr = new Scanner(System.in);
        System.out.print("Input KRW >> ");
        input = scr.nextFloat();
        result = input / 1100;
        System.out.println(input+" KRW is "+result+" USD");
        scr.close();
    }
}
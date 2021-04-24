import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        float x1, y1, r1, x2, y2, r2;

        System.out.print("Input center and radius of 1st circle >> ");
        x1 = scr.nextFloat();
        y1 = scr.nextFloat();
        r1 = scr.nextFloat();

        System.out.print("Input center and radius of 2nd circle >> ");
        x2 = scr.nextFloat();
        y2 = scr.nextFloat();
        r2 = scr.nextFloat();

        // 두 원의 반지름의 합이 두 원의 중심 사이의 거리보다 크거나 같은 경우,
        // 두 원은 서로 겹친다.
        if (r1 + r2 >= Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)))
            System.out.println("Two circles are overlapped");
        else
            System.out.println("Two circles are not overlapped");
        
        scr.close();
    }
}
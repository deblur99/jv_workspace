import java.util.Scanner;
public class CircleManager {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Circle carr[] = new Circle[3]; // 배열 객체 생성

        for (int i = 0; i < carr.length; i++) {
            System.out.print("x, y, radius >> ");
            double x = scr.nextDouble();
            double y = scr.nextDouble();
            int radius = scr.nextInt();
            carr[i] = new Circle(x, y, radius);  // 배열 내 객체에 값을 넣어주며 생성
        }

        for (int i = 0; i < carr.length; i++)
            carr[i].show();
        
        scr.close();
    }
}
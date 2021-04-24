import java.util.Scanner;
import org.graalvm.compiler.core.common.type.ArithmeticOpTable.UnaryOp.Sqrt;
public class Q7 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        float xCenter, yCenter, x, y, r;
        System.out.print("Input center point & radius >> ");
        xCenter = scr.nextFloat();
        yCenter = scr.nextFloat();
        r = scr.nextFloat();

        System.out.print("Input point >> ");
        x = scr.nextFloat();
        y = scr.nextFloat();

        // 두 점 사이의 거리가 반지름보다 작거나 같으면 원의 내부에 있는 것으로 판단
        if (Math.sqrt((x - xCenter)*(x - xCenter) + (y - yCenter)*(y - yCenter)) <= r)
            System.out.println("Point ("+x+", "+y+") is in the circle");
        
        scr.close();
    }
}

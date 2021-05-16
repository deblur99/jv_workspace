import java.util.Scanner;
import java.util.Vector;
public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        int num = 0, largest = 0;

        System.out.print("Enter integer(-1 to quit)>> ");

        while (num != -1) {
            num = s.nextInt();
            v.add(num);
        }

        largest = v.get(0).intValue();

        for (int i = 0; i < v.size(); i++) {
            if (largest < v.get(i).intValue()) {
                largest = v.get(i).intValue();
            }
        }

        System.out.println("Maximum number is "+largest);

        s.close();
    }
}

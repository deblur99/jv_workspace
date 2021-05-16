import java.util.Scanner;
import java.util.Vector;
public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        int input = -1, sum = 0, avg = 0;

        while (input != 0) {
            System.out.print("Enter amount of rainfall (0 to quit)>> ");

            input = s.nextInt();

            if (input == 0)
                break;

            v.add(input);
            sum += input;
            avg = sum / v.size();

            for (int i = 0; i < v.size(); i++) {
                System.out.print(v.get(i).intValue()+" ");
            }
            
            System.out.println("\nCurrent Average : "+avg);
        }
        
        s.close();
    }
}

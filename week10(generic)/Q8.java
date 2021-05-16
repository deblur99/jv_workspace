import java.util.Scanner;
import java.util.Vector;
import java.util.HashMap;
import java.util.Iterator;
public class Q8 {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<String, Double>();
        Scanner s = new Scanner(System.in);
        String name; String receiver;
        double grade = 0.0; double limit = 0.0;
        
        System.out.println("DK Scholarship management system.");

        for (int i = 0; i < 5; i++) {
            System.out.print("Name & grade >> ");
            name = s.next();
            grade = s.nextDouble();

            map.put(name, grade);
        }
        
        System.out.print("Input grade limitation >> ");
        limit = s.nextDouble();

        Iterator<String> it = map.keySet().iterator();
        Vector<String> v = new Vector<String>();

        while (it.hasNext()) {
            receiver = it.next();
            if (map.get(receiver) >= 3.5)
                v.add(receiver.toString());
        }

        System.out.print("Scholarship students : ");

        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i)+" ");
        }

        s.close();
    }    
}
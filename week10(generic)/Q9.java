import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
public class Q9 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Scanner s = new Scanner(System.in);
        String input = ""; String name;
        int point = 0; boolean isFound = false;
   
        System.out.println("** REWARD Management System **");

        while (!input.equals("exit")) {
            isFound = false;

            System.out.print("Enter name & reward point >> ");

            input = s.next();

            if (input.equals("exit"))
                break;
                
            point = s.nextInt();
            
            
            Iterator<String> it = map.keySet().iterator();

            while (it.hasNext()) {
                name = it.next().toString();
                if (input.equals(name)) {
                    map.replace(name, (map.get(name) + point));
                    isFound = true;
                    break;
                }
            }
            
            if (!isFound) {
                map.put(input, point);
            }

            it = map.keySet().iterator();

            while (it.hasNext()) {
                name = it.next().toString();
                System.out.print("("+name+","+map.get(name)+") ");
            }

            System.out.println("");
            s.close();
        }
    }
}

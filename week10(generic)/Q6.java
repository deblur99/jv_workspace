import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
public class Q6 {
    static HashMap<String, Student> map = new HashMap<String, Student>();

    private static void read() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter students name, major, id and average of grade.");

        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String text = s.nextLine();
            StringTokenizer st = new StringTokenizer(text, ",");
            String name = st.nextToken().trim();
            String department = st.nextToken().trim();
            String id = st.nextToken().trim();
            double grade = Double.parseDouble(st.nextToken().trim());
            
            Student student = new Student(name, department, id, grade);
            map.put(name, student);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String search = "";

        read();
        
        Iterator<String> keys = map.keySet().iterator();

        while (keys.hasNext()) {
            String key = keys.next();
            map.get(key).printAll();
        }

        while (!search.equals("exit")) {
            System.out.print("Student name >> ");
            search = s.next();

            if (search.equals("exit")) {
                break;
            }

            keys = map.keySet().iterator();

            while (keys.hasNext()) {
                String key = keys.next();
                if (search.equals(map.get(key).myName))
                    map.get(key).processQuery(search);
            }    
        }

        s.close();
    }
}

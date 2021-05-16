import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Q5 {
    static ArrayList<Student> arr = new ArrayList<Student>();

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
            arr.add(student);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String search = "";

        read();

        for (int i = 0; i < 4; i++) {
            arr.get(i).printAll();
        }

        while (!search.equals("exit")) {
            System.out.print("Student name >> ");
            search = s.next();

            if (search.equals("exit")) {
                break;
            }

            for (int i = 0; i < 4; i++) {
                if (search.equals(arr.get(i).myName))
                    arr.get(i).processQuery(search);
            }            
        }

        s.close();
    }
}

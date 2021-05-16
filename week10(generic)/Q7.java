import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Iterator;
public class Q7 {
    static HashMap<String, Location> map = new HashMap<String, Location>();

    public static void read() {
        Scanner s = new Scanner(System.in);
        String input = "";
        String cityName; double latitude; double longitude;

        System.out.println("Enter City name, latitude, longitude");

        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            input = s.nextLine();
            StringTokenizer st = new StringTokenizer(input, ",");
            
            cityName = st.nextToken().trim();
            latitude = Double.parseDouble(st.nextToken().trim());
            longitude = Double.parseDouble(st.nextToken().trim());

            Location loc = new Location(cityName, latitude, longitude);

            map.put(cityName, loc);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = "";
        boolean isFound = false;

        read();

        Iterator<String> it = map.keySet().iterator();

        for (int i = 0; i < 27; i++)
            System.out.print("-");
        
        System.out.println();

        while (it.hasNext()) {
            map.get(it.next()).printAll();
        }

        for (int i = 0; i < 27; i++)
            System.out.print("-");

        System.out.println();

        input = "";

        while (!input.equals("exit")) {
            isFound = false;

            it = map.keySet().iterator();

            System.out.print("City name >> ");
            input = s.next();

            if (input.equals("exit"))
                break;

            while (it.hasNext()) {
                isFound = map.get(it.next()).processQuery(input);

                if (isFound)
                    break;
            }

            if (!isFound)
                System.out.println("Location of "+input+" is unknown.");
        }

        s.close();
    }
}
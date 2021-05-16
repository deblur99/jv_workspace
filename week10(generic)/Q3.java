import java.util.Scanner;
import java.util.HashMap;
public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String country = ""; int pop = 0;
        
        System.out.println("Enter nation & population (Ex: Korea 5000)");

        while (!country.equals("stop")) {
            System.out.print("Nation & population >> ");
            country = s.next();
            
            if (country.equals("stop"))
                break;
            
            pop = s.nextInt();
            map.put(country, pop);
        }

        while (!country.equals("exit")) {
            System.out.print("Search population of ");
            country = s.next();

            if (country.equals("exit"))
                break;

            if (map.get(country) != null) {
                pop = map.get(country);
                System.out.println("Population of "+country+" is "+pop);
            }

            else {
                System.out.println("Cannot find"+country);
            }
        }

        s.close();
    }
}
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Character> arr = new ArrayList<Character>();
        HashMap<Character, Double> map = new HashMap<Character, Double>();
        char input = 0; double avg = 0.0; boolean isCorrect = true;
        String gradeArr = "ABCDF";

        // make a grade chart
        for (int i = 0; i < gradeArr.length(); i++) {
            map.put(gradeArr.charAt(i), 4.0 - i);
        }
        
        System.out.print("Enter grades of 6 students (A/B/C/D/F)>> ");

        for (int i = 0; i < 6; i++) {
            input = s.next().charAt(0);
            
            // check whether the input is correct or not
            for (int j = 0; j < gradeArr.length(); j++) {
                if (gradeArr.charAt(j) == input) {
                    avg += map.get(input);
                    break;
                }
                if (j == 4) {
                    System.out.println("Invalid");
                    isCorrect = false;
                }
            }
        }

        // print the result
        if (isCorrect) {
            System.out.println("Average : "+avg / 6);
        }

        s.close();
    }
}

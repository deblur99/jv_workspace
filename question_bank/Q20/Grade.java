import java.util.Scanner;
public class Grade {
    public int math;
    public int science;
    public int english;
    public int average;

    public Grade(int myMath, int myScience, int myEnglish) {
        math = myMath;
        science = myScience;
        english = myEnglish;
    }

    public int getAverage() {
        average = (math + science + english) / 3;
        return average;
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int math, science, english;
        
        math = scr.nextInt();
        science = scr.nextInt();
        english = scr.nextInt();

        Grade me = new Grade(math, science, english);
        
        System.out.println("Average : "+me.getAverage());
        scr.close();
    }
}
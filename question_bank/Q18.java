import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String course[] = {"Java", "C++", "HTML","Kotlin","Python"};
        int score[] = {95, 88, 76, 62, 55}, isQuit = 0;
        String input;

        while (isQuit != 1) {
            System.out.print("Subject >> ");
            input = scr.next();

            // 문자열 비교는 equals() 메서드를 사용해야 한다.
            if (input.equals("Quit")) {
                isQuit = 1;
                break;
            }
            
            for (int i = 0; i < course.length; i++) {
                if (input.equals(course[i])) {
                    System.out.println("Score is "+score[i]);
                    break;
                }

                else if (i == course.length - 1) {
                    System.out.println("Invalid subject");
                }
            }
        }
    }
}
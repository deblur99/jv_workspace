import java.util.Scanner;
public class MonthSchedule {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Day todoList[] = new Day[30];
        int select, date, isQuit = 0;
        String todo;

        for (int i = 0; i < todoList.length; i++)
            todoList[i] = new Day();

        System.out.print("Monthly schedule management system");

        while (isQuit != 1) {
            System.out.print("\nTodo (Input:1, Show:2, Quit:3) >> ");

            select = scr.nextInt();
    
            switch (select) {
                case 1:
                    System.out.print("Date(1~30) : ");
                    date = scr.nextInt();
    
                    System.out.print("Todo(Enter string without space) ? ");
                    todo = scr.next();

                    // 실제 인덱스는 0~29까지 있으므로 처리할 때는 입력값보다 1 작은 값으로 넣어야 한다.
                    todoList[--date].set(todo);
                    break;
                
                case 2:
                    System.out.print("Date(1~30) : ");
                    date = scr.nextInt();

                    // 실제 인덱스는 0~29까지 있으므로 처리할 때는 입력값보다 1 작은 값으로 넣어야 한다.
                    System.out.println(todoList[--date].get());
                    break;
                
                case 3:
                    System.out.println("Quit program.");
                    isQuit = 1;
                    break;
            }
        }

        scr.close();
    }
}
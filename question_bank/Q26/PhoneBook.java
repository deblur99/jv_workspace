import java.util.Scanner;
public class PhoneBook {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numPerson;
        String name, phoneNum;
        String seekName;

        System.out.print("Number of persons : ");
        numPerson = scr.nextInt();

        // 객체 배열 생성
        Phone book[] = new Phone[numPerson];

        for (int i = 0; i < numPerson; i++) {
            System.out.print("Input name & phone number >> ");
            name = scr.next();
            phoneNum = scr.next();

            book[i] = new Phone(name, phoneNum);
        }

        System.out.println("Saved...");

        while (true) {
            System.out.print("Search >> ");
            seekName = scr.next();

            // remark: 문자열 비교는 .equals() 메서드로 비교한다!
            if (seekName.equals("quit"))
                break;

            for (int i = 0; i < book.length; i++) {
                // 배열 요소를 탐색하면서 찾고자 하는 이름을 찾으면 출력
                if (book[i].getName().equals(seekName)) {
                    System.out.println(seekName+" / "+book[i].getNumber());
                    break;
                }

                // 마지막 요소에서 요소를 찾았다면 위의 break에 의해 이 조건문을 통과하지 않음
                // 따라서, 마지막 인덱스에서 이 조건문에 도달하면, 찾고자 하는 이름을 찾지 못한 것을 의미
                if (i == book.length - 1)
                    System.out.println("Not found");
            }
        }

        scr.close();
    }
}
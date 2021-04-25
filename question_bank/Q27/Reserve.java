import java.util.Scanner;
public class Reserve {
    private String name;
    private int seatNumber;
    
    public Reserve(String name, int seatNumber) {
        this.name = name;
        this.seatNumber = seatNumber;
    }

    public void updateReserve(String name) {
        this.name = name;
    }

    public String getReserveName() {
        return name;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int isQuit = 0, decision;
        char seatType = 'C'; String myName; int mySeatNumber = -1;

        // 비어있는 좌석 생성
        Reserve seatInfo[][] = new Reserve[3][10];

        for (int i = 0; i < seatInfo.length; i++) {
            for (int j = 0; j < seatInfo[0].length; j++) {
                seatInfo[i][j] = new Reserve("-"+Integer.toString(j + 1)+"-", j + 1);
            }
        }

        System.out.println("DK Concert hall reservation system");

        while (isQuit != 1) {
            System.out.println("1 : Reservation");
            System.out.println("2 : Status");
            System.out.println("3 : Cancel");
            System.out.println("4 : Quit");

            System.out.print(">>> ");
            decision = scr.nextInt();
            
            switch (decision) {
                // 예매 항목
                case 1:
                    System.out.print("Class S(1), A(2), B(3) >> ");
                    decision = scr.nextInt();

                    // 좌석 유형 선택
                    switch (decision) {
                        case 1:
                            seatType = 'S';

                            System.out.print("Class S >> ");

                            for (int i = 0; i < seatInfo[0].length; i++)
                                System.out.print(seatInfo[0][i].getReserveName()+" ");
                            
                            System.out.println("");

                            break;
                        
                        case 2:
                            seatType = 'A';
                        
                            System.out.print("Class A >> ");

                            for (int i = 0; i < seatInfo[1].length; i++)
                                System.out.print(seatInfo[1][i].getReserveName()+" ");

                            System.out.println("");

                            break;

                        case 3:
                            seatType = 'B';

                            System.out.print("Class B >> ");

                            for (int i = 0; i < seatInfo[2].length; i++)
                                System.out.print(seatInfo[2][i].getReserveName()+" ");

                            System.out.println("");

                            break;
                    }

                    // 이름 입력
                    System.out.print("Name >> ");
                    myName = scr.next();

                    // 좌석번호 입력
                    System.out.print("Sheet number >> ");
                    mySeatNumber = scr.nextInt();

                    // 좌석 정보 업데이트
                    seatInfo[decision - 1][mySeatNumber - 1].updateReserve(myName);
                    
                    // 예매 결과 출력
                    System.out.println(seatType+" class sheet #"+mySeatNumber+" reserved for "+myName+"\n");

                    // switch문 탈출
                    break;
                
                // 예매 좌석 상태 출력 항목
                case 2:
                    System.out.println("");

                    for (int i = 0; i < seatInfo.length; i++) {
                        switch (i) {
                            case 0:
                                System.out.print("Class S >> ");
                                break;
                            case 1: 
                                System.out.print("Class A >> ");
                                break;
                            case 2:
                                System.out.print("Class B >> ");
                                break;
                        }

                        for (int j = 0; j < seatInfo[0].length; j++) {
                            System.out.print(seatInfo[i][j].getReserveName()+" ");
                        }

                        System.out.println("");
                    }

                    System.out.println("");

                    break;
                
                // 예매 취소 항목
                case 3:
                    System.out.print("Class S(1), A(2), B(3) >> ");
                    decision = scr.nextInt();

                    // 좌석 유형 선택
                    switch (decision) {
                        case 1:
                            seatType = 'S';

                            System.out.print("Class S >> ");

                            for (int i = 0; i < seatInfo[0].length; i++)
                                System.out.print(seatInfo[0][i].getReserveName()+" ");
                            
                            System.out.println("");

                            break;
                        
                        case 2:
                            seatType = 'A';
                        
                            System.out.print("Class A >> ");

                            for (int i = 0; i < seatInfo[1].length; i++)
                                System.out.print(seatInfo[1][i].getReserveName()+" ");

                            System.out.println("");

                            break;

                        case 3:
                            seatType = 'B';

                            System.out.print("Class B >> ");

                            for (int i = 0; i < seatInfo[2].length; i++)
                                System.out.print(seatInfo[2][i].getReserveName()+" ");

                            System.out.println("");

                            break;
                    }                    
                    
                    System.out.print("Name >> ");
                    myName = scr.next();

                    // 명단에서 이름과 대조 후 목록에서 제거
                    for (int i = 0; i < seatInfo[decision - 1].length; i++) {
                        if (seatInfo[decision - 1][i].getReserveName().equals(myName)) {
                            // 번호 자리에 있던 이름을 기존 번호로 교체
                            seatInfo[decision - 1][i].updateReserve("-"+Integer.toString(i + 1)+"-");
                            // 취소 결과 출력
                            System.out.println("Reservation for "+myName+", Class "+seatType+" #"+seatInfo[decision - 1][i].getSeatNumber()+" cancelled.\n");
                            break;
                        }
                        if (i == seatInfo[decision - 1].length - 1)
                            System.out.println("Failed to cancel\n");
                    }

                    break;
                
                // 프로그램 종료
                case 4:
                    isQuit = 1;
                    break;
            }
        }

        scr.close();
    }
}
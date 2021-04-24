import java.util.Random;
public class Q17 {
    public static void main(String[] args) {
        Random r = new Random();
        int arr[][] = new int[4][4];
        int position_row, position_col, count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = 0; // 0으로 초기화
            }
        }

        while (count < 10) {
            // 행, 열 좌표 추첨
            position_row = r.nextInt(4);
            position_col = r.nextInt(4);

            // 이미 값이 할당된 요소면 다시 행, 열 좌표 추첨
            if (arr[position_row][position_col] != 0)
                continue;

            // 해당 좌표의 값이 0이 아닐 때까지 추첨
            while (arr[position_row][position_col] == 0) {
                arr[position_row][position_col] = r.nextInt(11);                    
                if (arr[position_row][position_col] == 0) {
                    continue;
                }
            }

            // 값이 올바르게 입력되면 count 증가
            count++;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
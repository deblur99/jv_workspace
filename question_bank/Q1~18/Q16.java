import java.util.Random;
public class Q16 {
    public static void main(String[] args) {
        Random r = new Random();

        int arr[][] = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = r.nextInt(11);
                // 0이 나오는 경우 j를 하나 감소시키고 다시 돌림
                if (arr[i][j] == 0)
                    j--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
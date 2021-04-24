import java.util.Scanner;
import java.util.Random;
public class Q15 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Random r = new Random();
        int scale, count = 0;
        
        System.out.print("Number of elements : ");
        scale = scr.nextInt();

        int arr[] = new int[scale];

        for (int i = 0; i < scale; i++) {
            arr[i] = r.nextInt(100);
            // 현재 인덱스에서 무작위로 뽑은 값과 이전 요소들을 비교하여
            // 같은 요소가 하나라도 있으면 i를 하나 낮추고 다시 뽑음
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < scale; i++) {
            System.out.print(arr[i]+" ");
            count++;
            if (count == 10) {
                count = 0;
                System.out.println("");
            }
        }

        scr.close();
    }
}
/*
sol)
1. 가장 작은 요소와 가장 큰 요소를 찾는다
2. 나머지 요소를 출력한다
*/
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int arr[] = new int[3], max, min, result;
        System.out.print("Input 3 integers >> ");
        // 값 받기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scr.nextInt();
        }

        result = max = min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max && arr[i] != min)
                result = arr[i];
        }

        System.out.println("Middle number is "+result);
        scr.close();
    }                   
}


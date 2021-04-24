import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int arr[] = new int[10];
        int result[] = new int[10];
        int j = 0;

        System.out.print("Input 10 positive integers >> ");

        for (int i = 0; i < 10; i++) {
            arr[i] = scr.nextInt();
            if (arr[i] % 3 == 0) {
                result[j] = arr[i];
                j++;
            }
        }

        System.out.print("Multiples of 3 : ");

        for (int i = 0; i < j; i++)
            System.out.print(result[i]+" ");
        
        scr.close();
    }
}
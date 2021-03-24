import java.util.Scanner;
public class num2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int count = 0, input, average = 0, arr[];
        arr = new int[5];

        System.out.println("Enter integer value(>0)");

        while (count < 5) {
            input = scr.nextInt();
            if (input > 0) {
                arr[count] = input;
                average += input;
                count++;
            } else {
                System.out.println(input+" is invalid");
            }
        }

        average /= arr.length;
       
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println("--> Average is "+average);

        scr.close();
    }
}

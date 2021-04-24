import java.util.Scanner;

import jdk.internal.jshell.tool.resources.l10n;
public class num1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int count = 0, input, max;
        int arr[] = new int[5];

        System.out.println("Enter integer value(>0)");

        while (count < 5) {
            input = scr.nextInt();
            if (input <= 0) {
                System.out.println(input+" is invalid");
            }
            else {
                arr[count] = input;
                count++;
            }
        }
        
        max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
        System.out.println("--> Maximum value is "+max);

        scr.close();
    }
}

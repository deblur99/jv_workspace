import java.util.Random;
public class Q14 {
    public static void main(String[] args) {
        Random r = new Random();
        int arr[] = new int[10], avg = 0;

        for (int i = 0; i < arr.length; i++)
            arr[i] = r.nextInt(10);

        System.out.print("Random numbers : ");

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
        
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }

        avg /= arr.length;

        System.out.println("\nAverage : "+avg);
    }
}
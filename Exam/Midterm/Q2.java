public class Q2 {
    public static void main(String[] args) {
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10 + 1);
            while (arr[i] == 0) {
                arr[i] = (int)(Math.random() * 10 + 1);
            }
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }

        System.out.print("Random numbers : ");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i + 1) == arr[j]) {
                    System.out.println((i + 1)+" is exist at a["+j+"]");
                    break;
                }
            }
        }
    }
}

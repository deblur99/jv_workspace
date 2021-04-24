public class num3 {
    public static void main(String[] args) {
        // l-value는 크기 적지 말고 r-value는 행 크기만 적을 것
        int arr[][] = new int[4][];
 
        for (int i = 0; i < arr.length; i++) {

            if (i == 0 || i == 2)
                arr[i] = new int[3];

            else 
                arr[i] = new int[2];

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (i + 1) * 10 + j;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

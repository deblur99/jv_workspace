public class num4 {
    public static void main(String[] args) {
        int arr[][] = new int[9][8];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i + 1)*(j + 2) < 10)
                    System.out.print((j + 2)+"*"+(i + 1)+"="+(j + 2)*(i + 1)+"   ");
                
                else
                    System.out.print((j + 2)+"*"+(i + 1)+"="+(j + 2)*(i + 1)+"  ");
            }

            System.out.println("");
        }
    }
}
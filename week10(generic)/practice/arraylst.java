import java.util.ArrayList;
public class arraylst {
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<Integer>();
        
        for (int i = 0; i < 5; i++) {
            arr.add(10+i);
        }

        //arr.add(5, 50);
        System.out.println(arr.size());

        for (int i = 0; i < 5; i++) {
            System.out.print(arr.get(i)+" ");
        }
    }
}

import java.util.Vector;
import java.util.Iterator;
public class vector {
    public static void main(String[] args) {
        Vector<Integer> arr = new Vector<Integer>();
        
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        
        Iterator<Integer> it = arr.iterator();
        
        while (it.hasNext()) {
            int n = it.next();
            System.out.print(n+" ");
        }            
    }    
}
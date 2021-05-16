import java.util.LinkedList;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<Integer>();

        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);

        for (int i = 0; i < lst.size(); i++) {
            System.out.print(lst.get(i).intValue()+" ");
        }
    }
}

import java.util.HashMap;
public class hash {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("김치", "한국");

        String whereIsFrom = map.get("김치");
        
        System.out.println(whereIsFrom);
    }
}
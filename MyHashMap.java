
import java.util.HashMap;


/**
 *
 * @author user
 */
public class MyHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("張山", 36);
        hm.put("李四", 22);
        hm.put("王五", 12);
        for (String e : hm.keySet()) {
            System.out.printf("(%s, %d)\n", e, hm.get(e));
        }
    }
}

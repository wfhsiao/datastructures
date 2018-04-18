
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;


/**
 *
 * @author user
 */
public class MyHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("81", 36);
        hm.put("72", 22);
        hm.put("63", 12);
        String [] keys = hm.keySet().toArray(new String[0]);
        Arrays.sort(keys, Collections.reverseOrder());
        for (String e : keys) {
            System.out.printf("(%s, %d)\n", e, hm.get(e));
        }
    }
}

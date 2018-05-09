
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MyHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        process(hm);
        print(hm);
    }

    private static void print(HashMap<String, Integer> hm) {
        String [] chars = hm.keySet().toArray(new String[0]);
        Arrays.sort(chars);
        System.out.println("依字元排序:");
        for (String e : chars) {
            System.out.printf("%s=>%d\n", e, hm.get(e));
        }
        System.out.println("依次數排序:");
        Map<String, Integer> newhm = MapUtil.sortByValue(hm);
        for (String e : newhm.keySet()) {
            System.out.printf("%s=>%d\n", e, hm.get(e));
        }
    }

    private static void process(HashMap<String, Integer> hm) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Please input a word (byebye to exit): ");
            String line = scan.nextLine();
            if (line.equals("byebye")) break;
            String c = line.substring(line.length()-1);
            if (hm.containsKey(c)) {
                int cnt = hm.get(c);
                hm.put(c, cnt+1);
            } else
                hm.put(c, 1);
        }
    }
}

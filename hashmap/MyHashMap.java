
import java.util.HashMap;
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
        for (String e : hm.keySet()) {
            System.out.printf("%s=>%d\n", e, hm.get(e));
        }
    }

    private static void process(HashMap<String, Integer> hm) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Please input a word (byebye to exit): ");
            String line = scan.nextLine();
            if (line.equals("byebye")) break;
            if (hm.containsKey(line)) {
                int cnt = hm.get(line);
                hm.put(line, cnt+1);
            } else
                hm.put(line, 1);
        }
    }
}


import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class NameCountByHashMap {
    public static void main(String[] args) {
        try {
            File f = new File("20160330students.txt");
            Scanner s = new Scanner(f);
            HashMap<String, Integer> hm= new HashMap<>(); 
            HashMap<Integer, Integer> hm2 = new HashMap<>(); 
            s.nextLine(); // 跳過標題行
            while (s.hasNextLine()) {
                String line = s.nextLine();
                String tmps[] = line.split("\\t");
                //hm.put(new Student(tmps[0], tmps[1], Integer.valueOf(tmps[2])));
                String name = tmps[1];
                process(hm, name);
                Integer age = Integer.valueOf(tmps[2]);
                process(hm2, age);                
            }
            print(hm);
            print2(hm2);
        } catch (Exception ex) {
            System.out.printf("檔案開啟失敗: %s\n", ex.getMessage());
        }
        

    }

    private static void process(HashMap<String, Integer> hm, String name) {
        String lastname = name.substring(0, 1);
        if (hm.containsKey(lastname)) {
            int cnt = hm.get(lastname);
            hm.put(lastname, cnt+1);
        } else {
            hm.put(lastname, 1);
        }
    }

    private static void print(HashMap<String, Integer> hm) {
        String[] names = hm.keySet().toArray(new String[0]);
        Arrays.sort(names);
        for (String e : names) {
            System.out.printf("%s==>%d\n", e, hm.get(e));
        }
    }

    private static void process(HashMap<Integer, Integer> hm2, Integer age) {
        if (hm2.containsKey(age)) {
            int cnt = hm2.get(age);
            hm2.put(age, cnt+1);
        } else
            hm2.put(age, 1);
    }

    private static void print2(HashMap<Integer, Integer> hm2) {
        Integer[] ages = hm2.keySet().toArray(new Integer[0]);
        Arrays.sort(ages, Collections.reverseOrder());
        for (Integer e : ages) {
            System.out.printf("%d==>%d\n", e, hm2.get(e));
        }
    }
}

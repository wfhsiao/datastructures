
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MyReadFileviaArrayList {
    public static void main(String[] args) {
        try {
//            int[] scores = new int [46];
            ArrayList<Integer> scores = new ArrayList<>();
//            int i = 0;
            Scanner scan = new Scanner(new File("score.txt"));
            while (scan.hasNextInt()) {
                scores.add(scan.nextInt());
//                i++;
            }
            System.out.println(scores);
            Collections.sort(scores);
            System.out.println(scores);
//        System.out.print("請輸入一行字串: ");
//        String line = scan.nextLine();
//        System.out.printf("你輸入的是: %s\n", line);
//        String[] words=line.split(" ");
//        System.out.println(Arrays.toString(words));
        } catch (FileNotFoundException ex) {
            System.err.printf("File reading error: %s\n", ex.getMessage());
        }
    }
}

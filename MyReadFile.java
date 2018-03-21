
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MyReadFile {
    public static void main(String[] args) {
        try {
            int[] scores = new int [46];
            int i = 0;
            Scanner scan = new Scanner(new File("score.txt"));
            while (scan.hasNextInt()) {
                scores[i] = scan.nextInt();
                i++;
            }
            scan.close();
            System.out.println(Arrays.toString(scores));
            Arrays.sort(scores);
            System.out.println(Arrays.toString(scores));
            scan = new Scanner(System.in);
            System.out.print("請輸入欲搜尋的數值: ");
            int n = scan.nextInt();
            int index = Arrays.binarySearch(scores, n);
//            reverse(scores);
            if (index < 0)
                System.out.printf("找不到%d!!\n", n);
            else
                System.out.printf("%d在位置%d.\n", n, index);
//        System.out.print("請輸入一行字串: ");
//        String line = scan.nextLine();
//        System.out.printf("你輸入的是: %s\n", line);
//        String[] words=line.split(" ");
//        System.out.println(Arrays.toString(words));
        } catch (FileNotFoundException ex) {
            System.err.printf("File reading error: %s\n", ex.getMessage());
        }
    }

    private static void reverse(int[] scores) {
        for (int i = 0; i < scores.length/2; i++) {
            int tmp = scores[i];
            scores[i] = scores[scores.length-1-i];
            scores[scores.length-1-i] = tmp;
        }
    }
}
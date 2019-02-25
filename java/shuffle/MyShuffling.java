
import java.util.Random;

/**
 *
 * @author user
 */
public class MyShuffling {
    public static void main(String[] args) {
        int a[] = new int [52];
        init(a);
        print(a);
//        shuffle1(a);
//        print(a);
        shuffle3(a);
        print(a);
        check(a);
    }

    private static void init(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = i;            
        }
    }

    private static void print(int[] a) {
        String shape[] = {"s", "h", "d", "c"}; // spade
        String points[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
        for (int i = 0; i < a.length; i++) {
//            System.out.printf("%2d ", a[i]);
            int s = a[i] / 13;
            int p = a[i] % 13;
            System.out.printf("%s%s ", points[p], shape[s]);
            if (i % 13 == 12) System.out.println();
        }
    }

    private static void shuffle1(int[] a) {
        Random r = new Random();
        for (int i = a.length-1; i >=1 ; i--) {
            int x = r.nextInt(i);
            swap(a, i, x);
        }
    }

    private static void shuffle2(int[] a) {
        Random r = new Random();
        for (int i = a.length-1; i >=1 ; i--) {
            int x = r.nextInt(i+1);
            swap(a, i, x);
        }
    }
    
    private static void swap(int[] a, int i, int x) {
        int tmp = a[i];
        a[i] = a[x];
        a[x] = tmp;
    }

    private static void check(int[] a) {
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if ( a[i] == i) {
                System.out.println(i);
                cnt++;
            }            
        }
        System.out.printf("共%d張沒動到\n", cnt);
    }

    private static void shuffle3(int[] a) {
        Random r = new Random();
        for (int i = 1000; i >=1 ; i--) {
            int x = r.nextInt(a.length);
            int y = r.nextInt(a.length);
            swap(a, y, x);
        }
    }
}

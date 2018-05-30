/**
 *
 * @author user
 */
public class MyShuffling {
    public static void main(String[] args) {
        int a[] = new int [52];
        init(a);
        print(a);
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
}

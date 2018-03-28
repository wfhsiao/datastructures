
import java.util.Arrays;

/**
 *
 * @author user
 */
public class MyPerm {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5, 6};
        int n = perm(a, 0, a.length-1);
        System.out.printf("總共有%d種排法.\n", n);
        String [] sa = {"a1", "b2", "c3", "d4"};
        int n2 = perm2(sa, 0, sa.length-1);
        System.out.printf("總共有%d種排法.\n", n2);
    }

    // k: index of the current position
    // m: index of the last position
    private static int perm(int[] a, int k, int m) {
        if (k == m) { // done
            System.out.println(Arrays.toString(a));
            return 1;
        } else {
            int s = 0;
            for (int i = k; i <=m; i++) {
                myswap(a, i, k);
                s += perm(a, k+1, m);
                myswap(a, i, k);
            }
            return s;
        }
    }

    private static void myswap(int[] a, int i, int k) {
        int tmp = a[i];
        a[i] = a[k];
        a[k] = tmp;
    }

    private static int perm2(String[] sa, int k, int m) {
        if (k == m) { // done
            print(sa);
            return 1;
        } else {
            int s = 0;
            for (int i = k; i <=m; i++) {
                myswap(sa, i, k);
                s += perm2(sa, k+1, m);
                myswap(sa, i, k);
            }
            return s;
        }
    }

    private static void myswap(String[] a, int i, int k) {
        String tmp = a[i];
        a[i] = a[k];
        a[k] = tmp;
    }

    private static void print(String[] sa) {
        System.out.println(Arrays.toString(sa));
//        for (String e : sa) {
//            System.out.print(e);
//        }
//        System.out.println();
    }
}


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
}

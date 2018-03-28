
import java.util.Arrays;

/**
 *
 * @author user
 */
public class MyPerm {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5, 6, 7};
        perm(a, 0, a.length-1);
    }

    // k: index of the current position
    // m: index of the last position
    private static void perm(int[] a, int k, int m) {
        if (k == m) { // done
            System.out.println(Arrays.toString(a));
        } else {
            for (int i = k; i <=m; i++) {
                myswap(a, i, k);
                perm(a, k+1, m);
                myswap(a, i, k);
            }
        }
    }

    private static void myswap(int[] a, int i, int k) {
        int tmp = a[i];
        a[i] = a[k];
        a[k] = tmp;
    }
}

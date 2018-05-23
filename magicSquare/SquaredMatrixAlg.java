
import java.util.Random;

/**
 *
 * @author user
 */
public class SquaredMatrixAlg {
    static int N = 5;
    public static void main(String[] args) {
        int [] a = new int [N*N];
//        init(a);
        print(a);
        solve(a);
        print(a);
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {            
            System.out.printf("%3d ", a[i]); 
            if (i % N ==N-1) System.out.println();
        }
        System.out.println("-----------------------------");
    }

    private static void solve(int[] a) {
        int r = 0, c =N/2;
        for (int i = 0; i < a.length; i++) {
            a[r*N+c]=2*i+1;
            int newr = ((r-1)+N) % N;  // suppose there are NxN cells
            int newc = ((c-1)+N) % N;
            if (a[newr*N+newc] != 0) {
               newr = (r+1) % N;
               newc = c;
            }
            r = newr;
            c = newc;            
        }
    }
}

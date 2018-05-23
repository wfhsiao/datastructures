
import java.util.Random;

/**
 *
 * @author user
 */
public class SquaredMatrix {
    static int N = 3;
    public static void main(String[] args) {
        
        int [] a = new int [N*N];
        init(a);
        print(a);
        solve(a);
        print(a);
    }

    private static void init(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 2*i+1;            
        }
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {            
            System.out.printf("%3d ", a[i]); 
            if (i % N ==N-1) System.out.println();
        }
        System.out.println("-----------------------------");
    }

    private static void solve(int[] a) {
        Random r = new Random();
        while (true) {
//            print(a);
            if (rowChecked(a) && colChecked(a) && crossChecked(a)) break;
            int x = r.nextInt(a.length); // pos: 0~8
            int y = r.nextInt(a.length);
            int tmp = a[x];
            a[x] = a[y];
            a[y] = tmp;
        }
    }

    private static boolean rowChecked(int[] a) {
        int lastsum=Integer.MIN_VALUE;
        for (int i = 0; i <N; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += a[i*N+j];
            }
            if (lastsum==Integer.MIN_VALUE)
                lastsum = sum;
            else if (sum != lastsum)
                return false;                
        }
        return true;
    }

    private static boolean colChecked(int[] a) {
        int lastsum=Integer.MIN_VALUE;
        for (int j = 0; j <N; j++) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += a[i*N+j];
            }
            if (lastsum==Integer.MIN_VALUE)
                lastsum = sum;
            else if (sum != lastsum)
                return false;                
        }
        return true;
    }

    private static boolean crossChecked(int[] a) {
        int cross1=0;
        for (int i = 0; i < N; i++) {
            cross1 += a[i*N+i];
        }
        
        int cross2=0;
        for (int i = 0; i < N; i++) {
            cross2 += a[i*N+(N-i-1)];
        }
        
        if (cross1 != cross2) return false;
        return true;
    }
}

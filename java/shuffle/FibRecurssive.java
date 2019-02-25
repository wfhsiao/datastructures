
import java.util.HashMap;

/**
 *
 * @author user
 */
public class FibRecurssive {
    static HashMap<Integer, Long> hm = new HashMap<>();
    public static void main(String[] args) {
        int N = 48;
        long f = fib(N);
        System.out.printf("f(%d)=%d\n", N, f);
    }

    private static long fib(int N) {
        if (N==0) return 0;
        if (N==1) return 1;
        long p1, p2;
        if (hm.get(N-1) != null)
            p1 = hm.get(N-1);
        else {
            p1 = fib(N-1);
            hm.put(N-1, p1);
        }
        
        if (hm.get(N-2) != null)
            p2 = hm.get(N-2);
        else {
            p2 = fib(N-2);
            hm.put(N-2, p2);
        }
        return p1+p2;
    }
}

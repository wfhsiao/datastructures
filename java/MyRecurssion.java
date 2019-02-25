/**
 *
 * @author user
 */
public class MyRecurssion {
    public static void main(String[] args) {
//        printHello(10);
          int s = sum(3, 10);  //
          System.out.printf("s=%d\n", s);
          int s2 = sum2(3, 10);  //
          System.out.printf("s=%d\n", s2);
    }

//    private static void printHello(int n) {
//        if (n==0) return;
//        System.out.println("Hello");
//        printHello(n-1);
//    }

    private static int sum(int s, int e) {
        int result = 0;
        for (int i = s; i <= e; i++) {
            result += i;
        }
        return result;
    }

    private static int sum2(int s, int e) {
        if (s==e) return s;
        // return sum2(s, e-1)+e;
        return s+sum2(s+1, e);
    }
}

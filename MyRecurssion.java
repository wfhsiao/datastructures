/**
 *
 * @author user
 */
public class MyRecurssion {
    public static void main(String[] args) {
        printHello(10);
    }

    private static void printHello(int n) {
        if (n==0) return;
        System.out.println("Hello");
        printHello(n-1);
    }
}

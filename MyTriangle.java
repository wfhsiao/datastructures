
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MyTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("layer number: ");
        int N = scan.nextInt();
        printStars(N);
        printStars2(N);
    }

    public static void printStars(int N) {
        for (int i = 1; i <=N; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printStars2(int N) {
        for (int k = 1; k <=N; k++) {
            for (int j = 1; j <=N-k; j++) {
                System.out.print(" ");
            }
            for (int i = 1; i <=2*k-1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

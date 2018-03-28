/**
 *
 * @author user
 */
public class MyHanoi {
    public static void main(String[] args) {
        hanoi(3, "來源", "輔助", "目的");
    }

    private static void hanoi(int n, String src, String aux, String dest) {
        if (n==1)
            System.out.printf("從%s搬一個碟子到%s\n", src, dest);
        else {
            hanoi(n-1, src, dest, aux);
            System.out.printf("從%s搬一個碟子到%s\n", src, dest);
            hanoi(n-1, aux, src, dest);
        }
    }
}

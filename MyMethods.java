/**
 *
 * @author user
 */
public class MyMethods {
    public static void main(String[] args) {
        outputChars('峰', '蕭', 50);
        outputChars(20);
        outputChars(10);
        
    }

    private static void outputChars(int width) {
        for (char c = '一'; c <= '二'; c++) {
            System.out.print(c);
            if ((c - '一') % width == width-1) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void outputChars(char start, char end, int width) {
        for (char c = start; c <= end; c++) {
            System.out.print(c);
            if ((c - start) % width == width-1) {
                System.out.println();
            }
        }
        System.out.println();
    }
}

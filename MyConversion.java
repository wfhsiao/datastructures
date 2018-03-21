
/**
 *
 * @author user
 */
public class MyConversion {
    public static void main(String[] args) {
        String a = "32";
        String b = "32.32";
        int ia = Integer.valueOf(a);
        float fb = Float.valueOf(b);
        
        // Testing the effect of adding one
        System.out.printf("a=%s, b=%s, c=%d, d=%f\n", a + 1, b + 1, ia + 1, fb + 1);
    }
}

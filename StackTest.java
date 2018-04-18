
import java.util.Stack;

/**
 *
 * @author user
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("this");
        s.push("is");
        s.push("a");
        s.push("book");
        System.out.println(s);
        while (! s.empty()) {
            System.out.println(s.pop());
        }
    }
}

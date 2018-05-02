
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author user
 */
public class MyQueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("White");
        queue.offer("Red");
        queue.offer("Orange");
        queue.offer("Yellow");
        System.out.printf("q= %s\n", queue);
        System.out.println(queue.poll());
        System.out.printf("q= %s\n", queue);
        System.out.println(queue.peek());
        System.out.printf("q= %s\n", queue);
    }
}

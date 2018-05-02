
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author user
 */
public class MyQueueTest {
    public static void main(String[] args) {
//        queue();
          deque();
    }

    private static void queue() {
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

    private static void deque() {
        Deque<String> deque = new LinkedList<>();
        deque.offer("White");
        deque.offer("Red");
        deque.offer("Orange");
        deque.offer("Yellow");
        System.out.printf("deque= %s\n", deque);
        System.out.println(deque.pollFirst());
        System.out.printf("deque= %s\n", deque);
        System.out.println(deque.pollLast());
        System.out.printf("deque= %s\n", deque);
        System.out.println(deque.peekFirst());
        System.out.printf("deque= %s\n", deque);
        System.out.println(deque.peekLast());
        System.out.printf("deque= %s\n", deque);
    }
}

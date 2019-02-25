
import java.lang.reflect.Array;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author user
 */
public class MyQueueTest {
    public static void main(String[] args) {
//        queue();
//          deque();
          stack();
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

    private static void stack() {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer>[] stacks = (Stack<Integer>[]) Array.newInstance(Stack.class, 3);
        for (int i = 0; i < stacks.length; i++) {
            stacks[i] = new Stack<>();            
        }
        
        stacks[0].push(-7);
        stacks[0].push(-70);
        stacks[1].push(-700);
        stacks[2].push(-7000);
        print(stacks);
//        System.out.printf("stack= %s\n", stack);
//        while (! stack.empty()) {            
//            System.out.println(stack.pop());
//            System.out.printf("stack= %s\n", stack);            
//        }
        
    }

    private static void print(Stack<Integer>[] stacks) {
        for (int i = 0; i < stacks.length; i++) {
            System.out.println(stacks[i]);            
        }
    }
}

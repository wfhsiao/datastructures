
import java.lang.reflect.Array;
import java.util.Stack;

/**
 *
 * @author user
 */
public class MyHanoiStack {
    public static void main(String[] args) {        
        Stack<Integer>[] stacks = (Stack<Integer>[]) Array.newInstance(Stack.class, 3);
        for (int i = 0; i < stacks.length; i++) {
            stacks[i] = new Stack<>();            
        }
        // disks number
        int N = 4;
        init(stacks[0], N);
        print(stacks);
//        hanoi(3, "來源", "輔助", "目的");
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

    private static void init(Stack<Integer> stack, int N) {
        for (int i = N; i >=1; i--) {
            stack.push(i);
        }
    }
    
    private static void print(Stack<Integer>[] stacks) {
        for (int i = 0; i < stacks.length; i++) {
            System.out.println(stacks[i]);            
        }
    }
}

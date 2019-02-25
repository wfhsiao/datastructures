import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author wfhsi_000
 */
public class BinaryTree <T>{
    private Node root;

    
    private class InfoNode implements Comparable <InfoNode> {
        Node current;
        int depth;
        public String toString() {
            return String.format("[%s,%d]", current, depth);
        }
        public InfoNode(Node current, int depth) {
            setData(current, depth);
        }
        public void setData(Node current, int depth) {            
            this.current = current;
            this.depth = depth;
        }

        @Override
        public int compareTo(InfoNode o) {
            if (depth < o.depth)
                return -1;
            else if (depth > o.depth)
                return 1;
            return 0;
        }
    }
    
    
    private class Node <T> {
        Node left, right;
        T data;
        public Node(T data) {
            this.data=data;
            left = right = null;
        }       
        public String toString() {
            return data.toString();
        }
    }
    
    public BinaryTree() {
        root = null;
    }
    public BinaryTree(T data) {
        root = new Node(data);
    }
    
    public void insert(T data) {
        Node<T> node = new Node(data);
        if (root==null) {
            root = node;
            return;
        }
        ArrayList<InfoNode> st = new ArrayList<>();
        findAllLeaves(st, root, 0);
        Collections.sort(st); 
        System.out.println(st);
        Node<T> pre = st.get(0).current;
        if (pre.left==null)
            pre.left=node;
        else
            pre.right=node;
    }
    
    private void findAllLeaves(ArrayList<InfoNode> st, Node current, int depth) {
        if (current==null) return;
        if (current.left==null && current.right==null || current.left != null && current.right==null) {
            st.add(new InfoNode(current, depth));
        } else {
            findAllLeaves(st, current.left, depth+1);        
            findAllLeaves(st, current.right, depth+1);
        }
    }

    public void postorderTraverse() {
        postorderTraverse(root);
        System.out.println();
    }
    
    public void preorderTraverse() {
        preorderTraverse(root);
        System.out.println();
    }
    private void postorderTraverse(Node node) {
        if (node == null) return;
        postorderTraverse(node.left);
        postorderTraverse(node.right);
        System.out.print(node.data);
    }
    
    private void preorderTraverse(Node node) {
        if (node == null) return;
        System.out.print(node.data);
        preorderTraverse(node.left);        
        preorderTraverse(node.right);
    }
       
    public void printTree() {
        printTree(root);
        System.out.println();
    }
    
    private void printTree(Node node) {
        if (node==null) return;
             
        printTree(node.left);
        System.out.print(node.data);
        printTree(node.right);
    }
    
    public static void main(String[] args) {
        BinaryTree<String> bt = new BinaryTree<>();
        bt.insert("0");
        bt.insert("1");
        bt.insert("2");
        bt.insert("3");
        bt.insert("4");
        bt.insert("");
        bt.insert("5");
        bt.insert("6");
        bt.insert("7");
        bt.insert("");
        bt.insert("");
        bt.insert("");
        bt.insert("");
        bt.insert("8");
        bt.insert("9");
        System.out.print("preorder: ");
        bt.preorderTraverse();
        System.out.print("inorder: ");
        bt.printTree();
        System.out.print("postorder: ");
        bt.postorderTraverse();
    }
}

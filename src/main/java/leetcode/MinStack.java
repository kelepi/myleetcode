package leetcode;

/**
 * Created by Patrick on 15/3/10.
 */
public class MinStack {
    Node root = null;

    public void push(int x) {
        Node node = new Node();
        node.val = x;
        node.min = root == null ? x : (getMin() < x ? getMin() : x);
        node.next = root;
        root = node;
    }

    public void pop() {
        root = root.next;
    }

    public int top() {
        return root == null ? 0 : root.val;
    }

    public int getMin() {
        return root == null ? 0 : root.min;
    }

    class Node {
        int val;
        int min;
        Node next;
    }
}

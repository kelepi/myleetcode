package leetcode;

import object.ListNode;
import object.TreeNode;

import java.util.ArrayList;

/**
 * Created by Patrick on 15/4/25.
 */
public class ConvertSortedListtoBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        TreeNode root = new TreeNode(0);
        add(root, list, 0, list.size() - 1);
        return root;
    }

    public void add(TreeNode node, ArrayList<Integer> list, int start, int end) {
        int mid = (start + end) / 2;
        node.val = list.get(mid);

        if (mid != start) {
            TreeNode left = new TreeNode(0);
            node.left = left;
            add(left, list, start, mid - 1);
        }
        if (mid != end) {
            TreeNode right = new TreeNode(0);
            node.right = right;
            add(right, list, mid + 1, end);
        }
    }
}

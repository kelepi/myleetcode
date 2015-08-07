import object.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/29
 * Time: 15:35
 */
/*
Two elements of a binary search tree (BST) are swapped by mistake.

Recover the tree without changing its structure.

Note:
A solution using O(n) space is pretty straight forward. Could you devise a constant space solution?
 */
public class RecoverBinarySearchTree {
    private int lastVal = Integer.MIN_VALUE;
    private List<TreeNode> lastTreeNode = new ArrayList<TreeNode>();

    public void recoverTree(TreeNode root) {
        if (root == null) {
            return;
        }
        List<TreeNode> list = new ArrayList<TreeNode>();
        TreeNode min = root;
        while (min.left != null) {
            min = min.left;
        }
        lastVal = min.val;
        lastTreeNode.add(min);

        impl(root, list);

        if (!list.isEmpty()) {
            int temp = list.get(0).val;
            list.get(0).val = list.get(1).val;
            list.get(1).val = temp;
        }
    }

    private void impl(TreeNode root, List<TreeNode> list) {
        if (root == null) {
            return;
        }
        impl(root.left, list);

        if (root.val < lastVal) {
            if (list.isEmpty()) {
                list.add(lastTreeNode.get(0));
                list.add(root);
            } else {
                list.remove(1);
                list.add(root);
            }
        }
        lastTreeNode.remove(0);
        lastTreeNode.add(root);
        lastVal = root.val;
        impl(root.right, list);
    }
}

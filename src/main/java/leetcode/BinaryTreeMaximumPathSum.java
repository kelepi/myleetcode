package leetcode;

import object.TreeNode;

/**
 * Created by Patrick on 15/5/29.
 */
public class BinaryTreeMaximumPathSum {
    int max = 0;
    boolean init = false;

    public int maxPathSum(TreeNode root) {
        impl(root);
        return max;
    }

    private int impl(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = impl(root.left);
        int r = impl(root.right);
        if (!init) {
            max = root.val;
            init = true;
        }
        int nodeMax;
        if (l + root.val > r + root.val) {
            nodeMax = Math.max(root.val, l + root.val);
        } else {
            nodeMax = Math.max(root.val, r + root.val);
        }
        max = Math.max(max, nodeMax);
        max = Math.max(max, l + r + root.val);
        return nodeMax;
    }
}

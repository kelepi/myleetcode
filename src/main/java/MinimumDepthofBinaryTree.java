import object.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/4
 * Time: 14:16
 */
/*
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */
public class MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left != null && root.right != null) {
            int minLeft = minDepth(root.left);
            int minRight = minDepth(root.right);
            return Math.min(minLeft, minRight) + 1;
        } else if (root.left != null) {
            return minDepth(root.left) + 1;
        } else if (root.right != null) {
            return minDepth(root.right) + 1;
        } else {
            return 1;
        }
    }
}

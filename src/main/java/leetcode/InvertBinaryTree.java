package leetcode;

import object.TreeNode;

/**
 * Created by Patrick on 15/6/13.
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = temp;
        return root;
    }
}

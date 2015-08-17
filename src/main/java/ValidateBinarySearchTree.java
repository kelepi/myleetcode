import object.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/28
 * Time: 17:40
 */
/*
Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
 */
public class ValidateBinarySearchTree {
    int max = Integer.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        TreeNode min = root;
        while (min.left != null) {
            min = min.left;
        }
        return isValid(root, min);
    }

    private boolean isValid(TreeNode root, TreeNode min) {
        if (root == null) {
            return true;
        }
        if (isValid(root.left, min)) {
            if (root == min || root.val > max) {
                max = root.val;
                if (isValid(root.right, min)) {
                    return true;
                }
            }
        }
        return false;
    }
}

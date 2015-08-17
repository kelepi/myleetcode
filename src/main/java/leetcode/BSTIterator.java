package leetcode;

import object.TreeNode;

import java.util.Stack;

/**
 * Created by Patrick on 15/5/2.
 */
/*
Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
 */
public class BSTIterator {
    Stack<TreeNode>  stack = new Stack<TreeNode>();

    public BSTIterator(TreeNode root) {
        pushLeft(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.empty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode node = stack.pop();
        if (node.right != null) {
            pushRight(node.right);
        }
        return node.val;
    }

    private void pushLeft(TreeNode root) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }

    private void pushRight(TreeNode root) {
        while (root != null && root.left != null) {
            stack.push(root);
            root = root.left;
        }
        pushLeft(root);
    }
}

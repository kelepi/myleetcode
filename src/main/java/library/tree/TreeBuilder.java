package library.tree;

import object.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/7/22
 * Time: 13:26
 */
public class TreeBuilder {
    /*
    Leetcode 108: Convert Sorted Array to Binary Search Tree
    https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

    Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return sortedArrayToBSTHelper(nums, 0, nums.length);
    }

    private TreeNode sortedArrayToBSTHelper(int[] nums, int start, int end) {
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        if (start < mid) {
            node.left = sortedArrayToBSTHelper(nums, start, mid);
        }
        if (mid + 1 < end) {
            node.right = sortedArrayToBSTHelper(nums, mid + 1, end);
        }
        return node;
    }

    /*
    Leetcode 105:	Construct Binary Tree from Preorder and Inorder Traversal
    https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

    Given preorder and inorder traversal of a tree, construct the binary tree.

    Note:
    You may assume that duplicates do not exist in the tree.
     */
    public TreeNode buildTreeByPreOrderAndInOrder(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0 || preorder.length != inorder.length) {
            return null;
        }
        return buildTreeByPreOrderAndInOrderHelper(preorder, inorder, 0, 0, inorder.length);
    }

    private TreeNode buildTreeByPreOrderAndInOrderHelper(int[] preorder, int[] inorder, int pa, int ia, int ib) {
        int find = ia;
        for (int i = ia; i != ib; i++) {
            if (inorder[i] == preorder[pa]) {
                find = i;
                break;
            }
        }
        TreeNode node = new TreeNode(inorder[find]);
        if (ia < find) {
            node.left = buildTreeByPreOrderAndInOrderHelper(preorder, inorder, pa + 1, ia, find);
        }
        if (find + 1 < ib) {
            node.right = buildTreeByPreOrderAndInOrderHelper(preorder, inorder, pa + find - ia + 1, find + 1, ib);
        }
        return node;
    }

    /*
    LeetCode: 106	Construct Binary Tree from Inorder and Postorder Traversal
    https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/

    Given inorder and postorder traversal of a tree, construct the binary tree.

    Note:
    You may assume that duplicates do not exist in the tree.
     */
    public TreeNode buildTreeByPostOrderAndInOrder(int[] inorder, int[] postorder) {
        if (postorder == null || inorder == null || postorder.length == 0 || inorder.length == 0 || postorder.length != inorder.length) {
            return null;
        }
        return buildTreeByPostOrderAndInOrderHelper(postorder, inorder, postorder.length - 1, 0, inorder.length);
    }

    private TreeNode buildTreeByPostOrderAndInOrderHelper(int[] postorder, int[] inorder, int p, int ia, int ib) {
        int find = ia;
        for (int i = ia; i != ib; i++) {
            if (inorder[i] == postorder[p]) {
                find = i;
                break;
            }
        }
        TreeNode node = new TreeNode(postorder[p]);
        if (ia < find) {
            node.left = buildTreeByPostOrderAndInOrderHelper(postorder, inorder, p - (ib - find), ia, find);
        }
        if (find + 1 < ib) {
            node.right = buildTreeByPostOrderAndInOrderHelper(postorder, inorder, p - 1, find + 1, ib);
        }
        return node;
    }
}
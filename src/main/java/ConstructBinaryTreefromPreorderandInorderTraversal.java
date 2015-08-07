import object.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/28
 * Time: 19:00
 */
/*
Given preorder and inorder traversal of a tree, construct the binary tree.
 */
public class ConstructBinaryTreefromPreorderandInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0 || inorder.length != preorder.length) {
            return null;
        }
        int mid = preorder[0];
        int idx = search(inorder, mid);
        if (idx < 0) {
            return null;
        }
        int[] prl = new int[idx];
        int[] inl = new int[idx];
        int[] prr = new int[preorder.length - idx - 1];
        int[] inr = new int[preorder.length - idx - 1];

        for (int i = 0; i != idx; i++) {
            prl[i] = preorder[i + 1];
            inl[i] = inorder[i];
        }
        for (int i = 0; i != preorder.length - idx - 1; i++) {
            prr[i] = preorder[idx + i + 1];
            inr[i] = inorder[idx + i + 1];
        }

        TreeNode node = new TreeNode(mid);
        node.left = buildTree(prl, inl);
        node.right = buildTree(prr, inr);
        return node;
    }

    public int search(int[] ints, int i) {
        for (int j = 0; j != ints.length; j++) {
            if (ints[j] == i) {
                return j;
            }
        }
        return -1;
    }
}

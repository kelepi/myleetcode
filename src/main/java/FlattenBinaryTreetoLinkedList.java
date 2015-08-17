import object.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/27
 * Time: 17:47
 */
/*
Given a binary tree, flatten it to a linked list in-place.

For example,
Given

         1
        / \
       2   5
      / \   \
     3   4   6
The flattened tree should look like:
   1
    \
     2
      \
       3
        \
         4
          \
           5
            \
             6
click to show hints.

Hints:
If you notice carefully in the flattened tree, each node's right child points to the next node of a pre-order traversal.
 */
public class FlattenBinaryTreetoLinkedList {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flattenImpl(root);
    }

    private TreeNode flattenImpl(TreeNode root) {
        TreeNode left = root.left;
        TreeNode right = root.right;
        TreeNode last;
        if (left != null) {
            root.left = null;
            root.right = left;
            last = flattenImpl(left);
        } else {
            last = root;
        }
        if (right != null) {
            last.right = right;
            return flattenImpl(right);
        } else {
            return last;
        }
    }
}

import object.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/28
 * Time: 20:51
 */
public class ConstructBinaryTreefromInorderandPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder == null || postorder.length == 0 || inorder == null || inorder.length == 0 || inorder.length != postorder.length) {
            return null;
        }
        int mid = postorder[postorder.length - 1];
        int idx = search(inorder, mid);
        if (idx < 0) {
            return null;
        }
        int[] postl = new int[idx];
        int[] inl = new int[idx];
        int[] postr = new int[postorder.length - idx - 1];
        int[] inr = new int[postorder.length - idx - 1];

        for (int i = 0; i != idx; i++) {
            postl[i] = postorder[i];
            inl[i] = inorder[i];
        }
        for (int i = 0; i != postorder.length - idx - 1; i++) {
            postr[i] = postorder[idx + i];
            inr[i] = inorder[idx + i + 1];
        }

        TreeNode node = new TreeNode(mid);
        node.left = buildTree(inl, postl);
        node.right = buildTree(inr, postr);
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

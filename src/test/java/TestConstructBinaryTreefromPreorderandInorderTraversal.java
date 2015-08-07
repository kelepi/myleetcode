import object.TreeNode;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/28
 * Time: 19:59
 */
public class TestConstructBinaryTreefromPreorderandInorderTraversal {
    ConstructBinaryTreefromPreorderandInorderTraversal c = new ConstructBinaryTreefromPreorderandInorderTraversal();

    @Test
    public void testSample() throws Exception {
        int[] preorder = {1, 2, 3, 4, 5, 6, 7};
        int[] inorder = {4, 2, 1, 3, 6, 5, 7};
        TreeNode treeNode = c.buildTree(preorder, inorder);
        System.out.println();
    }
    @Test
    public void testSample0() throws Exception {
        int[] preorder = {4, 2, 1, 3, 6, 5, 7};
        int[] inorder = {1, 2, 3, 4, 5, 6, 7};
        TreeNode treeNode = c.buildTree(preorder, inorder);
        System.out.println();
    }

    @Test
    public void testSample1() throws Exception {
        int[] preorder = {1};
        int[] inorder = {1};
        TreeNode treeNode = c.buildTree(preorder, inorder);
        System.out.println();
    }

    /*
Input:	[1,2], [2,1]
Output:	[2,1]
Expected:	[1,2]
     */
    @Test
    public void testSample2() throws Exception {
        int[] preorder = {1, 2};
        int[] inorder = {2, 1};
        TreeNode treeNode = c.buildTree(preorder, inorder);
        System.out.println();
    }

    @Test
    public void testSample3() throws Exception {
        int[] preorder = {1, 2};
        int[] inorder = {1, 2};
        TreeNode treeNode = c.buildTree(preorder, inorder);
        System.out.println();
    }

    /*
Runtime Error Message:	Line 17: java.lang.NegativeArraySizeException
Last executed input:	[1,2,3], [2,3,1]
     */
    @Test
    public void testError() throws Exception {
        int[] preorder = {1, 2, 3};
        int[] inorder = {2, 3, 1};
        TreeNode treeNode = c.buildTree(preorder, inorder);
        System.out.println();
    }

    @Test
    public void testError2() throws Exception {
        int[] preorder = {1, 2, 3};
        int[] inorder = {1, 2, 3};
        TreeNode treeNode = c.buildTree(preorder, inorder);
        System.out.println();
    }

}

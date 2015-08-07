import object.TreeNode;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/28
 * Time: 11:03
 */
public class TestFlattenBinaryTreetoLinkedList {
    FlattenBinaryTreetoLinkedList f = new FlattenBinaryTreetoLinkedList();

    /*
        1
        / \
       2   5
      / \   \
     3   4   6
     */
    @Test
    public void testSample() throws Exception {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);

        n1.left = n2;
        n1.right = n5;
        n2.left = n3;
        n2.right = n4;
        n5.right = n6;

        f.flatten(n1);
        printFlattenTree(n1);
    }

    @Test
    public void testName() throws Exception {
        TreeNode n1 = new TreeNode(1);
        f.flatten(n1);
        printFlattenTree(n1);
    }

    @Test
    public void testNull() throws Exception {
        TreeNode n1 = null;
        f.flatten(n1);
        printFlattenTree(n1);
    }

    @Test
    public void test21() throws Exception {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        n1.left = n2;
        f.flatten(n1);
        printFlattenTree(n1);
    }
    @Test
    public void test22() throws Exception {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        n1.right = n2;
        f.flatten(n1);
        printFlattenTree(n1);
    }
    @Test
    public void test31() throws Exception {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        n1.left = n2;
        n2.right = n3;
        f.flatten(n1);
        printFlattenTree(n1);
    }

    /*

Input:	[1,2,null,3,4,5]
Output:	[1,null,2,null,3,null,4]
Expected:	[1,null,2,null,3,null,5,null,4]
     */
    @Test
    public void testError() throws Exception {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        n1.left = n2;
        n2.left = n3;
        n2.right = n4;
        n3.left = n5;

        f.flatten(n1);
        printFlattenTree(n1);

    }

    private void printFlattenTree(TreeNode node) {
        while (node != null) {
            System.out.print(node.val + ",");
            if (node.left != null) {
                System.out.println("Exception");
                break;
            }
            node = node.right;
        }
    }
}

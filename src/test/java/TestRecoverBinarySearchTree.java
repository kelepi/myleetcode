import object.TreeNode;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/29
 * Time: 16:14
 */
public class TestRecoverBinarySearchTree {
    RecoverBinarySearchTree r = new RecoverBinarySearchTree();

    @Test
    public void testSample() throws Exception {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        n4.left = n2;
        n4.right = n3;
        n2.left = n1;
        n2.right = n6;
        n3.left = n5;
        n3.right = n7;

        r.recoverTree(n4);
        assert n4.val == 4;
        assert n4.left.val == 2;
        assert n4.right.val == 6;
        assert n4.left.left.val == 1;
        assert n4.left.right.val == 3;
        assert n4.right.left.val == 5;
        assert n4.right.right.val == 7;
    }

    @Test
    public void testSample0() throws Exception {
        r.recoverTree(null);
    }

    @Test
    public void testSample1() throws Exception {
        TreeNode n1 = new TreeNode(1);
        r.recoverTree(n1);
        assert n1.val == 1;
    }

    @Test
    public void testSample2() throws Exception {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        n1.left = n2;
        r.recoverTree(n1);
        assert n1.val == 2;
        assert n1.left.val == 1;
    }

    @Test
    public void testSample22() throws Exception {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        n2.right = n1;
        r.recoverTree(n2);
        assert n2.val == 1;
        assert n2.right.val == 2;
    }

    @Test
    public void testSample3() throws Exception {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        n1.left = n2;
        n2.left = n3;

        r.recoverTree(n1);
        assert n1.val == 3;
        assert n1.left.val == 2;
        assert n1.left.left.val == 1;
    }
    /*
Input:	[3,1,2]
Output:	[3,1,2]
Expected:	[2,1,3]
     */
    @Test
    public void testSample31() throws Exception {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        n3.left = n1;
        n3.right = n2;

        r.recoverTree(n3);
        assert n3.val == 2;
        assert n3.left.val == 1;
        assert n3.right.val == 3;
    }



    @Test
    public void testSample4() throws Exception {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);

        n2.left = n3;
        n3.left = n4;
        n4.left = n1;

        r.recoverTree(n2);
        assert n2.val == 4;
        assert n2.left.val == 3;
        assert n2.left.left.val == 2;
        assert n2.left.left.left.val == 1;
    }

    /*
    Input:	[2,null,3,1]
    Output:	[2,null,3,1]
    Expected:	[1,null,3,2]
     */
    @Test
    public void testSample32() throws Exception {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);

        n2.right = n3;
        n3.left = n1;

        r.recoverTree(n2);
        assert n2.val == 1;
        assert n2.right.val == 3;
        assert n2.right.left.val == 2;
    }
}

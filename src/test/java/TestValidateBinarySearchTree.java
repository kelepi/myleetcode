import object.TreeNode;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/28
 * Time: 17:45
 */
public class TestValidateBinarySearchTree {
    ValidateBinarySearchTree v = new ValidateBinarySearchTree();

    @Test
    public void testSample() throws Exception {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;

        assert !v.isValidBST(n1);
    }

    @Test
    public void testSample3() throws Exception {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        n2.left = n1;
        n2.right = n3;
        n3.right = n4;
        n4.right = n5;

        assert v.isValidBST(n1);
    }

    @Test
    public void testSample2() throws Exception {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n3.right = n5;

        assert !v.isValidBST(n1);
    }

    @Test
    public void testErr() throws Exception {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(1);

        n1.left = n2;

        assert !v.isValidBST(n1);
    }

    @Test
    public void testErr2() throws Exception {
        TreeNode n1 = new TreeNode(Integer.MIN_VALUE);
        TreeNode n2 = new TreeNode(Integer.MIN_VALUE);

        n1.left = n2;

        assert !v.isValidBST(n1);
    }

    @Test
    public void testErr3() throws Exception {
        TreeNode n1 = new TreeNode(Integer.MIN_VALUE);
        TreeNode n2 = new TreeNode(Integer.MIN_VALUE);

        n1.right = n2;

        assert !v.isValidBST(n1);
    }

    @Test
    public void testErr4() throws Exception {
        TreeNode n1 = new TreeNode(Integer.MIN_VALUE);

        assert v.isValidBST(n1);
    }

    @Test
    public void testErr5() throws Exception {
        assert v.isValidBST(null);
    }
}

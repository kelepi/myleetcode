import object.TreeNode;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/4
 * Time: 14:21
 */
public class TestMinimumDepthofBinaryTree {
    MinimumDepthofBinaryTree m = new MinimumDepthofBinaryTree();

    @Test
    public void testSample() throws Exception {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(1);
        TreeNode n4 = new TreeNode(1);
        TreeNode n5 = new TreeNode(1);
        TreeNode n6 = new TreeNode(1);
        TreeNode n7 = new TreeNode(1);

//        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n6;
        n4.left = n5;

        int depth = m.minDepth(n3);
        System.out.println(depth);
        assert depth == 2;
    }
}

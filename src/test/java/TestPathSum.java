import object.TreeNode;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/4
 * Time: 14:41
 */
public class TestPathSum {
    /*
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
     */
    PathSum p = new PathSum();
    @Test
    public void testSample() throws Exception {
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        TreeNode n8 = new TreeNode(8);
        TreeNode n11 = new TreeNode(11);
        TreeNode n13 = new TreeNode(13);
        TreeNode n42 = new TreeNode(4);
        TreeNode n7 = new TreeNode(7);
        TreeNode n2 = new TreeNode(2);
        TreeNode n1 = new TreeNode(1);

        n5.left = n4;
        n4.left = n11;
        n11.left = n7;
        n11.right = n2;
        n5.right = n8;
        n8.left = n13;
        n8.right = n42;
        n42.right = n1;

        assert p.hasPathSum(n5, 22);
        assert !p.hasPathSum(n5, 23);
    }
}

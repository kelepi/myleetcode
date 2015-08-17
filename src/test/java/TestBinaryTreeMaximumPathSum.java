import leetcode.BinaryTreeMaximumPathSum;
import object.TreeNode;
import org.junit.Test;

/**
 * Created by Patrick on 15/5/29.
 */
public class TestBinaryTreeMaximumPathSum {
    BinaryTreeMaximumPathSum b = new BinaryTreeMaximumPathSum();

    @Test
    public void testSample() throws Exception {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);

        n1.left = n2;
        n1.right = n3;

        int max = b.maxPathSum(n1);
        System.out.println(max);
    }
    @Test
    public void testSample2() throws Exception {
        TreeNode n1 = new TreeNode(-3);

        int max = b.maxPathSum(n1);
        System.out.println(max);
    }
}

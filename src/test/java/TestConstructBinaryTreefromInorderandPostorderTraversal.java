import object.TreeNode;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/28
 * Time: 20:58
 */
public class TestConstructBinaryTreefromInorderandPostorderTraversal {
    ConstructBinaryTreefromInorderandPostorderTraversal c = new ConstructBinaryTreefromInorderandPostorderTraversal();

    @Test
    public void testSample() throws Exception {
        int[] in = {1, 2, 3, 4, 5, 6, 7};
        int[] post = {1, 3, 2, 5, 7, 6, 4};
        TreeNode t = c.buildTree(in, post);
        System.out.println();
    }
}

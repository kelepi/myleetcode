import object.TreeNode;
import org.junit.Test;
import utils.Utils;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/27
 * Time: 16:12
 */
public class TestPathSumII {
    PathSumII p = new PathSumII();

    @Test
    public void testSample() throws Exception {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(8);
        TreeNode t4 = new TreeNode(11);
        TreeNode t5 = new TreeNode(13);
        TreeNode t6 = new TreeNode(4);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(2);
        TreeNode t9 = new TreeNode(5);
        TreeNode t10 = new TreeNode(1);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t3.left = t5;
        t3.right = t6;
        t4.left = t7;
        t4.right = t8;
        t6.left = t9;
        t6.right = t10;

        List<List<Integer>> lists = p.pathSum(t1, 22);
        Utils.printListListInteger(lists);
    }

    @Test
    public void testError() throws Exception {
        TreeNode t1 = new TreeNode(-2);
        TreeNode t2 = new TreeNode(-3);
        t1.right = t2;

        List<List<Integer>> lists = p.pathSum(t1, -5);
        Utils.printListListInteger(lists);
    }

    /*
Input:	[1,-2,-3,1,3,-2,null,-1], -1
Output:	[]
Expected:	[[1,-2,1,-1]]
     */
    @Test
    public void testError2() throws Exception {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(-2);
        TreeNode t3 = new TreeNode(-3);
        TreeNode t4 = new TreeNode(1);
        TreeNode t5 = new TreeNode(3);
        TreeNode t6 = new TreeNode(-2);
        TreeNode t7 = new TreeNode(-1);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t4.left = t7;

        List<List<Integer>> lists = p.pathSum(t1, -1);
        Utils.printListListInteger(lists);
    }
}

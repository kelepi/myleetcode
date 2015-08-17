import object.TreeNode;
import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/28
 * Time: 15:30
 */
public class TestUniqueBinarySearchTreesII {
    UniqueBinarySearchTreesII u = new UniqueBinarySearchTreesII();

    @Test
    public void testSample() throws Exception {
        List<TreeNode> list = u.generateTrees(3);
        System.out.println(list.size());
    }

    /*
Input:	4
Output:	    [[1,null,2,null,3,null,4],[1,null,2,null,4,3],[1,null,3,2,4],[1,null,4,2,null,null,3],[1,null,4,3,null,2],[2,1,3,null,null,null,4],[2,1,4,null,null,3],[3,1,4,null,2],[3,2,4,1],[6,1,null,null,2,null,3],[6,1,null,null,3,2],[6,2,null,1,3],[6,3,null,1,null,null,2],[6,3,null,2,null,1]]
Expected:	[[1,null,2,null,3,null,4],[1,null,2,null,4,3],[1,null,3,2,4],[1,null,4,2,null,null,3],[1,null,4,3,null,2],[2,1,3,null,null,null,4],[2,1,4,null,null,3],[3,1,4,null,2],[3,2,4,1],[4,1,null,null,2,null,3],[4,1,null,null,3,2],[4,2,null,1,3],[4,3,null,1,null,null,2],[4,3,null,2,null,1]]
     */
    @Test
    public void testError() throws Exception {
        List<TreeNode> list = u.generateTrees(2);
        System.out.println(list.size());
    }

    @Test
    public void testTLE() throws Exception {
        List<TreeNode> list = u.generateTrees(8);
        System.out.println(list.size());
    }
}

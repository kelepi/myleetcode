import leetcode.BSTIterator;
import leetcode.BinaryTreeLevelOrderTraversal;
import object.TreeNode;
import object.TreeNodeUtils;
import org.junit.Test;
import utils.BinaryTreeGenerator;

/**
 * Created by Patrick on 15/5/2.
 */
public class TestBSTIterator {
    BinaryTreeLevelOrderTraversal b = new BinaryTreeLevelOrderTraversal();

    @Test
    public void testSample() throws Exception {
        String[] strs = {
//                "{}",
//                "{4}",
//                "{4,2}",
//                "{4,2,6}",
//                "{4,2,6,1}",
//                "{4,2,6,1,3}",
//                "{4,2,6,1,3,5}",
//                "{4,2,6,1,3,5,7}",
//                "{5,4,#,3,#,#,#,2,#,#,#,#,#,#,#,1,#,#,#,#,#,#,#,#,#,#,#,#,#,#,#}",
//                "{1,#,2,#,#,#,3,#,#,#,#,#,#,#,4,#,#,#,#,#,#,#,#,#,#,#,#,#,#,#,5}",
                "{1,#,5,#,#,2,#,#,#,#,#,#,4,#,#,#,#,#,#,#,#,#,#,#,#,3,#,#,#,#,#}",
        };
        for (String str: strs) {
            TreeNode tree = BinaryTreeGenerator.generate(str);
//            TreeNode tree = BinaryTreeGenerator.generateBasedOnLevel(str);
            TreeNodeUtils.print(tree);
            BSTIterator i = new BSTIterator(tree);
            while (i.hasNext()) {
                System.out.print(i.next() + ", ");
            }
            System.out.println();
        }
    }
}

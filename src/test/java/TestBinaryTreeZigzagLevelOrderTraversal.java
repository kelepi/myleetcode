import leetcode.BinaryTreeZigzagLevelOrderTraversal;
import object.TreeNode;
import org.junit.Test;
import utils.BinaryTreeGenerator;

import java.util.List;

/**
 * Created by Patrick on 15/4/5.
 */
public class TestBinaryTreeZigzagLevelOrderTraversal {
    @Test
    public void testSample() throws Exception {
        String tree = "{3,9,20,#,#,15,7}";
        TreeNode root = BinaryTreeGenerator.generate(tree);

        BinaryTreeZigzagLevelOrderTraversal traversal = new BinaryTreeZigzagLevelOrderTraversal();
        List<List<Integer>> result = traversal.zigzagLevelOrder(root);
        assert (result.size() == 3);
        assert (result.get(0).get(0) == 3);
        assert (result.get(1).get(0) == 20);
        assert (result.get(1).get(1) == 9);
        assert (result.get(2).get(0) == 15);
        assert (result.get(2).get(1) == 7);
    }

    @Test
    public void testSample1() throws Exception {
        String tree = "{1,2,3,4,#,#,5}";
        TreeNode root = BinaryTreeGenerator.generate(tree);

        BinaryTreeZigzagLevelOrderTraversal traversal = new BinaryTreeZigzagLevelOrderTraversal();
        List<List<Integer>> result = traversal.zigzagLevelOrder(root);
        assert (result.size() == 3);
        assert (result.get(0).get(0) == 1);
        assert (result.get(1).get(0) == 3);
        assert (result.get(1).get(1) == 2);
        assert (result.get(2).get(0) == 4);
        assert (result.get(2).get(1) == 5);
    }

    @Test
    public void testSample2() throws Exception {
        String tree = "{1,2,3,4,#,#,5,6,7,#}";
        TreeNode root = BinaryTreeGenerator.generate(tree);

        BinaryTreeZigzagLevelOrderTraversal traversal = new BinaryTreeZigzagLevelOrderTraversal();
        List<List<Integer>> result = traversal.zigzagLevelOrder(root);
        assert (result.size() == 4);
        assert (result.get(0).get(0) == 1);
        assert (result.get(1).get(0) == 3);
        assert (result.get(1).get(1) == 2);
        assert (result.get(2).get(0) == 4);
        assert (result.get(2).get(1) == 5);
        assert (result.get(3).get(0) == 7);
        assert (result.get(3).get(1) == 6);
    }

    @Test
    public void testSample3() throws Exception {
        String tree = "{1,2,3,4,#,#,5,#,6,7,#}";
        TreeNode root = BinaryTreeGenerator.generateBasedOnLevel(tree);

        BinaryTreeZigzagLevelOrderTraversal traversal = new BinaryTreeZigzagLevelOrderTraversal();
        List<List<Integer>> result = traversal.zigzagLevelOrder(root);
        assert (result.size() == 4);
        assert (result.get(0).get(0) == 1);
        assert (result.get(1).get(0) == 3);
        assert (result.get(1).get(1) == 2);
        assert (result.get(2).get(0) == 4);
        assert (result.get(2).get(1) == 5);
        assert (result.get(3).get(0) == 7);
        assert (result.get(3).get(1) == 6);
    }
}

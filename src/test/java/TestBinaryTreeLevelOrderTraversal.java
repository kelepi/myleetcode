import leetcode.BinaryTreeLevelOrderTraversal;
import object.TreeNode;
import org.junit.Test;
import utils.BinaryTreeGenerator;
import object.TreeNodeUtils;

import java.util.List;

/**
 * Created by Patrick on 15/3/14.
 */
public class TestBinaryTreeLevelOrderTraversal {
    @Test
    public void testGenerateSimple() throws Exception {
        String str = "{}";
        TreeNode root = BinaryTreeGenerator.generate(str);
        assert (root == null);
    }

    @Test
    public void testGenerateSimple2() throws Exception {
        String str = "{#}";
        TreeNode root = BinaryTreeGenerator.generate(str);
        assert (root == null);
    }

    @Test
    public void testGenerateSimple3() throws Exception {
        String str = "{1}";
        TreeNode root = BinaryTreeGenerator.generate(str);
        assert (root.val == 1);
        assert (root.left == null);
        assert (root.right == null);
    }

    @Test
    public void testGenerateSimple4() throws Exception {
        String str = "{1,2,3,#,#,4,#,#,#,#,#,#,5}";
        TreeNode root = BinaryTreeGenerator.generate(str);
        assert (root.val == 1);
        assert (root.left.val == 2);
        assert (root.right.val == 3);
        assert (root.left.left == null);
        assert (root.left.right == null);
        assert (root.right.left.val == 4);
        assert (root.right.right == null);
        assert (root.right.left.left == null);
        assert (root.right.left.right.val == 5);
    }

    @Test
    public void testgenerateBasedOnLevel1() throws Exception {
        String str = "{1,2,3,#,#,4,#,#,5}";
        TreeNode root = BinaryTreeGenerator.generateBasedOnLevel(str);
        assert (root.val == 1);
        assert (root.left.val == 2);
        assert (root.right.val == 3);
        assert (root.left.left == null);
        assert (root.left.right == null);
        assert (root.right.left.val == 4);
        assert (root.right.right == null);
        assert (root.right.left.left == null);
        assert (root.right.left.right.val == 5);
    }

    @Test
    public void testgenerateBasedOnLevel2() throws Exception {
        String str = "{3,9,20,#,#,15,7}";
        TreeNode root = BinaryTreeGenerator.generateBasedOnLevel(str);
        assert (root.val == 3);
        assert (root.left.val == 9);
        assert (root.right.val == 20);
        assert (root.left.left == null);
        assert (root.left.right == null);
        assert (root.right.left.val == 15);
        assert (root.right.right.val == 7);
        assert (root.right.left.left == null);
        assert (root.right.left.right == null);
        assert (root.right.right.left == null);
        assert (root.right.right.right == null);
    }

    @Test
    public void testLevelPrint01() throws Exception {
        String str = "{}";
        TreeNode root = BinaryTreeGenerator.generateBasedOnLevel(str);
        BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> list = traversal.levelOrder(root);
        String result = TreeNodeUtils.printLevelOrder(list);
        assert (result.equals("[]"));
    }

    @Test
    public void testLevelPrint02() throws Exception {
        String str = "{#}";
        TreeNode root = BinaryTreeGenerator.generateBasedOnLevel(str);
        BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> list = traversal.levelOrder(root);
        String result = TreeNodeUtils.printLevelOrder(list);
        assert (result.equals("[]"));
    }

    @Test
    public void testLevelPrint03() throws Exception {
        String str = "{1}";
        TreeNode root = BinaryTreeGenerator.generateBasedOnLevel(str);
        BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> list = traversal.levelOrder(root);
        String result = TreeNodeUtils.printLevelOrder(list);
        assert (result.equals("[[1]]"));
    }

    @Test
    public void testLevelPrint04() throws Exception {
        String str = "{1,#,2}";
        TreeNode root = BinaryTreeGenerator.generateBasedOnLevel(str);
        BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> list = traversal.levelOrder(root);
        String result = TreeNodeUtils.printLevelOrder(list);
        assert (result.equals("[[1],[2]]"));
    }

    @Test
    public void testLevelPrint05() throws Exception {
        String str = "{1,#,2,#,3,#,4,5,6}";
        TreeNode root = BinaryTreeGenerator.generateBasedOnLevel(str);
        BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> list = traversal.levelOrder(root);
        String result = TreeNodeUtils.printLevelOrder(list);
        assert (result.equals("[[1],[2],[3],[4],[5,6]]"));
    }

    @Test
    public void testLevelPrint1() throws Exception {
        String str = "{3,9,20,#,#,15,7}";
        TreeNode root = BinaryTreeGenerator.generateBasedOnLevel(str);
        BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> list = traversal.levelOrder(root);
        String result = TreeNodeUtils.printLevelOrder(list);
        assert (result.equals("[[3],[9,20],[15,7]]"));
    }

    @Test
    public void testLevelPrint3() throws Exception {
        String str = "{1,2,3,#,#,4,#,#,5}";
        TreeNode root = BinaryTreeGenerator.generateBasedOnLevel(str);
        BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> list = traversal.levelOrder(root);
        String result = TreeNodeUtils.printLevelOrder(list);
        assert (result.equals("[[1],[2,3],[4],[5]]"));
    }
}

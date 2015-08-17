import leetcode.BinaryTreeRightSideView;
import object.TreeNode;
import org.junit.Test;

import java.util.List;

/**
 * Created by Patrick on 15/4/5.
 */
public class TestBinaryTreeRightSideView {
    @Test
    public void testExample() throws Exception {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        node1.left = node2;
        node1.right = node3;
        node2.right = node5;
        node3.right = node4;

        BinaryTreeRightSideView view = new BinaryTreeRightSideView();
        List<Integer> result = view.rightSideView(node1);
        assert (result.size() == 3);
        assert (result.get(0) == 1);
        assert (result.get(1) == 3);
        assert (result.get(2) == 4);
    }

    @Test
    public void testExample1() throws Exception {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        node1.left = node2;
        node1.right = node3;
        node2.right = node5;
        node5.left = node4;

        BinaryTreeRightSideView view = new BinaryTreeRightSideView();
        List<Integer> result = view.rightSideView(node1);
        assert (result.size() == 4);
        assert (result.get(0) == 1);
        assert (result.get(1) == 3);
        assert (result.get(2) == 5);
        assert (result.get(3) == 4);
    }

    @Test
    public void testExample2() throws Exception {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        node1.left = node2;
        node1.right = node3;
        node2.right = node5;
        node2.left = node4;

        BinaryTreeRightSideView view = new BinaryTreeRightSideView();
        List<Integer> result = view.rightSideView(node1);
        assert (result.size() == 3);
        assert (result.get(0) == 1);
        assert (result.get(1) == 3);
        assert (result.get(2) == 5);
    }

    @Test
    public void testExample3() throws Exception {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        node1.left = node2;
        node2.right = node5;
        node2.left = node3;
        node3.left = node4;

        BinaryTreeRightSideView view = new BinaryTreeRightSideView();
        List<Integer> result = view.rightSideView(node1);
        assert (result.size() == 4);
        assert (result.get(0) == 1);
        assert (result.get(1) == 2);
        assert (result.get(2) == 5);
        assert (result.get(3) == 4);
    }
}

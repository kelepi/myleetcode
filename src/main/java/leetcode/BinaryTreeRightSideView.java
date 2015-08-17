package leetcode;

import object.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Patrick on 15/4/5.
 */
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        return rightSideViewRecursive(root, 0, list);
    }

    private List<Integer> rightSideViewRecursive(TreeNode node, int index, List<Integer> list) {
        List<Integer> result = list;
        if (node != null) {
            if (index >= list.size()) {
                result.add(node.val);
            }
            result = rightSideViewRecursive(node.right, index + 1, result);
            result = rightSideViewRecursive(node.left, index + 1, result);
        }
        return result;
    }
}

package leetcode;

import object.TreeNode;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Patrick on 15/4/5.
 */
public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<TreeNode> upperLevel = new LinkedList<TreeNode>();
        List<TreeNode> curLevel = new LinkedList<TreeNode>();
        List<Integer> levelVals = new LinkedList<Integer>();
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        boolean forward = true;

        if (root != null) {
            upperLevel.add(root);
            List<Integer> rootLevel = new LinkedList<Integer>();
            rootLevel.add(root.val);
            result.add(rootLevel);
            forward = !forward;
        }
        while (!upperLevel.isEmpty()) {
            for (TreeNode node : upperLevel) {
                if (node.left != null) {
                    curLevel.add(node.left);
                    levelVals.add(node.left.val);
                }
                if (node.right != null) {
                    curLevel.add(node.right);
                    levelVals.add(node.right.val);
                }
            }
            if (!levelVals.isEmpty()) {
                if (!forward) {
                    Collections.reverse(levelVals);
                }
                result.add(levelVals);
            }
            levelVals = new LinkedList<Integer>();
            upperLevel = curLevel;
            curLevel = new LinkedList<TreeNode>();
            forward = !forward;
        }
        return result;
    }
}

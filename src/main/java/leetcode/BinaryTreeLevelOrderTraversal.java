package leetcode;

import object.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Patrick on 15/3/14.
 */
public class BinaryTreeLevelOrderTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<TreeNode> upperLevel = new LinkedList<TreeNode>();
        List<TreeNode> curLevel = new LinkedList<TreeNode>();
        List<Integer> levelVals = new LinkedList<Integer>();
        List<List<Integer>> result = new LinkedList<List<Integer>>();

        if(root != null) {
            upperLevel.add(root);
            List<Integer> rootLevel = new LinkedList<Integer>();
            rootLevel.add(root.val);
            result.add(rootLevel);
        }
        while (!upperLevel.isEmpty()) {
            for(TreeNode node: upperLevel) {
                if(node.left != null) {
                    curLevel.add(node.left);
                    levelVals.add(node.left.val);
                }
                if(node.right != null) {
                    curLevel.add(node.right);
                    levelVals.add(node.right.val);
                }
            }
            if (!levelVals.isEmpty()) {
                result.add(levelVals);
            }
            levelVals = new LinkedList<Integer>();
            upperLevel = curLevel;
            curLevel = new LinkedList<TreeNode>();
        }
        return result;
    }
}

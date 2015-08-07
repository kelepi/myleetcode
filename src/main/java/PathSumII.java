import object.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/27
 * Time: 16:04
 */
/*
Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
return
[
   [5,4,11,2],
   [5,8,4,5]
]
 */
public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        rec(root, sum, 0, list, results);
        return results;
    }

    private void rec(TreeNode root, int sum, int sumSoFar, List<Integer> list, List<List<Integer>> results) {
        if (root == null) {
            return;
        }
        if (root.val + sumSoFar == sum && root.left == null && root.right == null) {
            List<Integer> l = new ArrayList<Integer>();
            l.addAll(list);
            l.add(root.val);
            results.add(l);
        } else {
            list.add(root.val);
            rec(root.left, sum, root.val + sumSoFar, list, results);
            rec(root.right, sum, root.val + sumSoFar, list, results);
            list.remove(list.size() - 1);
        }
    }
}

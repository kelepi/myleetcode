import object.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/28
 * Time: 11:27
 */
/*
Given n, generate all structurally unique BST's (binary search trees) that store values 1...n.

For example,
Given n = 3, your program should return all 5 unique BST's shown below.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
 */
public class UniqueBinarySearchTreesII {
    public List<TreeNode> generateTrees(int n) {
        if (n < 0) {
            return null;
        }
        if (n == 0) {
            List<TreeNode> l = new ArrayList<TreeNode>();
            l.add(null);
            return l;
        }
        ArrayList<TreeNode> t1 = new ArrayList<TreeNode>();
        t1.add(new TreeNode(1));
        if (n == 1) {
            return t1;
        }
        ArrayList<ArrayList<TreeNode>> holder = new ArrayList<ArrayList<TreeNode>>(n + 1);
        holder.add(null);
        holder.add(t1);

        for (int i = 2; i <= n; i++) {
            ArrayList<TreeNode> result = new ArrayList<TreeNode>();
            for (int j = 0; j != i; j++) {
                ArrayList<TreeNode> leftTrees = holder.get(j);
                ArrayList<TreeNode> rightTrees = holder.get(i - 1 - j);
                int curId = j + 1;
                if (leftTrees == null) {
                    for (int cnt = 0; cnt != rightTrees.size(); cnt++) {
                        TreeNode t = new TreeNode(curId);
                        t.right = updateCnt(rightTrees.get(cnt), curId);
                        result.add(t);
                    }
                } else if (rightTrees == null) {
                    for (int cnt = 0; cnt != leftTrees.size(); cnt++) {
                        TreeNode t = new TreeNode(curId);
                        t.left = leftTrees.get(cnt);
                        result.add(t);
                    }
                } else {
                    for (int cntl = 0; cntl != leftTrees.size(); cntl++) {
                        for (int cntr = 0; cntr != rightTrees.size(); cntr++) {
                            TreeNode t = new TreeNode(curId);
                            t.left = leftTrees.get(cntl);
                            t.right = updateCnt(rightTrees.get(cntr), curId);
                            result.add(t);
                        }
                    }
                }
            }
            holder.add(result);
        }
        return holder.get(n);
    }

    private TreeNode updateCnt(TreeNode right, int curId) {
        if (right == null) {
            return null;
        }
        TreeNode node = new TreeNode(right.val + curId);
        node.left = updateCnt(right.left, curId);
        node.right = updateCnt(right.right, curId);
        return node;
    }
}

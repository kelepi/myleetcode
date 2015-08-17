package object;

import leetcode.BinaryTreeLevelOrderTraversal;

import java.util.List;

/**
 * Created by Patrick on 15/3/14.
 */
public class TreeNodeUtils {
    public static void print(TreeNode tree) {
        System.out.println(printLevelOrder(BinaryTreeLevelOrderTraversal.levelOrder(tree)));
    }

    public static String printLevelOrder(List<List<Integer>> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int idx = 0; idx < list.size(); idx++) {
            sb.append("[");
            List<Integer> nlist = list.get(idx);
            for (int jdx = 0; jdx < nlist.size(); jdx++) {
                int val = nlist.get(jdx);
                sb.append(val);
                if (jdx != nlist.size() - 1) {
                    sb.append(",");
                }
            }
            sb.append("]");
            if (idx != list.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

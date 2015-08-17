package utils;

import object.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Patrick on 15/3/14.
 */
public class BinaryTreeGenerator {

    /*
    Used in this case:
   1
  / \
 2   3
    /
   4
    \
     5
    {1,2,3,#,#,4,#,#,#,#,#,#,5}
     */
    // Prefer
    public static TreeNode generate(String str) {
        String[] splits = str.substring(str.indexOf("{") + 1, str.indexOf("}")).split(",");
        if (splits.length == 1 && splits[0].equals("#")) {
            return null;
        }
        if (splits.length == 1 && splits[0].equals("")) {
            return null;
        }
        int rootVal = Integer.parseInt(splits[0].trim());
        TreeNode root = new TreeNode(rootVal);

        recursive(root, splits, 0);
        return root;
    }

    private static void recursive(TreeNode node, String[] splits, int index) {
        int left = index * 2 + 1, right = (index + 1) * 2;

        if (left >= splits.length) {
            node.left = null;
        } else if (splits[left].equals("#")) {
            node.left = null;
        } else {
            node.left = new TreeNode(Integer.parseInt(splits[left].trim()));
            recursive(node.left, splits, left);
        }
        if (right >= splits.length) {
            node.right = null;
        } else if (splits[right].equals("#")) {
            node.right = null;
        } else {
            node.right = new TreeNode(Integer.parseInt(splits[right].trim()));
            recursive(node.right, splits, right);
        }
    }

    public static TreeNode generateBasedOnLevel(String str) {
        List<TreeNode> list = new LinkedList<TreeNode>();

        String[] splits = str.substring(str.indexOf("{") + 1, str.indexOf("}")).split(",");
        if (splits.length == 1 && splits[0].equals("#")) {
            return null;
        }
        if (splits.length == 1 && splits[0].equals("")) {
            return null;
        }

        TreeNode root = null;
        int index = 0;
        boolean left = true;
        for (String split : splits) {
            if (split.trim().equals("#")) {
                if (root == null) {
                    return null;
                } else if (!left) {
                    index++;
                }
                left = !left;
            } else {
                int val = Integer.parseInt(split.trim());
                TreeNode node = new TreeNode(val);
                list.add(node);
                if (root == null) {
                    root = node;
                } else {
                    if (left) {
                        list.get(index).left = node;
                    } else {
                        list.get(index).right = node;
                        index++;
                    }
                    left = !left;
                }
            }
        }
        return root;
    }
}

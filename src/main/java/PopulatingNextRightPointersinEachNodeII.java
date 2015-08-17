import object.TreeLinkNode;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/29
 * Time: 10:20
 */
/*
Follow up for problem "Populating Next Right Pointers in Each Node".

What if the given tree could be any binary tree? Would your previous solution still work?

Note:

You may only use constant extra space.
For example,
Given the following binary tree,
         1
       /  \
      2    3
     / \    \
    4   5    7
After calling your function, the tree should look like:
         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \    \
    4-> 5 -> 7 -> NULL
 */
public class PopulatingNextRightPointersinEachNodeII {
    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        TreeLinkNode head = root;
        TreeLinkNode nextHead = head.left;
        if (nextHead == null) {
            nextHead = head.right;
        }
        while (nextHead != null) {
            TreeLinkNode nextHeadStart = nextHead;
            while (head != null) {
                if (head.left == null && head.right == null) {
                    head = head.next;
                }
                else {
                    if (head.left != null) {
                        if (nextHead != head.left) {
                            nextHead.next = head.left;
                            nextHead = nextHead.next;
                        }
                    }
                    if (head.right != null) {
                        if (nextHead != head.right) {
                            nextHead.next = head.right;
                            nextHead = nextHead.next;
                        }
                    }
                    head = head.next;
                }
            }
            while (nextHeadStart != null && nextHeadStart.left == null && nextHeadStart.right == null) {
                nextHeadStart = nextHeadStart.next;
            }
            if (nextHeadStart == null) {
                break;
            } else {
                if (nextHeadStart.left != null) {
                    nextHead = nextHeadStart.left;
                } else {
                    nextHead = nextHeadStart.right;
                }
            }
            head = nextHeadStart;
        }
    }
}

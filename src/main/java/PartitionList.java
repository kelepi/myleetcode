import object.ListNode;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/28
 * Time: 11:20
 */

/*
Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

For example,
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5.
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode less = null, lessHead = null, more = null, moreHead = null;
        while (head != null) {
            if (head.val < x) {
                if (less == null) {
                    less = head;
                    lessHead = less;
                } else {
                    less.next = head;
                    less = less.next;
                }
            } else {
                if (more == null) {
                    more = head;
                    moreHead = more;
                } else {
                    more.next = head;
                    more = more.next;
                }
            }
            head = head.next;
        }
        if (more != null) {
            more.next = null;
        }
        if (less!=null) {
            less.next = moreHead;
            return lessHead;
        } else {
            return moreHead;
        }
    }
}

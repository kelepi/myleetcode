package leetcode;

import object.ListNode;

/**
 * Created by Patrick on 15/5/10.
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        return reverseListRec(head, null);
    }

    private ListNode reverseListRec(ListNode node, ListNode next) {
        if (node == null) {
            return next;
        }
        ListNode head = reverseListRec(node.next, node);
        node.next = next;
        return head;
    }
}

package leetcode;

import object.ListNode;

/**
 * Created by Patrick on 15/4/26.
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode next = head, prev = head;

        while (next != null) {
            if (next.val == val) {
                if (next == prev) {
                    next = next.next;
                    prev = next;
                    head.next = null;
                    head = next;
                } else if(next.next == null) {
                    next = null;
                    prev.next = null;
                } else {
                    prev.next = next.next;
                    next.next = null;
                    next = prev.next;
                }
            } else {
                prev = next;
                next = next.next;
            }
        }
        return head;
    }
}

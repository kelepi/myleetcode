package leetcode;

import object.ListNode;

/**
 * Created by Patrick on 15/4/28.
 */
/*
Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.

You may not alter the values in the nodes, only nodes itself may be changed.

Only constant memory is allowed.

For example,
Given this linked list: 1->2->3->4->5

For k = 2, you should return: 2->1->4->3->5

For k = 3, you should return: 3->2->1->4->5
 */
public class ReverseNodesinkGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) {
            return head;
        }
        ListNode roll = head, cutOff = null, start = head, end, tail;
        int n = k;
        while (roll != null) {
            end = roll;
            roll = roll.next;
            n--;
            if (n == 0) {
                tail = roll;
                if (cutOff == null) {
                    head = end;
                }
                reverse(cutOff, start, end, tail);
                n = k;
                cutOff = start;
                start = roll;
            }
        }
        return head;
    }

    private void reverse(ListNode cutOff, ListNode start, ListNode end, ListNode tail) {
        ListNode p1 = start, p2 = start.next;
        while (p1 != end) {
            ListNode p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        if (cutOff != null) {
            cutOff.next = end;
        }
        start.next = tail;
    }
}

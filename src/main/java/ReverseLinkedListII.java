import object.ListNode;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/24
 * Time: 10:21
 */

/*
Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.

Note:
Given m, n satisfy the following condition:
1 ≤ m ≤ n ≤ length of list.
 */
public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) {
            return head;
        }
        ListNode cutOff = head, newHead = head;
        int start = m, len = n - m;
        while (m > 1) {
            cutOff = newHead;
            newHead = newHead.next;
            m--;
        }
        ListNode newTail = newHead;
        ListNode next = newHead.next;
        cutOff.next = null;

        while (len > 0) {
            len--;
            ListNode temp = newHead;
            newHead = next;
            next = next.next;
            if (len == 0) {
                newTail.next = next;
            }
            newHead.next = temp;
        }
        if (start == 1) {
            head = newHead;
        } else {
            cutOff.next = newHead;
        }
        return head;
    }
}

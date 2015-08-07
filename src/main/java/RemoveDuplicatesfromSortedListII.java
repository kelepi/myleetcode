import object.ListNode;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/28
 * Time: 11:41
 */

/*
Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.
 */
public class RemoveDuplicatesfromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = null, cur = null;
        while (head != null) {
            head = nextNonDuplicate(head);
            if (cur == null) {
                cur = head;
                newHead = head;
            } else {
                cur.next = head;
                cur = cur.next;
            }
            if (head != null) {
                head = head.next;
            }
        }
        if (cur != null) {
            cur.next = null;
        }
        return newHead;
    }

    public ListNode nextNonDuplicate(ListNode l) {
        ListNode n = nextNonDuplicateImpl(l);
        while (true) {
            ListNode temp = nextNonDuplicateImpl(n);
            if (temp == n) {
                break;
            }
            n = temp;
        }
        return n;
    }

    public ListNode nextNonDuplicateImpl(ListNode l) {
        if (l == null) {
            return l;
        }
        ListNode next = l.next;
        while (next != null) {
            if (next.val != l.val) {
                break;
            } else {
                next = next.next;
            }
        }
        return next == l.next ? l : next;
    }
}

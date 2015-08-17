package leetcode;

import object.ListNode;

/**
 * Created by Patrick on 15/4/14.
 */
public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        if (headA == headB) {
            return headA;
        }
        ListNode idxA = headA, idxB = headB;
        while (idxA.next != null && idxB.next != null) {
            idxA = idxA.next;
            idxB = idxB.next;
        }
        if (idxA.next == null) {
            ListNode idxC = headB;
            while (idxB.next != null) {
                idxC = idxC.next;
                idxB = idxB.next;
            }
            idxA = headA;
            while (idxC != idxA) {
                idxA = idxA.next;
                idxC = idxC.next;
            }
            return idxA;
        }else {
            ListNode idxC = headA;
            while (idxA.next != null) {
                idxC = idxC.next;
                idxA = idxA.next;
            }
            idxB = headB;
            while (idxC != idxB) {
                idxB = idxB.next;
                idxC = idxC.next;
            }
            return idxB;
        }
    }
}

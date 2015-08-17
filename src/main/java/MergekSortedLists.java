import object.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/28
 * Time: 14:09
 */
/*
Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 */
public class MergekSortedLists {
    int cnt = 0;

    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<ListNode> arl = new ArrayList<ListNode>(lists.length);
        for (ListNode l : lists) {
            if (l != null) {
                arl.add(l);
                cnt++;
            }
        }

        Collections.sort(arl, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val > o2.val ? 1 : o1.val == o2.val ? 0 : -1;
            }
        });


        ListNode result = null, newHead = null;

        while (cnt > 0) {
            ListNode least = arl.get(0);
            if (result == null) {
                result = least;
                newHead = least;
            } else {
                result.next = least;
                result = result.next;
            }
            adjust(arl);
        }
        return newHead;
    }

    private void adjust(ArrayList<ListNode> arl) {
        ListNode node = arl.get(0);
        if (node.next == null) {
            arl.set(0, arl.get(cnt - 1));
            arl.set(cnt - 1, null);
            cnt--;
            if (cnt == 0) {
                return;
            }
        } else {
            arl.set(0, node.next);
        }
        reOrder(arl, 0, cnt);
    }

    private void reOrder(ArrayList<ListNode> arl, int src, int limit) {
        ListNode node = arl.get(src);
        int left = (src + 1) * 2 - 1;
        int right = left + 1;

        int dst = src, min = node.val;
        if (left < limit && arl.get(left).val < min) {
            min = arl.get(left).val;
            dst = left;
        }
        if (right < limit && arl.get(right).val < min) {
            dst = right;
        }
        if (dst != src) {
            arl.set(src, arl.get(dst));
            arl.set(dst, node);
            reOrder(arl, dst, limit);
        }
    }
}

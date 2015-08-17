package object;

/**
 * Created by Patrick on 15/4/25.
 */
public class ListNodeUtils {
    // 将 ints 数组转换成 ListNode
    public static ListNode toListNode(int[] ints) {
        if (ints.length == 0) {
            return null;
        }
        ListNode node = new ListNode(ints[0]);
        ListNode pointer = node;
        for (int i = 1; i != ints.length; i++) {
            int n = ints[i];
            ListNode nd = new ListNode(n);
            pointer.next = nd;
            pointer = pointer.next;
        }
        return node;
    }

    public static void printListNode(ListNode node) {
        System.out.print('{');
        while (node != null) {
            System.out.print(node.val + ", ");
            node = node.next;
        }
        System.out.print("}\n");
    }

    public static boolean isEqual(ListNode a, ListNode b) {
        while (a != null && b != null) {
            if (a.val != b.val) {
                return false;
            }
            a = a.next;
            b = b.next;
        }
        if (a != null || b != null) {
            return false;
        }
        return true;
    }
}

import leetcode.ReverseLinkedList;
import object.ListNode;
import object.ListNodeUtils;
import org.junit.Test;

/**
 * Created by Patrick on 15/5/10.
 */
public class TestReverseLinkedList {
    ReverseLinkedList r = new ReverseLinkedList();

    @Test
    public void testSample() throws Exception {
        int[] ints = {};
        ListNode l = ListNodeUtils.toListNode(ints);
        ListNode rev = r.reverseList(l);

        ListNodeUtils.printListNode(rev);
    }

    @Test
    public void testSample1() throws Exception {
        int[] ints = {1};
        ListNode l = ListNodeUtils.toListNode(ints);
        ListNode rev = r.reverseList(l);

        ListNodeUtils.printListNode(rev);
    }

    @Test
    public void testSample2() throws Exception {
        int[] ints = {1, 2};
        ListNode l = ListNodeUtils.toListNode(ints);
        ListNode rev = r.reverseList(l);

        ListNodeUtils.printListNode(rev);
    }

    @Test
    public void testSample3() throws Exception {
        int[] ints = {1, 2, 3};
        ListNode l = ListNodeUtils.toListNode(ints);
        ListNode rev = r.reverseList(l);

        ListNodeUtils.printListNode(rev);
    }

    @Test
    public void testSample4() throws Exception {
        int[] ints = {1, 2, 3, 4};
        ListNode l = ListNodeUtils.toListNode(ints);
        ListNode rev = r.reverseList(l);

        ListNodeUtils.printListNode(rev);
    }
}

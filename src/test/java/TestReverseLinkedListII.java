import object.ListNode;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/24
 * Time: 10:21
 */
public class TestReverseLinkedListII {
    ListNode makeList(int[] ints) {
        ListNode head = null;
        ListNode cur = null;
        for (int i : ints) {
            if (head == null) {
                head = new ListNode(i);
                cur = head;
            } else {
                ListNode node = new ListNode(i);
                cur.next = node;
                cur = cur.next;
            }
        }
        return head;
    }

    void print(ListNode l) {
        while (l != null) {
            System.out.print(l.val + "->");
            l = l.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    boolean equal(ListNode l, ListNode r) {
        while (l != null && r != null) {
            if (l.val != r.val) {
                return false;
            }
            l = l.next;
            r = r.next;
        }
        return l == null && r == null;
    }

    @Test
    public void testSample1() throws Exception {
        int[] ints = {1, 2, 3, 4, 5};
        ReverseLinkedListII r = new ReverseLinkedListII();
        ListNode raw = makeList(ints);
        print(raw);
        ListNode node = r.reverseBetween(raw, 2, 2);
        print(node);
        int[] ints2 = {1, 2, 3, 4, 5};
        ListNode result = makeList(ints2);
        assert equal(result, node);
    }

    @Test
    public void testSample2() throws Exception {
        int[] ints = {1, 2, 3, 4, 5};
        ReverseLinkedListII r = new ReverseLinkedListII();
        ListNode raw = makeList(ints);
        print(raw);
        ListNode node = r.reverseBetween(raw, 2, 3);
        print(node);
        int[] ints2 = {1, 3,2, 4, 5};
        ListNode result = makeList(ints2);
        assert equal(result, node);
    }

    @Test
    public void testSample() throws Exception {
        int[] ints = {1, 2, 3, 4, 5};
        ReverseLinkedListII r = new ReverseLinkedListII();
        ListNode raw = makeList(ints);
        print(raw);
        ListNode node = r.reverseBetween(raw, 2, 4);
        print(node);
        int[] ints2 = {1, 4, 3, 2, 5};
        ListNode result = makeList(ints2);
        assert equal(result, node);
    }

    @Test
    public void testSample4() throws Exception {
        int[] ints = {1, 2, 3, 4, 5};
        ReverseLinkedListII r = new ReverseLinkedListII();
        ListNode raw = makeList(ints);
        print(raw);
        ListNode node = r.reverseBetween(raw, 2, 5);
        print(node);
        int[] ints2 = {1, 5, 4, 3, 2};
        ListNode result = makeList(ints2);
        assert equal(result, node);
    }

    @Test
    public void testSample5() throws Exception {
        int[] ints = {1, 2, 3, 4, 5};
        ReverseLinkedListII r = new ReverseLinkedListII();
        ListNode raw = makeList(ints);
        print(raw);
        ListNode node = r.reverseBetween(raw, 1, 5);
        print(node);
        int[] ints2 = {5, 4, 3, 2, 1};
        ListNode result = makeList(ints2);
        assert equal(result, node);
    }

    @Test
    public void testSample6() throws Exception {
        int[] ints = {1, 2, 3, 4, 5};
        ReverseLinkedListII r = new ReverseLinkedListII();
        ListNode raw = makeList(ints);
        print(raw);
        ListNode node = r.reverseBetween(raw, 1, 4);
        print(node);
        int[] ints2 = {4, 3, 2, 1, 5};
        ListNode result = makeList(ints2);
        assert equal(result, node);
    }

    @Test
    public void testSample7() throws Exception {
        int[] ints = {1, 2, 3, 4, 5};
        ReverseLinkedListII r = new ReverseLinkedListII();
        ListNode raw = makeList(ints);
        print(raw);
        ListNode node = r.reverseBetween(raw, 1, 3);
        print(node);
        int[] ints2 = {3, 2, 1, 4, 5};
        ListNode result = makeList(ints2);
        assert equal(result, node);
    }

    @Test
    public void testSample8() throws Exception {
        int[] ints = {1};
        ReverseLinkedListII r = new ReverseLinkedListII();
        ListNode raw = makeList(ints);
        print(raw);
        ListNode node = r.reverseBetween(raw, 1, 1);
        print(node);
        int[] ints2 = {1};
        ListNode result = makeList(ints2);
        assert equal(result, node);
    }

    @Test
    public void testSample9() throws Exception {
        int[] ints = {1, 2};
        ReverseLinkedListII r = new ReverseLinkedListII();
        ListNode raw = makeList(ints);
        print(raw);
        ListNode node = r.reverseBetween(raw, 1, 2);
        print(node);
        int[] ints2 = {2, 1};
        ListNode result = makeList(ints2);
        assert equal(result, node);
    }

    @Test
    public void testSample10() throws Exception {
        int[] ints = {1, 2, 3};
        ReverseLinkedListII r = new ReverseLinkedListII();
        ListNode raw = makeList(ints);
        print(raw);
        ListNode node = r.reverseBetween(raw, 1, 2);
        print(node);
        int[] ints2 = {2, 1, 3};
        ListNode result = makeList(ints2);
        assert equal(result, node);
    }

    @Test
    public void testSample11() throws Exception {
        int[] ints = {1, 2, 3};
        ReverseLinkedListII r = new ReverseLinkedListII();
        ListNode raw = makeList(ints);
        print(raw);
        ListNode node = r.reverseBetween(raw, 2, 3);
        print(node);
        int[] ints2 = {1, 3, 2};
        ListNode result = makeList(ints2);
        assert equal(result, node);
    }

    @Test
    public void testSample12() throws Exception {
        int[] ints = {1, 2, 3};
        ReverseLinkedListII r = new ReverseLinkedListII();
        ListNode raw = makeList(ints);
        print(raw);
        ListNode node = r.reverseBetween(raw, 1, 3);
        print(node);
        int[] ints2 = {3, 2, 1};
        ListNode result = makeList(ints2);
        assert equal(result, node);
    }
}

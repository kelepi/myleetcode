import leetcode.IntersectionofTwoLinkedLists;
import object.ListNode;
import org.junit.Test;

/**
 * Created by Patrick on 15/4/14.
 */
public class TestIntersectionofTwoLinkedLists {
    @Test
    public void testSample() throws Exception {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);

        d.next = e;
        a.next = d;
        c.next = d;
        b.next = c;

        IntersectionofTwoLinkedLists intersection = new IntersectionofTwoLinkedLists();
        ListNode n = intersection.getIntersectionNode(a, b);
        assert n.val == 4;
        ListNode m = intersection.getIntersectionNode(b, a);
        assert m.val == 4;
    }
    @Test
    public void testSample2() throws Exception {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);

        a.next = b;

        IntersectionofTwoLinkedLists intersection = new IntersectionofTwoLinkedLists();
        ListNode n = intersection.getIntersectionNode(a, null);
        assert n == null;
        ListNode m = intersection.getIntersectionNode(null, a);
        assert m == null;
    }
    @Test
    public void testSample3() throws Exception {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);

        d.next = e;
        a.next = d;
        f.next = a;
        c.next = d;
        b.next = c;

        IntersectionofTwoLinkedLists intersection = new IntersectionofTwoLinkedLists();
        ListNode n = intersection.getIntersectionNode(b, a);
        assert n.val == 4;
        ListNode m = intersection.getIntersectionNode(b, a);
        assert n.val == 4;
    }
    @Test
    public void testSample4() throws Exception {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);

        a.next = b;
        b.next = c;
        d.next = e;
        e.next = f;

        IntersectionofTwoLinkedLists intersection = new IntersectionofTwoLinkedLists();
        ListNode n = intersection.getIntersectionNode(a, d);
        assert n == null;
        ListNode m = intersection.getIntersectionNode(d, a);
        assert m == null;
    }
}

import leetcode.ReverseNodesinkGroup;
import object.ListNode;
import object.ListNodeUtils;
import org.junit.Test;

/**
 * Created by Patrick on 15/4/28.
 */
public class TestReverseNodesinkGroup {
    ReverseNodesinkGroup r = new ReverseNodesinkGroup();

    @Test
    public void testSample() throws Exception {
        int[] ints = {1, 2, 3, 4, 5};
        System.out.print("Result for list: [");
        for (int i : ints) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
        for (int i = 0; i != ints.length + 2; i++) {
            System.out.print("k = " + i + ": ");
            ListNode list = ListNodeUtils.toListNode(ints);
            ListNode l = r.reverseKGroup(list, i);
            ListNodeUtils.printListNode(l);
        }
    }

    @Test
    public void testSample2() throws Exception {
        int[] ints = {1};
        System.out.print("Result for list: [");
        for (int i : ints) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
        for (int i = 0; i != ints.length + 2; i++) {
            System.out.print("k = " + i + ": ");
            ListNode list = ListNodeUtils.toListNode(ints);
            ListNode l = r.reverseKGroup(list, i);
            ListNodeUtils.printListNode(l);
        }
    }

    @Test
    public void testSample3() throws Exception {
        int[] ints = {1, 2};
        System.out.print("Result for list: [");
        for (int i : ints) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
        for (int i = 0; i != ints.length + 2; i++) {
            System.out.print("k = " + i + ": ");
            ListNode list = ListNodeUtils.toListNode(ints);
            ListNode l = r.reverseKGroup(list, i);
            ListNodeUtils.printListNode(l);
        }
    }

    @Test
    public void testSample4() throws Exception {
        int[] ints = {1, 2, 3};
        System.out.print("Result for list: [");
        for (int i : ints) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
        for (int i = 0; i != ints.length + 2; i++) {
            System.out.print("k = " + i + ": ");
            ListNode list = ListNodeUtils.toListNode(ints);
            ListNode l = r.reverseKGroup(list, i);
            ListNodeUtils.printListNode(l);
        }
    }

    @Test
    public void testSample5() throws Exception {
        int[] ints = {1, 2, 3, 4};
        System.out.print("Result for list: [");
        for (int i : ints) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
        for (int i = 0; i != ints.length + 2; i++) {
            System.out.print("k = " + i + ": ");
            ListNode list = ListNodeUtils.toListNode(ints);
            ListNode l = r.reverseKGroup(list, i);
            ListNodeUtils.printListNode(l);
        }
    }
}

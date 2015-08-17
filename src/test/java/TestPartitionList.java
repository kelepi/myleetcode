import object.ListNode;
import object.ListNodeUtils;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/28
 * Time: 11:24
 */
public class TestPartitionList {
    @Test
    public void testSample() throws Exception {
        int[] ints = {1, 4, 3, 2, 5, 2};
        ListNode node = ListNodeUtils.makeList(ints);
        ListNodeUtils.print(node);

        PartitionList p = new PartitionList();
        ListNode l = p.partition(node, 3);
        ListNodeUtils.print(l);
    }

    @Test
    public void testSample2() throws Exception {
        int[] ints = {1, 4, 3, 2, 5, 2};
        ListNode node = ListNodeUtils.makeList(ints);
        ListNodeUtils.print(node);

        PartitionList p = new PartitionList();
        ListNode l = p.partition(node, 0);
        ListNodeUtils.print(l);
    }

    @Test
    public void testSample3() throws Exception {
        int[] ints = {1, 4, 3, 2, 5, 2};
        ListNode node = ListNodeUtils.makeList(ints);
        ListNodeUtils.print(node);

        PartitionList p = new PartitionList();
        ListNode l = p.partition(node, 6);
        ListNodeUtils.print(l);
    }

    @Test
    public void testSample4() throws Exception {
        int[] ints = {1, 4, 3, 2, 5, 2};
        ListNode node = ListNodeUtils.makeList(ints);
        ListNodeUtils.print(node);

        PartitionList p = new PartitionList();
        ListNode l = p.partition(node, 1);
        ListNodeUtils.print(l);
    }

    @Test
    public void testSample5() throws Exception {
        int[] ints = {1, 4, 3, 2, 5, 2};
        ListNode node = ListNodeUtils.makeList(ints);
        ListNodeUtils.print(node);

        PartitionList p = new PartitionList();
        ListNode l = p.partition(node, 5);
        ListNodeUtils.print(l);
    }

    @Test
    public void testSample6() throws Exception {
        int[] ints = {1, 4, 3, 2, 5, 2};
        ListNode node = ListNodeUtils.makeList(ints);
        ListNodeUtils.print(node);

        PartitionList p = new PartitionList();
        ListNode l = p.partition(node, 2);
        ListNodeUtils.print(l);
    }

    @Test
    public void testSample7() throws Exception {
        int[] ints = {1, 4, 3, 2, 5, 2};
        ListNode node = ListNodeUtils.makeList(ints);
        ListNodeUtils.print(node);

        PartitionList p = new PartitionList();
        ListNode l = p.partition(node, 3);
        ListNodeUtils.print(l);
    }

    @Test
    public void testSample8() throws Exception {
        int[] ints = {1, 4, 3, 2, 5, 2};
        ListNode node = ListNodeUtils.makeList(ints);
        ListNodeUtils.print(node);

        PartitionList p = new PartitionList();
        ListNode l = p.partition(node, 4);
        ListNodeUtils.print(l);
    }
}

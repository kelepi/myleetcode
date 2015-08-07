import object.ListNode;
import object.ListNodeUtils;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/28
 * Time: 13:35
 */
public class TestRemoveDuplicatesfromSortedListII {
    @Test
    public void testSample() throws Exception {
        int[] ints = {1, 2, 3, 3, 4, 4, 5};
        ListNode l = ListNodeUtils.makeList(ints);
        ListNodeUtils.print(l);

        RemoveDuplicatesfromSortedListII r = new RemoveDuplicatesfromSortedListII();
        ListNode re = r.deleteDuplicates(l);

        ListNodeUtils.print(re);
    }

    @Test
    public void testSample2() throws Exception {
        int[] ints = {1, 1, 1, 2, 3};
        ListNode l = ListNodeUtils.makeList(ints);
        ListNodeUtils.print(l);

        RemoveDuplicatesfromSortedListII r = new RemoveDuplicatesfromSortedListII();
        ListNode re = r.deleteDuplicates(l);

        ListNodeUtils.print(re);
    }

    @Test
    public void testSample4() throws Exception {
        int[] ints = {1, 1, 1, 2, 3, 4, 4, 4};
        ListNode l = ListNodeUtils.makeList(ints);
        ListNodeUtils.print(l);

        RemoveDuplicatesfromSortedListII r = new RemoveDuplicatesfromSortedListII();
        ListNode re = r.deleteDuplicates(l);

        ListNodeUtils.print(re);
    }

    @Test
    public void testSample5() throws Exception {
        int[] ints = {1, 2, 3, 4};
        ListNode l = ListNodeUtils.makeList(ints);
        ListNodeUtils.print(l);

        RemoveDuplicatesfromSortedListII r = new RemoveDuplicatesfromSortedListII();
        ListNode re = r.deleteDuplicates(l);

        ListNodeUtils.print(re);
    }

    @Test
    public void testSample6() throws Exception {
        int[] ints = {1};
        ListNode l = ListNodeUtils.makeList(ints);
        ListNodeUtils.print(l);

        RemoveDuplicatesfromSortedListII r = new RemoveDuplicatesfromSortedListII();
        ListNode re = r.deleteDuplicates(l);

        ListNodeUtils.print(re);
    }

    @Test
    public void testSample7() throws Exception {
        int[] ints = {1, 2};
        ListNode l = ListNodeUtils.makeList(ints);
        ListNodeUtils.print(l);

        RemoveDuplicatesfromSortedListII r = new RemoveDuplicatesfromSortedListII();
        ListNode re = r.deleteDuplicates(l);

        ListNodeUtils.print(re);
    }

    @Test
    public void testSample8() throws Exception {
        int[] ints = {1, 2, 3};
        ListNode l = ListNodeUtils.makeList(ints);
        ListNodeUtils.print(l);

        RemoveDuplicatesfromSortedListII r = new RemoveDuplicatesfromSortedListII();
        ListNode re = r.deleteDuplicates(l);

        ListNodeUtils.print(re);
    }

    @Test
    public void testSample9() throws Exception {
        int[] ints = {1, 1, 1};
        ListNode l = ListNodeUtils.makeList(ints);
        ListNodeUtils.print(l);

        RemoveDuplicatesfromSortedListII r = new RemoveDuplicatesfromSortedListII();
        ListNode re = r.deleteDuplicates(l);

        ListNodeUtils.print(re);
    }

    @Test
    public void testSample10() throws Exception {
        int[] ints = {1, 2, 2, 2, 2};
        ListNode l = ListNodeUtils.makeList(ints);
        ListNodeUtils.print(l);

        RemoveDuplicatesfromSortedListII r = new RemoveDuplicatesfromSortedListII();
        ListNode re = r.deleteDuplicates(l);

        ListNodeUtils.print(re);
    }

    @Test
    public void testNextNonDuplicate() throws Exception {
        RemoveDuplicatesfromSortedListII r = new RemoveDuplicatesfromSortedListII();
        int[] ints = {1};
        ListNode l = ListNodeUtils.makeList(ints);
        ListNode re = r.nextNonDuplicate(l);
        ListNodeUtils.print(re);
    }

    @Test
    public void testNextNonDuplicate2() throws Exception {
        RemoveDuplicatesfromSortedListII r = new RemoveDuplicatesfromSortedListII();
        int[] ints = {1, 1};
        ListNode l = ListNodeUtils.makeList(ints);
        ListNode re = r.nextNonDuplicate(l);
        ListNodeUtils.print(re);
    }

    @Test
    public void testNextNonDuplicate3() throws Exception {
        RemoveDuplicatesfromSortedListII r = new RemoveDuplicatesfromSortedListII();
        int[] ints = {1, 1, 3};
        ListNode l = ListNodeUtils.makeList(ints);
        ListNode re = r.nextNonDuplicate(l);
        ListNodeUtils.print(re);
    }

    @Test
    public void testNextNonDuplicate4() throws Exception {
        RemoveDuplicatesfromSortedListII r = new RemoveDuplicatesfromSortedListII();
        int[] ints = {1, 1, 1, 1, 3, 3};
        ListNode l = ListNodeUtils.makeList(ints);
        ListNode re = r.nextNonDuplicate(l);
        ListNodeUtils.print(re);
    }

    @Test
    public void testNextNonDuplicate5() throws Exception {
        RemoveDuplicatesfromSortedListII r = new RemoveDuplicatesfromSortedListII();
        int[] ints = {1, 1, 1, 1, 3, 3, 4, 4, 4, 5, 6, 6};
        ListNode l = ListNodeUtils.makeList(ints);
        ListNode re = r.nextNonDuplicate(l);
        ListNodeUtils.print(re);
    }
}

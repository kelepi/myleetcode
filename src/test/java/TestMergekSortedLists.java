import object.ListNode;
import object.ListNodeUtils;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/28
 * Time: 14:28
 */
public class TestMergekSortedLists {
    @Test
    public void testSample1() throws Exception {
        int[][] intss = {
                {1, 3, 5},
                {2, 4, 6},
                {7},
                {}
        };
        ListNode[] lists = ListNodeUtils.makeLists(intss);

        MergekSortedLists m = new MergekSortedLists();
        ListNode n = m.mergeKLists(lists);
        ListNodeUtils.print(n);
    }
    @Test
    public void testSample2() throws Exception {
        int[][] intss = {
                {1, 3, 5, 19},
                {2, 4, 6, 18, 29},
                {7, 31},
                {}
        };
        ListNode[] lists = ListNodeUtils.makeLists(intss);

        MergekSortedLists m = new MergekSortedLists();
        ListNode n = m.mergeKLists(lists);
        ListNodeUtils.print(n);
    }

    /*
    in 0.789 s
    in 0.39 s
     */
    @Test
    public void testTLE() throws Exception {
        String file = "MergekSortedLists_txt1";
        ListNode[] lists = ListNodeUtils.makeListsFromFile(file);

        MergekSortedLists m = new MergekSortedLists();
        ListNode n = m.mergeKLists(lists);
        ListNodeUtils.print(n);
    }
}

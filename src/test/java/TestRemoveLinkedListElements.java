import leetcode.RemoveLinkedListElements;
import object.ListNode;
import object.ListNodeUtils;
import org.junit.Test;

/**
 * Created by Patrick on 15/4/26.
 */
public class TestRemoveLinkedListElements {
    RemoveLinkedListElements r = new RemoveLinkedListElements();
    @Test
    public void testSample() throws Exception {
        int[] ints = {1};
        int[] t = {1};
        int val = 0;
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNode ans = ListNodeUtils.toListNode(t);
        ListNode re = r.removeElements(list, val);
        assert ListNodeUtils.isEqual(ans, re);
    }
    @Test
    public void testSample2() throws Exception {
        int[] ints = {1};
        int[] t = {};
        int val = 1;
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNode ans = ListNodeUtils.toListNode(t);
        ListNode re = r.removeElements(list, val);
        assert ListNodeUtils.isEqual(ans, re);
    }
    @Test
    public void testSample3() throws Exception {
        int[] ints = {1,2};
        int[] t = {1,2};
        int val = 0;
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNode ans = ListNodeUtils.toListNode(t);
        ListNode re = r.removeElements(list, val);
        assert ListNodeUtils.isEqual(ans, re);
    }
    @Test
    public void testSample4() throws Exception {
        int[] ints = {1,2};
        int[] t = {2};
        int val = 1;
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNode ans = ListNodeUtils.toListNode(t);
        ListNode re = r.removeElements(list, val);
        assert ListNodeUtils.isEqual(ans, re);
    }
    @Test
    public void testSample5() throws Exception {
        int[] ints = {1,2};
        int[] t = {1};
        int val = 2;
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNode ans = ListNodeUtils.toListNode(t);
        ListNode re = r.removeElements(list, val);
        assert ListNodeUtils.isEqual(ans, re);
    }
    @Test
    public void testSample6() throws Exception {
        int[] ints = {1,1};
        int[] t = {1,1};
        int val = 2;
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNode ans = ListNodeUtils.toListNode(t);
        ListNode re = r.removeElements(list, val);
        assert ListNodeUtils.isEqual(ans, re);
    }
    @Test
    public void testSample7() throws Exception {
        int[] ints = {1,1};
        int[] t = {};
        int val = 1;
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNode ans = ListNodeUtils.toListNode(t);
        ListNode re = r.removeElements(list, val);
        assert ListNodeUtils.isEqual(ans, re);
    }
    @Test
    public void testSample31() throws Exception {
        int[] ints = {1,1,1};
        int[] t = {};
        int val = 1;
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNode ans = ListNodeUtils.toListNode(t);
        ListNode re = r.removeElements(list, val);
        assert ListNodeUtils.isEqual(ans, re);
    }
    @Test
    public void testSample32() throws Exception {
        int[] ints = {1,1,1};
        int[] t = {1,1,1};
        int val = 0;
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNode ans = ListNodeUtils.toListNode(t);
        ListNode re = r.removeElements(list, val);
        assert ListNodeUtils.isEqual(ans, re);
    }
    @Test
    public void testSample33() throws Exception {
        int[] ints = {1,1,2};
        int[] t = {2};
        int val = 1;
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNode ans = ListNodeUtils.toListNode(t);
        ListNode re = r.removeElements(list, val);
        assert ListNodeUtils.isEqual(ans, re);
    }
    @Test
    public void testSample34() throws Exception {
        int[] ints = {1,1,2};
        int[] t = {1,1};
        int val = 2;
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNode ans = ListNodeUtils.toListNode(t);
        ListNode re = r.removeElements(list, val);
        assert ListNodeUtils.isEqual(ans, re);
    }
    @Test
    public void testSample35() throws Exception {
        int[] ints = {1,1,2};
        int[] t = {1,1,2};
        int val = 22;
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNode ans = ListNodeUtils.toListNode(t);
        ListNode re = r.removeElements(list, val);
        assert ListNodeUtils.isEqual(ans, re);
    }
    @Test
    public void testSample36() throws Exception {
        int[] ints = {1,2,3};
        int[] t = {1,2,3};
        int val = 22;
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNode ans = ListNodeUtils.toListNode(t);
        ListNode re = r.removeElements(list, val);
        assert ListNodeUtils.isEqual(ans, re);
    }
    @Test
    public void testSample37() throws Exception {
        int[] ints = {1,2,3};
        int[] t = {1,3};
        int val = 2;
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNode ans = ListNodeUtils.toListNode(t);
        ListNode re = r.removeElements(list, val);
        assert ListNodeUtils.isEqual(ans, re);
    }
    @Test
    public void testSample38() throws Exception {
        int[] ints = {1,2,3};
        int[] t = {2,3};
        int val = 1;
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNode ans = ListNodeUtils.toListNode(t);
        ListNode re = r.removeElements(list, val);
        assert ListNodeUtils.isEqual(ans, re);
    }
    @Test
    public void testSample39() throws Exception {
        int[] ints = {1,2,3};
        int[] t = {1,2};
        int val = 3;
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNode ans = ListNodeUtils.toListNode(t);
        ListNode re = r.removeElements(list, val);
        assert ListNodeUtils.isEqual(ans, re);
    }
    @Test
    public void testSample40() throws Exception {
        int[] ints = {1,2,3,4};
        int[] t = {1,2,3};
        int val = 4;
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNode ans = ListNodeUtils.toListNode(t);
        ListNode re = r.removeElements(list, val);
        assert ListNodeUtils.isEqual(ans, re);
    }
    @Test
    public void testSample41() throws Exception {
        int[] ints = {1,2,3,4};
        int[] t = {1,2,4};
        int val = 3;
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNode ans = ListNodeUtils.toListNode(t);
        ListNode re = r.removeElements(list, val);
        assert ListNodeUtils.isEqual(ans, re);
    }
    @Test
    public void testSample42() throws Exception {
        int[] ints = {1,2,3,4};
        int[] t = {1,3,4};
        int val = 2;
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNode ans = ListNodeUtils.toListNode(t);
        ListNode re = r.removeElements(list, val);
        assert ListNodeUtils.isEqual(ans, re);
    }
    @Test
    public void testSample43() throws Exception {
        int[] ints = {1,2,3,4};
        int[] t = {2,3,4};
        int val = 1;
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNode ans = ListNodeUtils.toListNode(t);
        ListNode re = r.removeElements(list, val);
        assert ListNodeUtils.isEqual(ans, re);
    }
    @Test
    public void testSample44() throws Exception {
        int[] ints = {1,2,3,4};
        int[] t = {1,2,3,4};
        int val = 0;
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNode ans = ListNodeUtils.toListNode(t);
        ListNode re = r.removeElements(list, val);
        assert ListNodeUtils.isEqual(ans, re);
    }
    @Test
    public void testSample45() throws Exception {
        int[] ints = {1,2,2,4};
        int[] t = {1,4};
        int val = 2;
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNode ans = ListNodeUtils.toListNode(t);
        ListNode re = r.removeElements(list, val);
        assert ListNodeUtils.isEqual(ans, re);
    }
}

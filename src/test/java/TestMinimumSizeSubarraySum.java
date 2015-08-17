import leetcode.MinimumSizeSubarraySum;
import org.junit.Test;

/**
 * Created by Patrick on 15/5/12.
 */
public class TestMinimumSizeSubarraySum {
    MinimumSizeSubarraySum m = new MinimumSizeSubarraySum();

    @Test
    public void testSample() throws Exception {
        int[] ints = {1, 1, 1};
        assert 0 == m.minSubArrayLen(4, ints);
    }

    @Test
    public void testSample2() throws Exception {
        int[] ints = {2, 3, 1, 2, 4, 3, 1};
        assert 2 == m.minSubArrayLen(7, ints);
    }

    @Test
    public void testSample3() throws Exception {
        int[] ints = {1, 2, 3, 4, 5};
        assert 3 == m.minSubArrayLen(11, ints);
    }

    @Test
    public void testSample4() throws Exception {
        int[] ints = {1, 2, 3, 4, 5, 1, 2, 1, 9, 2, 1, 2, 1, 13};
        assert 1 == m.minSubArrayLen(11, ints);
    }

    @Test
    public void testSample5() throws Exception {
        int[] ints = {1, 2, 3, 4, 5, 1, 2, 1, 9, 2, 1, 2, 1};
        assert 2 == m.minSubArrayLen(11, ints);
    }
}

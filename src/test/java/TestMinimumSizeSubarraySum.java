import leetcode.MinimumSizeSubarraySum;
import org.junit.Test;

/**
 * Created by Patrick on 15/5/12.
 * User: yf_liu
 * Date: 2015/5/22
 * Time: 14:03
>>>>>>> aa08ea09ede35769a105690eb01a986c6c263c49
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
        int[] ints2 = {2, 3, 1, 7, 2, 4, 3};
        assert m.minSubArrayLen(7, ints) == 1;
        assert m.minSubArrayLen(33, ints) == 0;
    }

    /*
Input:	11, [1,2,3,4,5]
Output:	2
Expected:	3
     */
    @Test
    public void testError() throws Exception {
        int[] ints = {1,2,3,4,5};
        assert m.minSubArrayLen(11, ints) == 3;
        assert m.minSubArrayLen(15, ints) == 5;
        assert m.minSubArrayLen(14, ints) == 4;
        assert m.minSubArrayLen(16, ints) == 0;
        assert m.minSubArrayLen(3, ints) == 1;
    }
}

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/22
 * Time: 14:03
 */
public class TestMinimumSizeSubarraySum {
    MinimumSizeSubarraySum m = new MinimumSizeSubarraySum();

    @Test
    public void testSample() throws Exception {
        int[] ints = {2, 3, 1, 7, 2, 4, 3};
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

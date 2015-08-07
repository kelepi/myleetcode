import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/11
 * Time: 14:10
 */
public class TestTrappingRainWater {
    TrappingRainWater tr = new TrappingRainWater();

    @Test
    public void testSample() throws Exception {
        int[] ints = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int sum = tr.trap(ints);
        assert sum == 6;
    }
}

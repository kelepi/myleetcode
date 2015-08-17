import leetcode.LargestRectangleinHistogram;
import org.junit.Test;

/**
 * Created by Patrick on 15/5/11.
 */
public class TestLargestRectangleinHistogram {
    LargestRectangleinHistogram l = new LargestRectangleinHistogram();

    @Test
    public void testSample() throws Exception {
        int[] ints = {2, 1, 5, 6, 2, 3};
        assert l.largestRectangleArea(ints) == 10;
    }

    @Test
    public void testSample2() throws Exception {
        int[] ints2 = {6, 2, 5, 4, 5, 1, 6};
        assert l.largestRectangleArea(ints2) == 12;
    }
}

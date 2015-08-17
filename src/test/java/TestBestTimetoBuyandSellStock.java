import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/6/2
 * Time: 19:28
 */
public class TestBestTimetoBuyandSellStock {
    BestTimetoBuyandSellStock b = new BestTimetoBuyandSellStock();

    @Test
    public void testSample() throws Exception {
        int[] ints = {};
        assert b.maxProfit(null) == 0;
        assert b.maxProfit(ints) == 0;
        int[] ints2 = {1};
        assert b.maxProfit(ints2) == 0;
        int[] ints3 = {2, 1};
        assert b.maxProfit(ints3) == 0;
    }

    @Test
    public void testSample2() throws Exception {
        int[] ints = {1, 3, 2, 5, 3};
        assert b.maxProfit(ints) == 4;
    }

    @Test
    public void testSample3() throws Exception {
        int[] ints = {2, 3, 1, 5, 3};
        assert b.maxProfit(ints) == 4;
    }
}

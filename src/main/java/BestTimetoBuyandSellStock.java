/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/6/2
 * Time: 19:23
 */
public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        return maxProfit(prices, 0, prices.length);
    }

    private int maxProfit(int[] prices, int start, int end) {
        if (end < start || end > prices.length) {
            return 0;
        }
        int maxSofar = 0, maxProfit = 0;
        for (int i = end - 1; i >= start; i--) {
            if (i == end - 1) {
                maxSofar = prices[i];
            } else {
                if (prices[i] > maxSofar) {
                    maxSofar = prices[i];
                } else if (prices[i] < maxSofar) {
                    maxProfit = Math.max(maxProfit, maxSofar - prices[i]);
                }
            }
        }
        return maxProfit;
    }
    // [,)
}

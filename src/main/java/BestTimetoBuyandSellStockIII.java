/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/6/2
 * Time: 19:02
 */
/*
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete at most two transactions.

Note:
You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 */
public class BestTimetoBuyandSellStockIII {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int[] left = new int[prices.length];
        int[] right = new int[prices.length];

        int maxSofar = 0, minSofar = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i == 0) {
                minSofar = prices[i];
            } else {
                if (prices[i] >= minSofar) {
                    maxSofar = Math.max(maxSofar, prices[i] - minSofar);
                    left[i] = maxSofar;
                } else {
                    minSofar = prices[i];
                    left[i] = maxSofar;
                }
            }
        }

        maxSofar = 0;
        int maxPrice = 0;

        for (int i = prices.length - 1; i >= 0; i--) {
            if (i == prices.length - 1) {
                maxPrice = prices[i];
            } else {
                if (prices[i] >= maxPrice) {
                    maxPrice = prices[i];
                    right[i] = maxSofar;
                } else {
                    maxSofar = Math.max(maxSofar, maxPrice - prices[i]);
                    right[i] = maxSofar;
                }
            }
        }

        int max = 0;
        for (int i = 0; i != left.length; i++) {
            max = Math.max(max, left[i] + right[i]);
        }
        return max;
    }
}

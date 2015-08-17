package leetcode;

/**
 * Created by Patrick on 15/6/13.
 */
public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        int result = 0;
        if (Math.abs(dividend) < Math.abs(divisor) || dividend == 0 || divisor == 0) {
            return result;
        }
        boolean isPositive = true;
        if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) {
            isPositive = false;
        }
        if (divisor == 1 && dividend == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        return result;
    }
}

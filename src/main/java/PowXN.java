/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/22
 * Time: 14:09
 */
public class PowXN {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        boolean rem = false;
        if (n < 0) {
            x = 1.0 / x;
            if (n == Integer.MIN_VALUE) {
                n = Integer.MAX_VALUE;
                rem = true;
            } else {
                n = -n;
            }
        }
        double d = n % 2 == 0 ? myPow(x * x, n / 2) : myPow(x * x, n / 2) * x;
        if (rem) {
            d = d * x;
        }
        return d;
    }
}

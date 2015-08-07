/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/4
 * Time: 13:41
 */
/*
Description:

Count the number of prime numbers less than a non-negative number, n

11
3,5,7,9
 */
public class CountPrimes {
    public int countPrimes(int n) {
        n--;
        if (n < 2) {
            return 0;
        }
        boolean[] nums = new boolean[(n - 1) / 2];
        int cnt = 1;
        for (int i = 3; i <= n; i += 2) {
            if (!nums[(i - 3) / 2]) {
                cnt++;
                int temp = i;
                while (temp <= n) {
                    if (temp % 2 != 0) {
                        nums[(temp - 3) / 2] = true;
                    }
                    temp += i;
                }
            }
        }
        return cnt;
    }
}

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/19
 * Time: 9:48
 */
/*
The gray code is a binary numeral system where two successive values differ in only one bit.

Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.

For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:

00 - 0
01 - 1
11 - 3
10 - 2
Note:
For a given n, a gray code sequence is not uniquely defined.

For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.

For now, the judge is able to judge based on one instance of gray code sequence. Sorry about that.
 */
public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<Integer>();
        if (n < 0) {
            return list;
        }
        boolean[] flags = new boolean[n];
        grayCodeImpl(n, 0, 0, flags, list);
        return list;
    }

    private int grayCodeImpl(int n, int i, int sum, boolean[] flags, List<Integer> list) {
        if (i == n) {
            list.add(sum);
            return sum;
        } else {
            sum = grayCodeImpl(n, i + 1, sum, flags, list);
            if (flags[i]) {
                flags[i] = false;
                sum -= 1 << (n - i - 1);
            } else {
                flags[i] = true;
                sum += 1 << (n - i - 1);
            }
            return grayCodeImpl(n, i + 1, sum, flags, list);
        }
    }
}

package leetcode;

/**
 * Created by Patrick on 15/4/8.
 */
public class Numberof1Bits {
    public int hammingWeight(int n) {
        return n == 0 ? 0 : 1 + hammingWeight(n & (n - 1));
    }
}

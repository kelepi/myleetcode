package leetcode;

/**
 * Created by Patrick on 15/4/14.
 */
public class StringtoInteger {
    public int myAtoi(String str) {
        str = str.trim();
        if (str.isEmpty() || str.startsWith("+-") || str.startsWith("++") || str.startsWith("--") || str.startsWith("-+")) {
            return 0;
        }
        int idx = 0, pn = 1, n = 0;
        if (str.charAt(idx) == '+') {
            idx++;
        }
        if (str.charAt(idx) == '-') {
            pn = -1;
            idx++;
        }
        while (idx != str.length()) {
            char c = str.charAt(idx);
            if (!(c >= '0' && c <= '9')) {
                break;
            }
            if (n == 0) {
                n += c - '0';
                n *= pn;
            } else {
                if (n * 10 /10 != n) {
                    return pn == 1? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                n *= 10;
                if (pn == 1 && n < 0) {
                    return Integer.MAX_VALUE;
                }
                if (pn == -1 && n > 0) {
                    return Integer.MIN_VALUE;
                }
                if (pn == 1) {
                    n += c - '0';
                } else {
                    n -= c - '0';
                }
                if (pn == 1 && n < 0) {
                    return Integer.MAX_VALUE;
                }
                if (pn == -1 && n > 0) {
                    return Integer.MIN_VALUE;
                }
            }
            idx++;
        }
        return n;
    }
}

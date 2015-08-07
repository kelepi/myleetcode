/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/6/1
 * Time: 10:23
 */
/*
A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
Given an encoded message containing digits, determine the total number of ways to decode it.

For example,
Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

The number of ways decoding "12" is 2.
 */
public class DecodeWays {
    public int numDecodings(String s) {
        if (s.isEmpty() || s.startsWith("0")) {
            return 0;
        }
        int[] ints = new int[s.length() + 2];
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                if (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2') {
                    ints[i] = ints[i + 1];
                } else {
                    return 0;
                }
            } else {
                if (i + 1 < s.length() && s.charAt(i + 1) == '0') {
                    if (i + 2 < s.length()) {
                        ints[i] = ints[i + 1];
                    } else {
                        ints[i] = 1;
                    }
                } else {
                    if (ints[i + 1] == 0) {
                        ints[i] += 1;
                    } else {
                        ints[i] = ints[i + 1];
                    }
                    if (i + 2 > s.length()) {
                        continue;
                    } else if (i + 2 == s.length()) {
                        int n = Integer.parseInt(s.substring(i, i + 2));
                        if (n <= 26) {
                            ints[i] += 1;
                        }
                    } else {
                        int n = Integer.parseInt(s.substring(i, i + 2));
                        if (n <= 26) {
                            ints[i] += ints[i + 2];
                        }
                    }
                }
            }
        }
        return ints[0];
    }
}

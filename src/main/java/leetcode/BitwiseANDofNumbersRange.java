package leetcode;

import utils.Utils;

/**
 * Created by Patrick on 15/5/10.
 */
/*
Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.

For example, given the range [5, 7], you should return 4.
 */
public class BitwiseANDofNumbersRange {
    public int rangeBitwiseAnd(int m, int n) {
        int[] limit = new int[31];
        for (int i = 1; i != limit.length; i++) {
            limit[i] = 1 << i;
        }
        for (int i = limit.length - 1; i >= 0; i--) {
            if (n >= limit[i]) {
                if (m >= limit[i]) {
                    int[] am = intToBytesArray(m);
                    int[] an = intToBytesArray(n);

                    int num = 0;
                    boolean match = false;
                    for (int idx = 0; idx != 32; idx++) {
                        if (am[idx] == an[idx]) {
                            if (am[idx] == 1 && an[idx] == 1) {
                                if (!match) {
                                    match = true;
                                }
                                num += 1 << (32 - idx - 1);
                            }
                        } else {
                            if (match) {
                                break;
                            }
                        }
                    }
                    return num;
                } else {
                    return 0;
                }
            }
        }
        return 0;
    }

    int[] intToBytesArray(int num) {
        int[] ints = new int[32];
        for (int i = ints.length - 1; i >= 0; i--) {
            if (num == 0) {
                break;
            }
            ints[i] = num % 2;
            num = num >> 1;
        }
        return ints;
    }
}

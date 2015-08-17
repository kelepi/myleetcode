package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Patrick on 15/5/17.
 */
public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<Integer>();
        if (n < 0) {
            return list;
        }
        list.add(0);
        int[] ints = new int[n];
        boolean[] changed = new boolean[n];

        int idx = n - 1, sum = 0;
        while (idx >= 0) {
            for (int i = idx; i != n; i++) {
                changed[i] = false;
            }
            sum = grayCodeImpl(n, ints, changed, idx, sum, list);
            idx--;
        }
        return list;
    }

    private int grayCodeImpl(int n, int[] ints, boolean[] changed, int idx, int sum, List<Integer> list) {
        if (idx == n) {
            return sum;
        }
        if (ints[idx] == 1) {
            ints[idx] = 0;
            sum -= 1 << (n - idx - 1);
        } else {
            ints[idx] = 1;
            sum += 1 << (n - idx - 1);
        }
        sum = grayCodeImpl(n, ints, changed, idx + 1, sum, list);

        list.add(sum);
        changed[idx] = true;
        return sum;
    }
}

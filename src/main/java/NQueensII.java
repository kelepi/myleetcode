/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/19
 * Time: 14:16
 */
public class NQueensII {
    public int totalNQueens(int n) {
        int[] ints = new int[n];
        return solveNQueuesImpl(ints, 0, ints.length, 0);
    }

    private int solveNQueuesImpl(int[] ints, int idx, int len, int cnt) {
        if (idx == len) {
            return cnt + 1;
        } else {
            for (int i = 0; i != len; i++) {
                boolean valid = true;
                for (int j = 0; j != idx; j++) {
                    if (ints[j] == i || Math.abs(ints[j] - i) == (idx - j)) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    ints[idx] = i;
                    cnt = solveNQueuesImpl(ints, idx + 1, len, cnt);
                }
            }
            return cnt;
        }
    }
}

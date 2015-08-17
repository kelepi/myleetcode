import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/19
 * Time: 13:42
 */
/*
The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.



Given an integer n, return all distinct solutions to the n-queens puzzle.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.

For example,
There exist two distinct solutions to the 4-queens puzzle:

[
 [".Q..",  // Solution 1
  "...Q",
  "Q...",
  "..Q."],

 ["..Q.",  // Solution 2
  "Q...",
  "...Q",
  ".Q.."]
]
 */
public class NQueens {
    public List<String[]> solveNQueens(int n) {
        List<String[]> result = new ArrayList<String[]>();
        int[] ints = new int[n];
        solveNQueuesImpl(ints, 0, n, result);
        return result;
    }

    private void solveNQueuesImpl(int[] ints, int idx, int len, List<String[]> result) {
        if (idx == len) {
            String[] strs = new String[len];
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i != len; i++) {
                for (int j = 0; j != len; j++) {
                    if (j == ints[i]) {
                        sb.append("Q");
                    } else {
                        sb.append(".");
                    }
                }
                strs[i] = sb.toString();
                sb.delete(0, sb.length());
            }
            result.add(strs);
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
                    solveNQueuesImpl(ints, idx + 1, len, result);
                }
            }
        }
    }
}

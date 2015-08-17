package leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Patrick on 15/5/11.
 */
public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        int max = 0;
        Set<List<Integer>> set = new HashSet<List<Integer>>();

        int row = matrix.length, col = matrix[0].length;
        for (int i = 0; i != row; i++) {
            for (int j = 0; j != col; j++) {
                if (matrix[i][j] == '1') {
                    
                }
            }
        }

        return max;
    }
}

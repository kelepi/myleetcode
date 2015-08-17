package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Patrick on 15/4/7.
 */
public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex < 0) {
            return null;
        }
        ArrayList<Integer> result = new ArrayList<Integer>(rowIndex + 1);
        for (int i = 0; i != rowIndex + 1; i++) {
            result.add(0);
        }
        result.set(0, 1);
        for (int i = 1; i < rowIndex + 1; i++) {
            result.set(i, 1);
            for (int j = i - 1; j > 0; j--) {
                result.set(j, result.get(j) + result.get(j - 1));
            }
        }
        return result;
    }
}

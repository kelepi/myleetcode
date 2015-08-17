import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/6/1
 * Time: 16:43
 */
/*
Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

For example, given the following triangle
[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).

Note:
Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.isEmpty()) {
            return 0;
        }
        int len = triangle.get(triangle.size() - 1).size();
        int[] ints = new int[len + 1];

        for (int i = len - 1; i >= 0; i--) {
            List<Integer> row = triangle.get(i);
            for (int j = 0; j != row.size(); j++) {
                ints[j] = Math.min(row.get(j) + ints[j], row.get(j) + ints[j + 1]);
            }
        }
        return ints[0];
    }
}

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/6/1
 * Time: 15:16
 */
/*
Follow up for "Unique Paths":

Now consider if some obstacles are added to the grids. How many unique paths would there be?

An obstacle and empty space is marked as 1 and 0 respectively in the grid.

For example,
There is one obstacle in the middle of a 3x3 grid as illustrated below.

[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
The total number of unique paths is 2.

Note: m and n will be at most 100.
 */
public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0] == null || obstacleGrid[0].length == 0) {
            return 0;
        }
        int[][] counts = new int[obstacleGrid.length][obstacleGrid[0].length];
        // last col
        for (int i = obstacleGrid.length - 1; i >= 0; i--) {
            if (0 == obstacleGrid[i][obstacleGrid[0].length - 1]) {
                counts[i][obstacleGrid[0].length - 1] = 1;
            } else {
                break;
            }
        }
        // last row
        for (int i = obstacleGrid[0].length - 1; i >= 0; i--) {
            if (0 == obstacleGrid[obstacleGrid.length - 1][i]) {
                counts[obstacleGrid.length - 1][i] = 1;
            } else {
                break;
            }
        }
        for (int i = obstacleGrid.length - 2; i >= 0; i--) {
            for (int j = obstacleGrid[0].length - 2; j >= 0; j--) {
                if (obstacleGrid[i][j] == 1) {
                    counts[i][j] = 0;
                } else {
                    counts[i][j] = counts[i + 1][j] + counts[i][j + 1];
                }
            }
        }
        return counts[0][0];
    }
}

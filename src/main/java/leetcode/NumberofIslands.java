package leetcode;

import java.util.Stack;

/**
 * Created by Patrick on 15/5/10.
 */
public class NumberofIslands {
    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int row = grid.length, col = grid[0].length;
        short[][] flag = new short[row][col];
        int cnt = 0;
        Stack<Pos> stack = new Stack<Pos>();
        for (int i = 0; i != row; i++) {
            for (int j = 0; j != col; j++) {
                if (grid[i][j] == '1' && flag[i][j] == 0) {
                    stack.clear();
                    calcOnes(i, j, grid, flag, stack);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private int calcOnes(int i, int j, char[][] matrix, short[][] flag, Stack<Pos> stack) {
        Pos pos = new Pos(i, j);
        flag[i][j] = 1;
        stack.push(pos);
        int cnt = 0;
        while (!stack.empty()) {
            Pos p = stack.pop();
            flag[p.x][p.y] = 2;
            cnt++;
            addNeighbour(p.x, p.y, matrix, flag, stack);
        }
        return cnt;
    }

    private void addNeighbour(int i, int j, char[][] matrix, short[][] flag, Stack<Pos> stack) {
        Pos[] neighbours = {new Pos(i, j - 1), new Pos(i - 1, j), new Pos(i + 1, j), new Pos(i, j + 1)};
        for (Pos neighbour : neighbours) {
            int x = neighbour.x, y = neighbour.y;
            if (x >= 0 && x <= matrix.length - 1 && y >= 0 && y <= matrix[0].length - 1 && matrix[x][y] == '1' && flag[x][y] == 0) {
                stack.add(neighbour);
                flag[x][y] = 1;
            }
        }
    }

    class Pos {
        public final int x;
        public final int y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

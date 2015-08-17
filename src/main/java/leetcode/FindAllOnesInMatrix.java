package leetcode;

import java.util.Stack;

/**
 * Created by Patrick on 15/5/2.
 */
/*
Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle containing all ones and return its area.
 */
public class FindAllOnesInMatrix {
    public int allOnes(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int row = matrix.length, col = matrix[0].length;
        short[][] flag = new short[row][col];
        int max = 0;
        Stack<Pos> stack = new Stack<Pos>();
        for (int i = 0; i != row; i++) {
            for (int j = 0; j != col; j++) {
                if (matrix[i][j] == '1' && flag[i][j] == 0) {
                    stack.clear();
                    int ones = calcOnes(i, j, matrix, flag, stack);
                    max = Math.max(max, ones);
                }
            }
        }
        return max;
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

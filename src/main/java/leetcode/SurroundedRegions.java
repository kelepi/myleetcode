package leetcode;

import java.util.*;

/**
 * Created by Patrick on 15/4/5.
 */
public class SurroundedRegions {
    Set<Pos> curVisited = new HashSet<Pos>();
    List<Pos> todo = new LinkedList<Pos>();

    public void solve(char[][] board) {
        if (board.length == 0) {
            return;
        }
        boolean[][] visited = new boolean[board.length][board[0].length];
        boolean[][] gray = new boolean[board.length][board[0].length];

        for (int i = 0; i != board.length; i++) {
            for (int j = 0; j != board[i].length; j++) {
                if (!visited[i][j] && board[i][j] == 'O') {
                    Pos pos = new Pos(j, i);
                    boolean isSafe = false;
                    todo.add(pos);

                    while (!todo.isEmpty()) {
                        Pos ps = todo.get(0);
                        todo.remove(0);

                        visited[ps.y][ps.x] = true;
                        gray[ps.y][ps.x] = true;
                        curVisited.add(ps);
                        if (ps.isAtEdge(board)) {
                            isSafe = true;
                        }
                        todo.addAll(ps.validSurround(board, visited, gray));
                    }
                    if (!isSafe) {
                        for (Pos p : curVisited) {
                            board[p.y][p.x] = 'X';
                        }
                    }
                    curVisited.clear();
                }
            }
        }
    }

    class Pos {
        int x;
        int y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pos pos = (Pos) o;
            return x == pos.x && y == pos.y;
        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            return result;
        }

        public Pos left() {
            return new Pos(x - 1, y);
        }

        public Pos right() {
            return new Pos(x + 1, y);
        }

        public Pos up() {
            return new Pos(x, y - 1);
        }

        public Pos down() {
            return new Pos(x, y + 1);
        }

        public boolean isValidPos(char[][] board) {
            return x >= 0 && x < board[0].length && y >= 0 && y < board.length;
        }

        public boolean isSafe(char[][] board, boolean[][] visited, boolean[][] gray) {
            return isValidPos(board) && board[y][x] == 'O' && !visited[y][x] && !gray[y][x];
        }

        public boolean isAtEdge(char[][] board) {
            return x == 0 || y == 0 || x == board[0].length - 1 || y == board.length - 1;
        }

        public List<Pos> validSurround(char[][] board, boolean[][] visited, boolean[][] gray) {
            List<Pos> list = new ArrayList<Pos>(4);
            list.add(this.left());
            list.add(this.right());
            list.add(this.up());
            list.add(this.down());

            List<Pos> result = new LinkedList<Pos>();
            for (Pos pos : list) {
                if (pos.isSafe(board, visited, gray)) {
                    result.add(pos);
                    gray[pos.y][pos.x] = true;
                }
            }
            return result;
        }
    }
}

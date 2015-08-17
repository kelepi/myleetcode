import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/15
 * Time: 11:09
 */
/*
Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring.
The same letter cell may not be used more than once.

For example,
Given board =

[
  ["ABCE"],
  ["SFCS"],
  ["ADEE"]
]
word = "ABCCED", -> returns true,
word = "SEE", -> returns true,
word = "ABCB", -> returns false.
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        if (word == null || word.length() == 0 || board == null || board.length == 0 || board[0].length == 0 || board.length * board[0].length < word.length()) {
            return false;
        }
        char c = word.charAt(0);
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        for (int i = 0; i != board.length; i++) {
            for (int j = 0; j != board[0].length; j++) {
                if (board[i][j] == c) {
                    set.clear();
                    if (existImpl(board, word, 1, i, j, set)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean existImpl(char[][] board, String word, int idx, int x, int y, Set<List<Integer>> set) {
        if (idx == word.length()) {
            return true;
        }
        boolean find = false;
        int[][] neighbours = {
                {x - 1, y},
                {x + 1, y},
                {x, y - 1},
                {x, y + 1}
        };
        char c = word.charAt(idx);
        for (int i = 0; i != neighbours.length; i++) {
            int px = neighbours[i][0], py = neighbours[i][1];
            if (set.contains(Arrays.asList(px, py))) {
                continue;
            }
            if (px < 0 || px >= board.length || py < 0 || py >= board[0].length) {
                continue;
            }
            if (board[px][py] == c) {
                set.add(Arrays.asList(x, y));
                find = existImpl(board, word, idx + 1, px, py, set);
            }
            if (find) {
                break;
            } else {
                set.remove(Arrays.asList(x, y));
            }
        }
        return find;
    }
}

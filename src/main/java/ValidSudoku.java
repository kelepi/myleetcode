import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/21
 * Time: 18:49
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length != 9) {
            return false;
        }
        for (int i = 0; i != board.length; i++) {
            if (board[i] == null || board[i].length != 9) {
                return false;
            }
        }
        ArrayList<Set<Character>> xSets = new ArrayList<Set<Character>>();
        ArrayList<Set<Character>> ySets = new ArrayList<Set<Character>>();
        ArrayList<Set<Character>> boxSets = new ArrayList<Set<Character>>();
        for (int i = 0; i != 9; i++) {
            xSets.add(new HashSet<Character>());
            ySets.add(new HashSet<Character>());
            boxSets.add(new HashSet<Character>());
        }


        for (int i = 0; i != board.length; i++) {
            for (int j = 0; j != board[i].length; j++) {
                char c = board[i][j];
                if (c == '.') {
                    continue;
                }
                if (!(c >= '0' && c <= '9')) {
                    return false;
                }
                int box = (i / 3) * 3 + (j / 3);
                Set<Character> xSet = xSets.get(i);
                Set<Character> ySet = ySets.get(j);
                Set<Character> boxSet = boxSets.get(box);

                if (xSet.contains(c) || ySet.contains(c) || boxSet.contains(c)) {
                    return false;
                }
                xSet.add(c);
                ySet.add(c);
                boxSet.add(c);
            }
        }
        return true;
    }
}

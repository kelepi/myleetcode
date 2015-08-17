import org.junit.Test;
import utils.Utils;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/15
 * Time: 11:14
 */
public class TestWordSearch {
    WordSearch w = new WordSearch();

    @Test
    public void testSample() throws Exception {
        String[] strs = {
                "ABCE",
                "SFCS",
                "ADEE"
        };
        char[][] board = Utils.stringMatrixToCharMatrix(strs);
        assert w.exist(board, "ABCCED");
        assert w.exist(board, "SEE");
        assert !w.exist(board, "ABCB");
        assert w.exist(board, "AD");
    }
}

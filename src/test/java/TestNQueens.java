import org.junit.Test;
import utils.Utils;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/19
 * Time: 14:09
 */
public class TestNQueens {
    NQueens nQueens = new NQueens();

    @Test
    public void testSample() throws Exception {
        List<String[]> list = nQueens.solveNQueens(4);
        Utils.printListStringArray(list);

    }
}

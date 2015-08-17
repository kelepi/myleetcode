import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/19
 * Time: 14:22
 */
public class TestNQueensII {
    NQueensII n = new NQueensII();
    NQueens n2 = new NQueens();

    @Test
    public void testSample() throws Exception {
        for (int i = 0; i != 10; i++) {
            System.out.println(i);
            assert n.totalNQueens(i) == n2.solveNQueens(i).size();
        }
    }
}

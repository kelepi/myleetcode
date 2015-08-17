import leetcode.NumberofIslands;
import org.junit.Test;
import utils.Utils;

/**
 * Created by Patrick on 15/5/10.
 */
public class TestNumberofIslands {
    NumberofIslands n = new NumberofIslands();
    @Test
    public void testSample() throws Exception {
        String[] matrix1 = {
                "11110",
                "11010",
                "11000",
                "00000"
        };
        String[] matrix2 = {
                "11000",
                "11000",
                "00100",
                "00011"
        };
        assert 1 ==  n.numIslands(Utils.stringMatrixToCharMatrix(matrix1));
        assert 3 ==  n.numIslands(Utils.stringMatrixToCharMatrix(matrix2));
    }
}

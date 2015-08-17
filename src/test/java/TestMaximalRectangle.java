import org.junit.Test;
import utils.Utils;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/12
 * Time: 9:52
 */
public class TestMaximalRectangle {
    MaximalRectangle m = new MaximalRectangle();

    @Test
    public void testSample(){
        String[] strs = {
                "011110",
                "011101",
                "001111",
                "001111",
                "001111",
                "001111",
        };
        char[][] chars = Utils.stringMatrixToCharMatrix(strs);
        int max = m.maximalRectangle(chars);
        assert max == 16;
    }
}

import org.junit.Test;
import utils.Utils;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/19
 * Time: 9:53
 */
public class TestGrayCode {
    GrayCode grayCode = new GrayCode();
    @Test
    public void testSample() throws Exception {
        List<Integer> list = grayCode.grayCode(3);
        Utils.printIntList(list);
    }
}

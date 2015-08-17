import leetcode.GrayCode;
import org.junit.Test;
import utils.Utils;

import java.util.List;

/**
 * Created by Patrick on 15/5/17.
 */
public class TestGrayCode {
    GrayCode grayCode = new GrayCode();

    @Test
    public void testSample() throws Exception {
        for (int i = -1; i != 5; i++) {
            List<Integer> list = grayCode.grayCode(i);
            Utils.printListInt(list);
        }
    }

    /*
    Input:	3
    Output:	[0,1,3,7,6,4]
    Expected:	[0,1,3,2,6,7,5,4]
     */
    @Test
    public void testError() throws Exception {
        List<Integer> list = grayCode.grayCode(3);
        Utils.printListInt(list);
    }

    @Test
    public void testError2() throws Exception {
        List<Integer> list = grayCode.grayCode(1);
        Utils.printListInt(list);
    }

    @Test
    public void testError3() throws Exception {
        List<Integer> list = grayCode.grayCode(2);
        Utils.printListInt(list);
    }
}

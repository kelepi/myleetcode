import org.junit.Test;
import utils.Utils;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/15
 * Time: 13:03
 */
public class TestCombinations {
    Combinations cb = new Combinations();

    @Test
    public void testSample() throws Exception {
        List<List<Integer>> list = cb.combine(4, 5);
        Utils.printListListInteger(list);
    }
}

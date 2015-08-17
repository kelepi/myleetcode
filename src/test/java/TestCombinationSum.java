import org.junit.Test;
import utils.Utils;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/15
 * Time: 18:52
 */
public class TestCombinationSum {
    CombinationSum cs = new CombinationSum();

    @Test
    public void testSample() throws Exception {
        int[] ints = {1, 2, 3, 6, 7};
        List<List<Integer>> lists = cs.combinationSum(ints, 7);
        Utils.printListListInteger(lists);
    }
}

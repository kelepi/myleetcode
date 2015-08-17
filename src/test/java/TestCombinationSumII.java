import org.junit.Test;
import utils.Utils;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/15
 * Time: 19:16
 */
public class TestCombinationSumII {
    CombinationSumII cs = new CombinationSumII();

    @Test
    public void testSample() throws Exception {
        int[] ints = {1, 1, 2, 3, 6, 7};
        List<List<Integer>> lists = cs.combinationSum2(ints, 7);
        Utils.printListListInteger(lists);
    }

    @Test
    public void testSample2() throws Exception {
        int[] ints = {1, 1};
        List<List<Integer>> lists = cs.combinationSum2(ints, 1);
        Utils.printListListInteger(lists);
    }
}

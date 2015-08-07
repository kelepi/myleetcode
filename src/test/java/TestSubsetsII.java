import org.junit.Test;
import utils.Utils;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/18
 * Time: 18:03
 */
public class TestSubsetsII {
    SubsetsII s = new SubsetsII();

    @Test
    public void testSample() throws Exception {
        int[] nums = {1, 2, 2};
        List<List<Integer>> listList = s.subsetsWithDup(nums);
        Utils.printListListInteger(listList);
    }
}

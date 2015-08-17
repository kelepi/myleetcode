import leetcode.RemoveDuplicatesfromSortedArrayII;
import org.junit.Test;
import utils.Utils;

/**
 * Created by Patrick on 15/5/23.
 */
public class TestRemoveDuplicatesfromSortedArrayII {
    RemoveDuplicatesfromSortedArrayII r = new RemoveDuplicatesfromSortedArrayII();

    @Test
    public void testSample() throws Exception {
        int[][] ints = {
                {1, 1, 1, 2, 2, 3},
                {1},
                {1,1},
                {1,1,1},
                {1,2,3},
                {1,2,2,3},
                {1,2,2,2,3},
                {}
        };
        int[] vals = {5, 1, 2, 2, 3, 4, 4, 0};
        for (int i = 0; i != ints.length; i++) {
            int[] nums = ints[i];
            int len = r.removeDuplicates(nums);
            assert len == vals[i];
            Utils.printIntArray(nums, len);
        }
    }
}

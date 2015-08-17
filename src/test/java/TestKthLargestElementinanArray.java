import leetcode.KthLargestElementinanArray;
import org.junit.Test;
import utils.Utils;

/**
 * Created by Patrick on 15/5/23.
 */
public class TestKthLargestElementinanArray {
    KthLargestElementinanArray k = new KthLargestElementinanArray();

    @Test
    public void testSample() throws Exception {
        int[][] intss = {
                {1},
                {1, 2},
                {3, 2, 1},
                {3, 2, 1, 4},
                {3, 2, 1, 5, 4},
                {3, 2, 1, 5, 6, 4}
        };
        for (int[] ints: intss) {
//            Utils.printIntArray(ints);
            for (int i = 1; i <= ints.length; i++) {
                int m = k.findKthLargest(ints, i);
//                System.out.println(i + "th largest is: " + m);
                assert m == ints.length - i + 1;
            }
        }
    }
}

import leetcode.SortColors;
import org.junit.Test;
import utils.Utils;

/**
 * Created by Patrick on 15/5/23.
 */
public class TestSortColors {
    SortColors s = new SortColors();

    @Test
    public void testSample() throws Exception {
        int[][] intss = {
                {},
                {0},
                {1},
                {2},
                {0, 1},
                {1, 0},
                {0, 2},
                {2, 0},
                {1, 2},
                {2, 1},
                {0, 1, 2},
                {2, 1, 0},
                {0, 2, 1},
                {0, 0, 1, 2},
                {0, 1, 1, 2},
                {0, 1, 2, 2},
                {2, 1, 2, 2},
                {1, 2, 0, 1, 2, 2, 2, 1, 1, 1, 0, 0},
        };
        int[][] valss = {
                {},
                {0},
                {1},
                {2},
                {0, 1},
                {0, 1},
                {0, 2},
                {0, 2},
                {1, 2},
                {1, 2},
                {0, 1, 2},
                {0, 1, 2},
                {0, 1, 2},
                {0, 0, 1, 2},
                {0, 1, 1, 2},
                {0, 1, 2, 2},
                {1, 2, 2, 2},
                {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2},
        };
        for (int i = 0; i != intss.length; i++) {
            int[] ints = intss[i];
            int[] vals = valss[i];
            s.sortColors(ints);
            Utils.printIntArray(ints);
            Utils.printIntArray(vals);
            assert Utils.equalIntArray(ints, vals);
        }
    }

    @Test
    public void testError() throws Exception {
        int[] ints = {0, 1, 2, 2};
        s.sortColors(ints);
        Utils.printIntArray(ints);
    }
}

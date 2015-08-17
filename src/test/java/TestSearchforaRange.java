import object.IntsUtils;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/30
 * Time: 10:03
 */
public class TestSearchforaRange {
    SearchforaRange s = new SearchforaRange();

    @Test
    public void testName() throws Exception {
        int[][] intss = {
                {},
                {5},
                {5, 7},
                {5, 7, 7},
                {5, 7, 7, 8},
                {5, 7, 7, 8, 8},
                {5, 7, 7, 8, 8, 10},
        };

        for (int[] ints : intss) {
            System.out.print("=====\nTest int[]: ");
            IntsUtils.print(ints);
            for (int i = 0; i != 15; i++) {
                System.out.print("Estimate i = " + i);
                IntsUtils.print(s.searchRange(ints, i));
            }
        }
    }

    @Test
    public void testName2() throws Exception {
        int[] ints = {5, 7, 7};
        int i = 7;
        System.out.print("=====\nTest int[]: ");
        IntsUtils.print(ints);
        System.out.print("Estimate i = " + i);
        IntsUtils.print(s.searchRange(ints, i));
    }
}

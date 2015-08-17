import object.IntsUtils;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/29
 * Time: 10:37
 */
public class TestFindMinimuminRotatedSortedArrayII {
    FindMinimuminRotatedSortedArrayII f = new FindMinimuminRotatedSortedArrayII();

    @Test
    public void testSample() throws Exception {
        int[] ints = IntsUtils.makeArray(100);

        for (int k = 0; k != ints.length; k++) {
            int[] sub = IntsUtils.subArray(ints, k);
            for (int i = 0; i != sub.length; i++) {
                int[] n = IntsUtils.rotate(sub, i);
                int min = f.findMin(n);
                assert min == 0;
            }
        }
    }

    @Test
    public void testDuplicateArray() throws Exception {
        int len = 1000;
        for (int d = 0; d != len; d++) {
            int[] dupInts = IntsUtils.makeDuplicateArray(len, d);
            System.out.println("Estimate d=" + d);
            for (int k = 0; k != dupInts.length; k++) {
                int[] sub = IntsUtils.subArray(dupInts, k);
                for (int i = 0; i != sub.length; i++) {
                    int[] n = IntsUtils.rotate(sub, i);
                    int min = f.findMin(n);
                    assert min == 0;
                }
            }
        }
    }

    @Test
    public void testSamplen() throws Exception {
        int[] ints = {3, 0, 0, 2};
        int min = f.findMin(ints);
        System.out.print("Estimate min=" + min + "\n");
        IntsUtils.print(ints);
        assert min == 0;
    }
}

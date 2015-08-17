import object.IntsUtils;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/29
 * Time: 10:37
 */
public class TestFindMinimuminRotatedSortedArray {
    FindMinimuminRotatedSortedArray f = new FindMinimuminRotatedSortedArray();


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
    public void testSamplen() throws Exception {
        int[] ints = {0, 1, 2, 3, 4, 5, 6};

        int[] n = IntsUtils.rotate(ints, 2);
        IntsUtils.print(n);
        int min = f.findMin(n);
        System.out.println("Min = " + min + ", value = " + n[min]);
        assert min == 0;
    }
}

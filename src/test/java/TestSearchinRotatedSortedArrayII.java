import org.junit.Test;
import utils.Utils;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/22
 * Time: 13:44
 */
public class TestSearchinRotatedSortedArrayII {
    SearchinRotatedSortedArrayII s = new SearchinRotatedSortedArrayII();

    @Test
    public void testSample() throws Exception {
        int[] ints = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 8, 9};

        for (int i = 0; i != ints.length; i++) {
            int[] nints = Utils.rotate(ints, i);
            Utils.printIntList(Utils.intArrayToList(nints));
            assert s.search(nints, 3);
        }
    }

    @Test
    public void testRotate() throws Exception {
        int[] ints = {1, 2, 3};
        for (int i = 0; i != ints.length; i++) {
            Utils.printIntList(Utils.intArrayToList(Utils.rotate(ints, i)));
        }

    }
}

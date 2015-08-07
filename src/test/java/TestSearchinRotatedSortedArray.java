import object.IntsUtils;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/30
 * Time: 15:40
 */
public class TestSearchinRotatedSortedArray {
    SearchinRotatedSortedArray s = new SearchinRotatedSortedArray();

    @Test
    public void testSample() throws Exception {
        int[] ints = {0, 1, 2, 4, 5, 6, 7};
        int[] n = IntsUtils.rotate(ints, 3);
        IntsUtils.print(n);
        for (int i = 0; i != 8; i++) {
            int idx = s.search(n, i);
            System.out.println("Estimate i = " + i + ", idx = " + idx);
        }
    }

    @Test
    public void testSample2() throws Exception {
        int[] ints = {4, 5, 6, 7, 0, 1, 2};
        IntsUtils.print(ints);
        int i = 0;
        int idx = s.search(ints, i);
        System.out.println("Estimate i = " + i + ", idx = " + idx);
    }

    @Test
    public void testSample3() throws Exception {
        int[] ints = {0, 1};
        IntsUtils.print(ints);
        int i = 1;
        int idx = s.search(ints, i);
        System.out.println("Estimate i = " + i + ", idx = " + idx);
    }

    @Test
    public void testHeavy() throws Exception {
        int len = 100;
        int[] ints = IntsUtils.makeArray(len);

        for (int k = 0; k != ints.length; k++) {
            int[] sub = IntsUtils.subArray(ints, k);
            for (int i = 0; i != sub.length; i++) {
                int[] n = IntsUtils.rotate(sub, i);
                for (int j = 0; j != k; j++) {
                    int idx = s.search(n, j);
                    assert idx == (j + i) % k;
                }
            }
        }
    }
}

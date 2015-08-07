import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/22
 * Time: 10:25
 */
public class TestFindPeakElement {
    FindPeakElement f = new FindPeakElement();

    @Test
    public void testError() throws Exception {
        int[][] ints = {
                {1},
                {2,1},
        };
        int[] v = {0, 0};
        for (int i = 0; i != ints.length; i++) {
            assert v[i] == f.findPeakElement(ints[i]);
        }
    }

    @Test
    public void testSample01() throws Exception {
        int[][] ints = {
                {1, 2, 3},
                {1, 3, 2},
                {3, 2, 1},
        };
        int[] v = {2, 1, 0};
        for (int i = 0; i != ints.length; i++) {
            assert v[i] == f.findPeakElement(ints[i]);
        }
    }
    @Test
    public void testSample00() throws Exception {
        int[][] ints = {
                {1, 2},
                {2, 1},
                {1, 1},
        };
        int[] v = {1, 0, -1};
        for (int i = 0; i != ints.length; i++) {
            assert v[i] == f.findPeakElement(ints[i]);
        }
    }
    @Test
    public void testSample0000() throws Exception {
        int[][] ints = {
                {}
        };
        int[] v = {-1};
        for (int i = 0; i != ints.length; i++) {
            assert v[i] == f.findPeakElement(ints[i]);
        }
    }
    @Test
    public void testSample02() throws Exception {
        int[][] ints = {
                {1, 2, 3, 1},
                {1, 3, 2, 1},
                {3, 2, 1, 1},
                {1, 1, 2, 3},
                {1, 4, 2, 3},
                {3, 2, 4, 1},
        };
        int[] v = {2, 1, 0, 3, 1, 2};
        for (int i = 0; i != ints.length; i++) {
            assert v[i] == f.findPeakElement(ints[i]);
        }
    }
}

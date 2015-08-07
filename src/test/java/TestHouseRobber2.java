import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/4
 * Time: 15:55
 */
public class TestHouseRobber2 {
    HouseRobberII hr2 = new HouseRobberII();

    @Test
    public void testSample0() throws Exception {
        int[] ints = {};
        assert hr2.rob(ints) == 0;
    }

    @Test
    public void testSample1() throws Exception {
        int[] ints = {2};
        assert hr2.rob(ints) == 2;
    }

    @Test
    public void testSample2() throws Exception {
        int[] ints = {2, 1};
        assert hr2.rob(ints) == 2;
    }

    @Test
    public void testSample22() throws Exception {
        int[] ints = {1, 1};
        assert hr2.rob(ints) == 1;
    }

    @Test
    public void testSample23() throws Exception {
        int[] ints = {1, 2};
        assert hr2.rob(ints) == 2;
    }

    @Test
    public void testSample31() throws Exception {
        int[] ints = {2, 3, 2};
        assert hr2.rob(ints) == 3;
    }

    @Test
    public void testSample32() throws Exception {
        int[] ints = {2, 5, 2};
        assert hr2.rob(ints) == 5;
    }

    @Test
    public void testSample33() throws Exception {
        int[] ints = {2, 4, 2};
        assert hr2.rob(ints) == 4;
    }

    @Test
    public void testSample41() throws Exception {
        int[] ints = {2, 4, 2, 3};
        assert hr2.rob(ints) == 7;
    }

    @Test
    public void testSample42() throws Exception {
        int[] ints = {2, 4, 7, 3};
        assert hr2.rob(ints) == 9;
    }

    @Test
    public void testSample43() throws Exception {
        int[] ints = {22, 4, 7, 3};
        assert hr2.rob(ints) == 29;
    }

    /*
Input:	[1,3,1,3,100]
Output:	6
Expected:	103
     */
    @Test
    public void testError() throws Exception {
        int[] ints = {1, 3, 1, 3, 100};
        assert hr2.rob(ints) == 103;
    }

    /*
    [94, 40, 49, 65, 21, 21, 106, 80, 92, 81, 679, 4, 61, 6, 237, 12, 72, 74, 29, 95, 265, 35, 47, 1, 61, 397, 52, 72, 37, 51, 1, 81, 45, 435, 7, 36, 57, 86, 81, 72]
     */
    @Test
    public void testError2() throws Exception {
        int[] ints = {94, 40, 49, 65, 21, 21, 106, 80, 92, 81, 679, 4, 61, 6, 237, 12, 72, 74, 29, 95, 265, 35, 47, 1, 61, 397, 52, 72, 37, 51, 1, 81, 45, 435, 7, 36, 57, 86, 81, 72};
        assert hr2.rob(ints) == 2926;
    }

    /*
    Input:	[4,1,2,7,5,3,1]
Output:	11
Expected:	14
     */
    @Test
    public void testError3() throws Exception {
        int[] ints = {4, 1, 2, 7, 5, 3, 1};
        assert hr2.rob(ints) == 14;
    }
}

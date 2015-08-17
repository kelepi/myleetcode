import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/4
 * Time: 15:55
 */
public class TestHouseRobber {
    HouseRobber hr = new HouseRobber();

    @Test
    public void testSample0() throws Exception {
        int[] ints = {};
        assert hr.rob(ints) == 0;

    }

    @Test
    public void testSample1() throws Exception {
        int[] ints = {2};
        assert hr.rob(ints) == 2;

    }

    @Test
    public void testSample2() throws Exception {
        int[] ints = {2, 1};
        assert hr.rob(ints) == 2;

    }

    @Test
    public void testSample22() throws Exception {
        int[] ints = {1, 1};
        assert hr.rob(ints) == 1;

    }

    @Test
    public void testSample23() throws Exception {
        int[] ints = {1, 2};
        assert hr.rob(ints) == 2;

    }

    @Test
    public void testSample31() throws Exception {
        int[] ints = {2, 3, 2};
        assert hr.rob(ints) == 4;

    }

    @Test
    public void testSample32() throws Exception {
        int[] ints = {2, 5, 2};
        assert hr.rob(ints) == 5;

    }

    @Test
    public void testSample33() throws Exception {
        int[] ints = {2, 4, 2};
        assert hr.rob(ints) == 4;

    }

    @Test
    public void testSample41() throws Exception {
        int[] ints = {2, 4, 2, 3};
        assert hr.rob(ints) == 7;

    }
    @Test
    public void testSample42() throws Exception {
        int[] ints = {2, 4, 7, 3};
        assert hr.rob(ints) == 9;

    }
    @Test
    public void testSample43() throws Exception {
        int[] ints = {22, 4, 7, 3};
        assert hr.rob(ints) == 29;

    }
}

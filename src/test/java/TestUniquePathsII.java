import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/6/1
 * Time: 15:51
 */
public class TestUniquePathsII {
    UniquePathsII u = new UniquePathsII();

    @Test
    public void testSample() throws Exception {
        int[][] ints = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        assert 2 == u.uniquePathsWithObstacles(ints);
    }

    @Test
    public void testSample2() throws Exception {
        int[][] ints = {
                {0, 0, 0, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}
        };
        assert 2 == u.uniquePathsWithObstacles(ints);
    }

    @Test
    public void testSample3() throws Exception {
        int[][] ints = {
                {0, 1},
                {0, 0}
        };
        assert 1 == u.uniquePathsWithObstacles(ints);
    }

    @Test
    public void testSample4() throws Exception {
        int[][] ints = {
                {0, 1},
        };
        assert 0 == u.uniquePathsWithObstacles(ints);
    }
}

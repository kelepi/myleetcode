import leetcode.ContainsDuplicateIII;
import org.junit.Test;

/**
 * Created by Patrick on 15/6/30.
 */
public class TestContainsDuplicateIII {
    ContainsDuplicateIII c = new ContainsDuplicateIII();

    @Test
    public void testSample() throws Exception {
        int[] ints = {7, 1, 3};
        assert c.containsNearbyAlmostDuplicate(ints, 2, 3);
    }

    @Test
    public void testSample2() throws Exception {
        int[] ints = {-3, 3};
        assert !c.containsNearbyAlmostDuplicate(ints, 2, 4);
    }

    @Test
    public void testSample3() throws Exception {
        int[] ints = {1, 2, 1};
        assert c.containsNearbyAlmostDuplicate(ints, 1, 1);
    }

    @Test
    public void testSample4() throws Exception {
        int[] ints = {-1, -1};
        assert c.containsNearbyAlmostDuplicate(ints, 1, 0);
    }

    @Test
    public void testSample5() throws Exception {
        int[] ints = {-1,2147483647};
        assert !c.containsNearbyAlmostDuplicate(ints, 1, 2147483647);
    }
}

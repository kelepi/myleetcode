import leetcode.ContainsDuplicateII;
import org.junit.Test;

/**
 * Created by Patrick on 15/6/13.
 */
public class TestContainsDuplicateII {
    ContainsDuplicateII c = new ContainsDuplicateII();

    @Test
    public void testSample() throws Exception {
        int[] ints = {-1, 0, -1};
        assert !c.containsNearbyDuplicate(ints, 1);
        assert c.containsNearbyDuplicate(ints, 2);
    }
}

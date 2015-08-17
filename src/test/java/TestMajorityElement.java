import leetcode.MajorityElement;
import org.junit.Test;

/**
 * Created by Patrick on 15/4/11.
 */
public class TestMajorityElement {
    @Test
    public void testSample() throws Exception {
        int[] ints = {1,2,3,2,1,2};
        MajorityElement m = new MajorityElement();
        assert m.majorityElement(ints) == 2;
    }
}

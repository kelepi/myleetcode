import leetcode.MinimumWindowSubstring;
import org.junit.Test;

/**
 * Created by Patrick on 15/6/25.
 */
public class TestMinimumWindowSubstring {
    @Test
    public void testSample() throws Exception {
        MinimumWindowSubstring m = new MinimumWindowSubstring();
        String r = m.minWindow("ADOBECODEBANC", "ABC");
        System.out.println(r);
    }
}

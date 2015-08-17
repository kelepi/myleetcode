import leetcode.LongestCommonPrefix;
import org.junit.Test;

/**
 * Created by Patrick on 15/4/14.
 */
public class TestLongestCommonPrefix {
    @Test
    public void testSample() throws Exception {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] strs = {"good", "goodate", "goo"};
        String[] strs1 = {"good", "goodate", ""};
        String[] strs2 = {"good", "good", "good"};
        String[] strs3 = {"good", "goodate", "good"};
        String[] strs4 = {"asdf", "goodate", "goo"};
        String[] strs5 = {"", "goodate", "asdf"};
        String[] strs6 = {};
        assert lcp.longestCommonPrefix(strs).equals("goo");
        assert lcp.longestCommonPrefix(strs1).equals("");
        assert lcp.longestCommonPrefix(strs2).equals("good");
        assert lcp.longestCommonPrefix(strs3).equals("good");
        assert lcp.longestCommonPrefix(strs4).equals("");
        assert lcp.longestCommonPrefix(strs5).equals("");
        assert lcp.longestCommonPrefix(strs6) == null;
    }
}

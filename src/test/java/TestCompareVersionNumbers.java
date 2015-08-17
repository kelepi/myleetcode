import leetcode.CompareVersionNumbers;
import org.junit.Test;

/**
 * Created by Patrick on 15/4/11.
 */
public class TestCompareVersionNumbers {
    @Test
    public void test1() throws Exception {
        CompareVersionNumbers c = new CompareVersionNumbers();
        assert c.compareVersion("1", "1") == 0;
        assert c.compareVersion("1.2", "1.2") == 0;
        assert c.compareVersion("1.2.3", "1.2.3") == 0;
        assert c.compareVersion("1.2", "1.2.3") == -1;
        assert c.compareVersion("1.2", "1.3") == -1;
        assert c.compareVersion("1.3", "1.2") == 1;
        assert c.compareVersion("1.2.1", "1.2") == 1;
    }

    @Test
    public void testSplit() throws Exception {
        String[] strs = "1.2.3".split("\\.");
        assert strs.length == 3;
        assert Integer.parseInt(strs[0].trim()) == 1;
        assert Integer.parseInt(strs[1].trim()) == 2;
        assert Integer.parseInt(strs[2].trim()) == 3;
    }

    @Test
    public void testError() throws Exception {
        CompareVersionNumbers c = new CompareVersionNumbers();
        assert c.compareVersion("1.0.0", "1") == 0;
    }

    @Test
    public void testError2() throws Exception {
        CompareVersionNumbers c = new CompareVersionNumbers();
        assert c.compareVersion("0.0.0", "0.0") == 0;
    }

    @Test
    public void testError3() throws Exception {
        CompareVersionNumbers c = new CompareVersionNumbers();
        assert c.compareVersion("", "0") == 0;
    }

    @Test
    public void testError4() throws Exception {
        String a = "19.8.3.17.5.01.0.0.4.0.0.0.0.0.0.0.0.0.0.0.0.0.00.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.000000.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.000000";
        String b = "19.8.3.17.5.01.0.0.4.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0000.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.000000";

        CompareVersionNumbers c = new CompareVersionNumbers();
        assert c.compareVersion(a, b) == 0;
    }
}

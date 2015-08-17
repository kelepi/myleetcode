package lintcode.sort;

import lintcode.LintCodeUtils;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/8/7
 * Time: 18:37
 */
public class TestStringSorter {
    @Test
    public void testSample() throws Exception {
        assert LintCodeUtils.stringSorter("ffddsssa").equals("addffsss");
    }
}

import org.junit.Test;
import utils.Utils;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/19
 * Time: 13:34
 */
public class TestPalindromePartitioning {
    PalindromePartitioning p = new PalindromePartitioning();

    @Test
    public void testSample() throws Exception {
//        Utils.printStringStringList(p.partition("aab"));
        Utils.printStringStringList(p.partition("abaaba"));
    }
}

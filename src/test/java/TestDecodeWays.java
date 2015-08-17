import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/6/1
 * Time: 10:43
 */
public class TestDecodeWays {
    DecodeWays d = new DecodeWays();

    @Test
    public void testSample() throws Exception {
        assert d.numDecodings("") == 0;
        assert d.numDecodings("0") == 0;
        assert d.numDecodings("03") == 0;
        assert d.numDecodings("230") == 0;
        assert d.numDecodings("1") == 1;
        assert d.numDecodings("12") == 2;
        assert d.numDecodings("123") == 3;
        assert d.numDecodings("201010") == 1;
    }

    @Test
    public void testError() throws Exception {
        assert d.numDecodings("1010") == 1;
    }
}

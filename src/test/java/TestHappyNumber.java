import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/22
 * Time: 9:43
 */
public class TestHappyNumber {
    @Test
    public void testSample() throws Exception {
        HappyNumber hn = new HappyNumber();
        assert hn.isHappy(1);
        assert hn.isHappy(100000);
        assert hn.isHappy(100900);
        assert hn.isHappy(19);
        assert hn.isHappy(82);
        assert !hn.isHappy(18);
    }
}

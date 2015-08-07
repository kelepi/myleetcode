import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/4
 * Time: 13:50
 */
public class TestCountPrimes {
    CountPrimes cp = new CountPrimes();

    @Test
    public void testSample() throws Exception {
        assert cp.countPrimes(0) == 0;
        assert cp.countPrimes(1) == 0;
        assert cp.countPrimes(2) == 0;
        assert cp.countPrimes(3) == 1;
        assert cp.countPrimes(5) == 2;
        assert cp.countPrimes(7) == 3;
        assert cp.countPrimes(29) == 9;
        assert cp.countPrimes(30) == 10;
        assert cp.countPrimes(126) == 30;
    }

    @Test
    public void testError() throws Exception {
        assert cp.countPrimes(126) == 30;
    }
}

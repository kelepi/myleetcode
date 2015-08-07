import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/22
 * Time: 14:27
 */
public class TestPowXN {
    PowXN p = new PowXN();

    @Test
    public void testSample() throws Exception {
        for (int i = -5; i != 5; i++) {
            System.out.println(p.myPow(2.0, i));
        }
        for (int i = -5; i != 5; i++) {
            System.out.println(p.myPow(-2.0, i));
        }
    }

    /*
    Input:	-1.00000, -2147483648
Output:	-1.00000
Expected:	1.00000
     */
    @Test
    public void testError() throws Exception {
        System.out.println(p.myPow(-1.00000, Integer.MIN_VALUE));
    }
}

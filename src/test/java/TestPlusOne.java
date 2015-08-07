import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/4
 * Time: 10:23
 */
public class TestPlusOne {
    PlusOne p = new PlusOne();

    @Test
    public void testSample() throws Exception {
        int[] a = {1,1,9};
        int[] b = p.plusOne(a);
        for (int i: b) {
            System.out.print(i);
        }
    }
}

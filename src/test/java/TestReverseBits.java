import leetcode.ReverseBits;
import org.junit.Test;
import utils.Utils;

/**
 * Created by Patrick on 15/4/11.
 */
public class TestReverseBits {
    @Test
    public void testSample() throws Exception {
        ReverseBits reverseBits = new ReverseBits();
        int i = 43261596;
        int j = reverseBits.reverseBits(i);
        Utils.printBits(i, 32);
        Utils.printBits(j, 32);
        assert j == 964176192;
    }

    @Test
    public void test1() throws Exception {
        ReverseBits reverseBits = new ReverseBits();
        int i = 1;
        int j = reverseBits.reverseBits(i);
        Utils.printBits(i, 32);
        Utils.printBits(j, 32);
//        assert j == 2147483648;
    }
}

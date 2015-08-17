import leetcode.BitwiseANDofNumbersRange;
import org.junit.Test;
import utils.Utils;

/**
 * Created by Patrick on 15/5/10.
 */
public class TestBitwiseANDofNumbersRange {
    BitwiseANDofNumbersRange bitwiseANDofNumbersRange = new BitwiseANDofNumbersRange();

    @Test
    public void testBasic() throws Exception {
        Utils.printBytesArray(Utils.intToBytesArray(5));
        Utils.printBytesArray(Utils.intToBytesArray(2147483647));
    }

    @Test
    public void testSample() throws Exception {
        for (int i = 5; i <= 7; i++) {
            Utils.printBits(i, 4);
        }
        assert bitwiseANDofNumbersRange.rangeBitwiseAnd(5, 7) == 4;
        assert bitwiseANDofNumbersRange.rangeBitwiseAnd(0, 0) == 0;
        assert bitwiseANDofNumbersRange.rangeBitwiseAnd(0, 1) == 0;
        assert bitwiseANDofNumbersRange.rangeBitwiseAnd(1, 1) == 1;
        assert bitwiseANDofNumbersRange.rangeBitwiseAnd(1, 2) == 0;
        assert bitwiseANDofNumbersRange.rangeBitwiseAnd(1, 3) == 0;
    }

    @Test
    public void testCase() throws Exception {
        int m = bitwiseANDofNumbersRange.rangeBitwiseAnd(0, 2147483647);
        System.out.println(m);
    }
    @Test
    public void testCase2() throws Exception {
        assert bitwiseANDofNumbersRange.rangeBitwiseAnd(5, 5) == 5;
    }
}

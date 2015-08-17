import leetcode.Numberof1Bits;
import org.junit.Test;

/**
 * Created by Patrick on 15/4/8.
 */
public class TestNumberof1Bits {
    @Test
    public void testSample() throws Exception {
        Numberof1Bits numberof1Bits = new Numberof1Bits();
        assert numberof1Bits.hammingWeight(11) == 3;
        assert numberof1Bits.hammingWeight(0) == 0;
        assert numberof1Bits.hammingWeight(1) == 1;
        assert numberof1Bits.hammingWeight(2) == 1;
        assert numberof1Bits.hammingWeight(3) == 2;
        assert numberof1Bits.hammingWeight(2147483647) == 31;
        int a = 2147483647;
        System.out.println(a);
        while (a != 0) {
            System.out.print(a%2);
            a >>= 1;
        }
//        assert numberof1Bits.hammingWeight(789012340567) == 10;
    }
}

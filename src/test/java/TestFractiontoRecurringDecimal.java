import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/22
 * Time: 9:52
 */
public class TestFractiontoRecurringDecimal {
    @Test
    public void testName() throws Exception {
        FractiontoRecurringDecimal f = new FractiontoRecurringDecimal();
        assert f.fractionToDecimal(5, 3).equals("1.(6)");
        assert f.fractionToDecimal(5, 30).equals("0.1(6)");
        assert f.fractionToDecimal(50, 3).equals("16.(6)");
        assert f.fractionToDecimal(5, 13).equals("0.(384615)");
        assert f.fractionToDecimal(5, 130).equals("0.0(384615)");
        assert f.fractionToDecimal(50, 13).equals("3.(846153)");
        assert f.fractionToDecimal(4, 2).equals("2");
        assert f.fractionToDecimal(4, 8).equals("0.5");
        assert f.fractionToDecimal(-50, 8).equals("-6.25");
        assert f.fractionToDecimal(-22, -2).equals("11");
        assert f.fractionToDecimal(7, -12).equals("-0.58(3)");
        assert f.fractionToDecimal(-2147483648, 1).equals("-2147483648");
        assert f.fractionToDecimal(0, 1).equals("0");
        assert f.fractionToDecimal(0, 0).equals("");
        assert f.fractionToDecimal(1, 0).equals("");
    }
}

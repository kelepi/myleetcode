import leetcode.StringtoInteger;
import org.junit.Test;

/**
 * Created by Patrick on 15/4/14.
 */
public class TestStringtoInteger {
    @Test
    public void testSample() throws Exception {
        StringtoInteger soi = new StringtoInteger();
        assert 0 == soi.myAtoi("");
        assert 0 == soi.myAtoi("  ");
        assert 32 == soi.myAtoi("32");
        assert 32 == soi.myAtoi("  32");
        assert 32 == soi.myAtoi("  32asdf");
        assert -32 == soi.myAtoi("-32");
        assert -32 == soi.myAtoi("  -32");
        assert -32 == soi.myAtoi("  -32asdf");
        assert 5432156 == soi.myAtoi("5432156");
        assert 5432156 == soi.myAtoi("5432156asdf");
        assert 5432156 == soi.myAtoi("    5432156asdf");
        assert Integer.MAX_VALUE == soi.myAtoi("    21474836478");
        assert Integer.MIN_VALUE == soi.myAtoi("    -2147483649");
        assert 0 == soi.myAtoi("+-2");
        assert 0 == soi.myAtoi("+ 2");
        assert Integer.MAX_VALUE == soi.myAtoi("    10522545459");
    }
}

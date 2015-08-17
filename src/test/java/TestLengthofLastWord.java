import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/4
 * Time: 10:03
 */
public class TestLengthofLastWord {
    LengthofLastWord l = new LengthofLastWord();

    @Test
    public void testSample() throws Exception {
        assert l.lengthOfLastWord("") == 0;
        assert l.lengthOfLastWord("a") == 1;
        assert l.lengthOfLastWord("     a") == 1;
        assert l.lengthOfLastWord("a     ") == 1;
        assert l.lengthOfLastWord("     a     ") == 1;
        assert l.lengthOfLastWord("ab") == 2;
        assert l.lengthOfLastWord("   ab") == 2;
        assert l.lengthOfLastWord("ab   ") == 2;
        assert l.lengthOfLastWord("   ab   ") == 2;
        assert l.lengthOfLastWord("ab c") == 1;
        assert l.lengthOfLastWord("ab    abcde   ") == 5;
    }
}

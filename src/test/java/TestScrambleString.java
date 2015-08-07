import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/6/5
 * Time: 16:00
 */
public class TestScrambleString {
    ScrambleString s = new ScrambleString();
    @Test
    public void testSample() throws Exception {
        assert s.isScramble("great", "rgeat");
        assert s.isScramble("great", "rgtae");
        assert !s.isScramble("abcdefghijklmnopq", "efghijklmnopqcadb");
    }
}

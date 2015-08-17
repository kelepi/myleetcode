import leetcode.WildcardMatching;
import org.junit.Test;
import sun.reflect.generics.tree.Wildcard;

/**
 * Created by Patrick on 15/5/14.
 */
public class TestWildcardMatching {
    WildcardMatching w = new WildcardMatching();

    @Test
    public void testSample() throws Exception {
        assert !w.isMatch("aa","a");
        assert w.isMatch("aa","aa");
        assert !w.isMatch("aaa","aa");
        assert w.isMatch("aa", "*");
        assert w.isMatch("aa", "a*");
        assert w.isMatch("ab", "?*");
        assert !w.isMatch("aab", "c*a*b");
    }

    @Test
    public void testRec() throws Exception {
        assert !w.isMatch("aa","a");
    }

    @Test
    public void testError() throws Exception {
        assert w.isMatch("hi", "*?");
    }

    @Test
    public void testTLE() throws Exception {
        assert w.isMatch("abefcdgiescdfimde", "ab*cd?i*de");
    }
}

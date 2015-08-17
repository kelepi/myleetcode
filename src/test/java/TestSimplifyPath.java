import leetcode.SimplifyPath;
import org.junit.Test;

/**
 * Created by Patrick on 15/5/2.
 */
public class TestSimplifyPath {
    SimplifyPath s = new SimplifyPath();

    @Test
    public void testSample() throws Exception {
        assert s.simplifyPath("/home/").equals("/home");
        assert s.simplifyPath("/a/./b/../../c/").equals("/c");
        assert s.simplifyPath("/").equals("/");
        assert s.simplifyPath("/abc/./../").equals("/");
        assert s.simplifyPath("/abc/./..").equals("/");
        assert s.simplifyPath("/abc/./././..").equals("/");
        assert s.simplifyPath("/abc/./asdf/asdf/../../../").equals("/");
        assert s.simplifyPath("/home//foo/").equals("/home/foo");
        assert s.simplifyPath("/../").equals("/");
    }
}

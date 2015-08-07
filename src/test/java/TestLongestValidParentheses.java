import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/6/2
 * Time: 15:34
 */
public class TestLongestValidParentheses {
    LongestValidParentheses l = new LongestValidParentheses();

    @Test
    public void testSample() throws Exception {
        assert l.longestValidParentheses("(()") == 2;
        assert l.longestValidParentheses(")()())") == 4;
        assert l.longestValidParentheses("()") == 2;
    }

    @Test
    public void testError() throws Exception {
        assert l.longestValidParentheses(")()())()()(") == 4;
    }
}

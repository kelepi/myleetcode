import leetcode.ValidParentheses;
import org.junit.Test;

/**
 * Created by Patrick on 15/4/8.
 */
public class TestValidParentheses {
    @Test
    public void testSample() throws Exception {
        ValidParentheses validParentheses = new ValidParentheses();
        assert validParentheses.isValid("()[]{}");
    }

    @Test
    public void testSample2() throws Exception {
        ValidParentheses validParentheses = new ValidParentheses();
        assert validParentheses.isValid("()");
    }

    @Test
    public void testSample3() throws Exception {
        ValidParentheses validParentheses = new ValidParentheses();
        assert !validParentheses.isValid("(]");
    }

    @Test
    public void testSample4() throws Exception {
        ValidParentheses validParentheses = new ValidParentheses();
        assert !validParentheses.isValid("([)]");
    }

    @Test
    public void testError() throws Exception {
        ValidParentheses validParentheses = new ValidParentheses();
        assert validParentheses.isValid("([])");
    }

    @Test
    public void testError2() throws Exception {
        ValidParentheses validParentheses = new ValidParentheses();
        assert !validParentheses.isValid("]");
    }

    @Test
    public void testError3() throws Exception {
        ValidParentheses validParentheses = new ValidParentheses();
        assert !validParentheses.isValid("[");
    }

    @Test
    public void testError4() throws Exception {
        ValidParentheses validParentheses = new ValidParentheses();
        assert !validParentheses.isValid("[][");
    }

    @Test
    public void testError5() throws Exception {
        ValidParentheses validParentheses = new ValidParentheses();
        assert !validParentheses.isValid("][]");
    }

    @Test
    public void testError6() throws Exception {
        ValidParentheses validParentheses = new ValidParentheses();
        assert !validParentheses.isValid("]})");
    }

    @Test
    public void testError7() throws Exception {
        ValidParentheses validParentheses = new ValidParentheses();
        assert !validParentheses.isValid("({]})");
    }
}
